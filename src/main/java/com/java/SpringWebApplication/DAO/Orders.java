package com.java.SpringWebApplication.DAO;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Cacheable
@Table(name = "ORDERS")
public class Orders {
	private Date created;
	private Date modified;
	private Long ord_id;
	private String name;
	private Date billing_date;
	private String state;
	private String shipping_Address_Line1;
	private String shipping_Address_Line2;
	private String shipping_City;
	private String shipping_State;
	private String shipping_Postal_Code;
	private String shipping_Country;
	private Applications applications;
	private Customers customers;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED", nullable = false)
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED", nullable = false)
	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	@Id
	@Column(name = "ORD_ID", unique = true, nullable = false)
	public Long getOrd_id() {
		return ord_id;
	}

	public void setOrd_id(Long ord_id) {
		this.ord_id = ord_id;
	}

	@Column(name = "NAME", unique = true, nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BILLING_DATE")
	public Date getBilling_date() {
		return billing_date;
	}

	public void setBilling_date(Date billing_date) {
		this.billing_date = billing_date;
	}

	@Column(name = "STATE")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "SHIPPING_ADDRESS_LINE1")
	public String getShipping_Address_Line1() {
		return shipping_Address_Line1;
	}

	public void setShipping_Address_Line1(String shipping_Address_Line1) {
		this.shipping_Address_Line1 = shipping_Address_Line1;
	}

	@Column(name = "SHIPPING_ADDRESS_LINE2")
	public String getShipping_Address_Line2() {
		return shipping_Address_Line2;
	}

	public void setShipping_Address_Line2(String shipping_Address_Line2) {
		this.shipping_Address_Line2 = shipping_Address_Line2;
	}

	@Column(name = "SHIPPING_CITY")
	public String getShipping_City() {
		return shipping_City;
	}

	public void setShipping_City(String shipping_City) {
		this.shipping_City = shipping_City;
	}

	@Column(name = "SHIPPING_STATE")
	public String getShipping_State() {
		return shipping_State;
	}

	public void setShipping_State(String shipping_State) {
		this.shipping_State = shipping_State;
	}

	@Column(name = "SHIPPING_POSTAL_CODE")
	public String getShipping_Postal_Code() {
		return shipping_Postal_Code;
	}

	public void setShipping_Postal_Code(String shipping_Postal_Code) {
		this.shipping_Postal_Code = shipping_Postal_Code;
	}

	@Column(name = "SHIPPING_COUNTRY")
	public String getShipping_Country() {
		return shipping_Country;
	}

	public void setshipping_Country(String shipping_Country) {
		this.shipping_Country = shipping_Country;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "APP_APP_ID")
	public Applications getApplications() {
		return applications;
	}

	public void setApplications(Applications applications) {
		this.applications = applications;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUST_CUST_ID")
	public Customers getCustomers() {
		return customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

}
