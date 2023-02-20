package com.xworkz.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="personal_details")
@NamedNativeQuery(name = "findByName1", query = "SELECT feedback_details.* \r\n" 
        + "FROM feedback_details \r\n"
        + "left JOIN personal_details \r\n" + "ON feedback_details.feedback_id = personal_details.feedback_id\r\n"
         + "where personal_details.name=:nm",resultClass = CustomerFeedBackDTO.class)
@NamedQuery(name = "findByEmail", query = "select cust from CustomerDTO cust where cust.email=:em")
@NamedQuery(name = "findByMobileNo", query = "select cust from CustomerDTO cust where cust.mobileNo=:mb")


public class CustomerDTO implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_id;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	@Column(name = "Name")
	private String name;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	@Email
	@Column(name = "Email")
	private String email;
	@Column(name = "Mobile_No")
	private long mobileNo;
	@Column(name = "Age")
	private int age;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	@Column(name = "Country")
	private String country;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	@Column(name = "State")
	private String state;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	@Column(name = "City")
	private String city;
	@Column(name = "Pin_Code")
	private int pincode;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn( name ="feedback_id")
	private CustomerFeedBackDTO feedBackDTO;
	
	
	public CustomerDTO(@NotNull @NotEmpty @Size(min = 3, max = 50) String name,
			@NotNull @NotEmpty @Size(min = 3, max = 50) @Email String email, long mobileNo, int age,
			@NotNull @NotEmpty @Size(min = 3, max = 50) String country,
			@NotNull @NotEmpty @Size(min = 3, max = 50) String state,
			@NotNull @NotEmpty @Size(min = 3, max = 50) String city, int pincode, CustomerFeedBackDTO feedBackDTO) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.age = age;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.feedBackDTO = feedBackDTO;
	}
	
	
	
	
	
}
