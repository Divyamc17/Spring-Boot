package com.xworkz.repository;

import java.util.List;
import java.util.logging.Logger;

import static com.xworkz.logger.Loggers.getLogger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.dto.CustomerDTO;

@Repository

public class CustomerRepositoryImpl implements CustomerRepository {

	
	@Autowired
	private EntityManagerFactory factory;
	private Logger logger = getLogger();

	@Override
	public boolean save(CustomerDTO dto) {
		logger.info("save method running in Customer repository");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(dto);
			transaction.commit();
			System.out.println(dto);
		} catch (PersistenceException e) {
			e.printStackTrace();
			
		}finally {
			manager.close();
		}
		
		return true;
	}

	@Override
	public List<CustomerDTO> findByName(String name) {
		logger.info("find by name running cust");
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName1");
			query.setParameter("nm", name);
			List resultList = query.getResultList();
		if(resultList != null) {
			logger.info("not empty"+resultList);
			return resultList;
		}else {
			logger.info("data is empty"+resultList);
			return null;
		}
		} catch (PersistenceException e) {
			
			e.printStackTrace();
		}finally {
		manager.close();
		}
		return null;
	}

	@Override
	public List<CustomerDTO> findByEmail(String email) {
		EntityManager createEntityManager = factory.createEntityManager();
		try {
			Query query = createEntityManager.createNamedQuery("findByEmail");
			query.setParameter("em", email);
			List resultList = query.getResultList();
			if(resultList.isEmpty()) {
				logger.info("not empty email"+resultList);
				return null;
			}else if(!resultList.isEmpty()){
				logger.info("data is empty"+resultList);
				return resultList;
			}
		} catch (PersistenceException e) {
		
			e.printStackTrace();
		}finally {
			createEntityManager.close();
		}
		return null;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<CustomerDTO> findByMobileNo(long mobileNo) {
		EntityManager createEntityManager = factory.createEntityManager();
		try {
			Query query = createEntityManager.createNamedQuery("findByMobileNo");
			query.setParameter("mb", mobileNo);
			List resultList = query.getResultList();
			if(resultList.isEmpty()) {
				logger.info("not emty mobile"+resultList);
				return null;
			}else if(resultList.isEmpty()){
				logger.info("data is empty"+resultList);
				return resultList;
			}
		} catch (PersistenceException e) {
			
			e.printStackTrace();
		}finally {
			createEntityManager.close();
		}
		return null;
	}
	
	
}
