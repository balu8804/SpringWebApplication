package com.java.SpringWebApplication.DAO;

import java.util.Date;

import javax.persistence.Table;
@Table(name="APPLICATIONS")
public class Applications {
	private Date created;
	private Date modified;
	private String name;
	private int app_id;
	private Double price;
	private String prop_ext_id;
	private String currency;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getApp_id() {
		return app_id;
	}

	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getProp_ext_id() {
		return prop_ext_id;
	}

	public void setProp_ext_id(String prop_ext_id) {
		this.prop_ext_id = prop_ext_id;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
