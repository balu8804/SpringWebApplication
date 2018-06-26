package com.java.SpringWebApplication.Service;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
@XmlRootElement(name="AddCustomerRequest")
public class AddCustomerRequest {
	
	@JsonProperty("created")
	@XmlElement(name = "created")
	private Date created;
	
	@JsonProperty("modified")
	@XmlElement(name = "modified")
	private Date modified;
	

	@JsonProperty("cust_id")
	@XmlElement(name = "cust_id")
	private int cust_id;

	@JsonProperty("name")
	@XmlElement(name = "name")
	private String name;

	@JsonProperty("state")
	@XmlElement(name = "state")
	private String state;

	@JsonProperty("last-name")
	@XmlElement(name = "last-name")
	private String last_Name;

	@JsonProperty("first-name")
	@XmlElement(name = "first-name")
	private String first_Name;

	@JsonProperty("email")
	@XmlElement(name = "email")
	private String email;

	@JsonProperty("phone")
	@XmlElement(name = "phone")
	private int phone;

	@JsonProperty("billing-Address-Line1")
	@XmlElement(name = "billing-Address-Line1")
	private String billing_Address_Line1;

	private String billing_Address_Line2;

	@JsonProperty("billing-City")
	@XmlElement(name = "billing-City")
	private String billing_City;

	@JsonProperty("billing-State")
	@XmlElement(name = "billing-State")
	private String billing_State;
	
	@JsonProperty("billing-Postal-Code")
	@XmlElement(name = "billing-Postal-Code")

	private int billing_Postal_Code;
	@JsonProperty("billing-Country")
	@XmlElement(name = "billing-Country")
	private String billing_Country;
   
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}
	
	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getBilling_Address_Line1() {
		return billing_Address_Line1;
	}

	public void setBilling_Address_Line1(String billing_Address_Line1) {
		this.billing_Address_Line1 = billing_Address_Line1;
	}

	public String getBilling_Address_Line2() {
		return billing_Address_Line2;
	}

	public void setBilling_Address_Line2(String billing_Address_Line2) {
		this.billing_Address_Line2 = billing_Address_Line2;
	}

	public String getBilling_City() {
		return billing_City;
	}

	public void setBilling_City(String billing_City) {
		this.billing_City = billing_City;
	}

	public String getBilling_State() {
		return billing_State;
	}

	public void setBilling_State(String billing_State) {
		this.billing_State = billing_State;
	}

	public int getBilling_Postal_Code() {
		return billing_Postal_Code;
	}

	public void setBilling_Postal_Code(int billing_Postal_Code) {
		this.billing_Postal_Code = billing_Postal_Code;
	}

	public String getBilling_Country() {
		return billing_Country;
	}

	public void setBilling_Country(String billing_Country) {
		this.billing_Country = billing_Country;
	}

}