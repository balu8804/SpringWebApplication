package com.java.SpringWebApplication.DAO;

import java.util.Date;

public class Orders {
	private Date created;
	private Date modified;
	private Long ord_id;
	private String name;
	private Date billing_date;
	private String state;
	private String shippingAddressLine1;
    private String shippingAddressLine2;
    private String shippingCity;
    private String shippingState;
    private String shippingPostalCode;
    private String shippingCountry;
    private String ord_external_id;
    private Applications applications;
    private Customers customers;
	
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
	public Long getOrd_id() {
		return ord_id;
	}
	public void setOrd_id(Long ord_id) {
		this.ord_id = ord_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBilling_date() {
		return billing_date;
	}
	public void setBilling_date(Date billing_date) {
		this.billing_date = billing_date;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getShippingAddressLine1() {
		return shippingAddressLine1;
	}
	public void setShippingAddressLine1(String shippingAddressLine1) {
		this.shippingAddressLine1 = shippingAddressLine1;
	}
	public String getShippingAddressLine2() {
		return shippingAddressLine2;
	}
	public void setShippingAddressLine2(String shippingAddressLine2) {
		this.shippingAddressLine2 = shippingAddressLine2;
	}
	public String getShippingCity() {
		return shippingCity;
	}
	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}
	public String getShippingState() {
		return shippingState;
	}
	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}
	public String getShippingPostalCode() {
		return shippingPostalCode;
	}
	public void setShippingPostalCode(String shippingPostalCode) {
		this.shippingPostalCode = shippingPostalCode;
	}
	public String getShippingCountry() {
		return shippingCountry;
	}
	public void setShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
	}
	public String getOrd_external_id() {
		return ord_external_id;
	}
	public void setOrd_external_id(String ord_external_id) {
		this.ord_external_id = ord_external_id;
	}
	public Applications getApplications() {
		return applications;
	}
	public void setApplications(Applications applications) {
		this.applications = applications;
	}
	
	public Customers getCustomers() {
		return customers;
	}
	public void setCustomers(Customers customers) {
		this.customers = customers;
	}
    
    
	

}
