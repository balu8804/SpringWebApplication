package com.java.SpringWebApplication.DAO;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS")
public class Customers {
	private Date created;
	private Date modified;
	private int cust_id;
	private String name;
	private String state;
	private String last_Name;
	private String first_Name;
	private String middle_Name;
	private String password;
	private String email;
	private int phone;
	private String billing_Address_Line1;
	private String billing_Address_Line2;
	private String billing_City;
	private String billing_State;
	private int billing_Postal_Code;
	private String billing_Country;

	@Column(name = "CREATED")
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Column(name = "MODIFIED")
	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	@Id
	@Column(name = "CUST_ID", unique =true, nullable =false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "STATE")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "PASSWORD")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "PHONE")
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Column(name = "LAST_NAME")
	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	@Column(name = "FIRST_NAME")
	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	@Column(name = "MIDDLE_NAME")
	public String getMiddle_Name() {
		return middle_Name;
	}

	public void setMiddle_Name(String middle_Name) {
		this.middle_Name = middle_Name;
	}

	@Column(name = "BILLING_ADDRESS_LINE1")
	public String getBilling_Address_Line1() {
		return billing_Address_Line1;
	}

	public void setBilling_Address_Line1(String billing_Address_Line1) {
		this.billing_Address_Line1 = billing_Address_Line1;
	}

	@Column(name = "BILLING_ADDRESS_LINE2")
	public String getBilling_Address_Line2() {
		return billing_Address_Line2;
	}

	public void setBilling_Address_Line2(String billing_Address_Line2) {
		this.billing_Address_Line2 = billing_Address_Line2;
	}

	@Column(name = "BILLING_CITY")
	public String getBilling_City() {
		return billing_City;
	}

	public void setBilling_City(String billing_City) {
		this.billing_City = billing_City;
	}

	@Column(name = "BILLING_STATE")
	public String getBilling_State() {
		return billing_State;
	}

	public void setBilling_State(String billing_State) {
		this.billing_State = billing_State;
	}

	@Column(name = "BILLING_POSTAL_CODE")
	public int getBilling_Postal_Code() {
		return billing_Postal_Code;
	}

	public void setBilling_Postal_Code(int billing_Postal_Code) {
		this.billing_Postal_Code = billing_Postal_Code;
	}

	@Column(name = "BILLING_COUNTRY")
	public String getBilling_Country() {
		return billing_Country;
	}

	public void setBilling_Country(String billing_Country) {
		this.billing_Country = billing_Country;
	}

}
