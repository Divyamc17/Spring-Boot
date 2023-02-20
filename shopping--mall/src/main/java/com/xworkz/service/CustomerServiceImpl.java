package com.xworkz.service;

import static com.xworkz.logger.Loggers.getLogger;

import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Logger;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dto.CustomerDTO;
import com.xworkz.repository.CustomerRepository;

@Service
public class CustomerServiceImpl  implements CustomerService{

	
	
	@Autowired
	private CustomerRepository repository;
	private Logger logger = getLogger();

	@Override
	public boolean validateAndSave(CustomerDTO dto) {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<CustomerDTO>> validate = validator.validate(dto);
		if(validate.size()>0) {
			logger.info("error in data please fix"+validate.size() + validate.getClass());
		}else {
			logger.info("Data saved successfully");
			repository.save(dto);
			sendMail(dto.getEmail());
			logger.info("Mail is sent to the customer");
		}
		
		return true;
	}

	@Override
	public List<CustomerDTO> findByName(String name) {
		
		return repository.findByName(name);
	}

	@Override
	public boolean findByEmail(String email) {
		List<CustomerDTO> findByEmail = repository.findByEmail(email);
		if(findByEmail != null) {
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public boolean findByMobileNo(long mobileNo) {
		List<CustomerDTO> findByMobileNo = repository.findByMobileNo(mobileNo);
		if(findByMobileNo != null) {
			System.out.println("mobile");
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public boolean sendMail(String email) {

		final String username = "DadaNimbalakar@outlook.com";
		final String password = "Dada@1993";

		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp-mail.outlook.com");
		properties.put("mail.smtp.port", "587");
		// Session is class reprez
		Session session = Session.getInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);

			}
		});
		session.setDebug(true);

		try {
			// Message is abstract class
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
			message.setSubject("FeedBack Confirmation");
			message.setText("Thank you for giving feedback. have a great day");
			Transport.send(message);

			logger.info("Message Done");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

		return true;
	}
	
	
}
