package com.java.SpringWebApplication.DAO;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

@Table(name = "APPLICATIONS")
public class Applications {
	private Date created;
	private Date modified;
	private String name;
	private int app_id;
	private Double price;
	private String currency;

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

	@Column(name = "NAME", unique = true, nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id
	@Column(name = "APP_ID", unique = true, nullable = false)
	public int getApp_id() {
		return app_id;
	}

	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}

	@Column(name = "price", nullable = false)
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Column(name = "CURRENCY", nullable = false)
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
