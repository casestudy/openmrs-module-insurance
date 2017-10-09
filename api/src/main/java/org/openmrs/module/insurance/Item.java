/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.insurance;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.User;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Please note that a corresponding table schema must be created in liquibase.xml.
 */
//Uncomment 2 lines below if you want to make the Item class persistable, see also InsuranceDaoTest and liquibase.xml
@Entity(name = "insurance.Item")
@Table(name = "insurer")
public class Item extends BaseOpenmrsData {
	
	@Id
	@GeneratedValue
	@Column(name = "insurer_id")
	private Integer id;
	
	/*@ManyToOne
	@JoinColumn(name = "owner")
	private User owner;*/
	
	@Basic
	@Column(name = "description", length = 255)
	private String description;
	
	@Basic
	@Column(name = "name", length = 255)
	private String name;
	
	@Basic
	@Column(name = "alias", length = 20)
	private String alias;
	
	@Basic
	@Column(name = "address", length = 50)
	private String address;
	
	@Basic
	@Column(name = "deleted", length = 1)
	private Boolean deleted = false;
	
	@ManyToOne
	@JoinColumn(name = "deleted_by")
	private User deletedBy;
	
	@Basic
	@Column(name = "deleted_reason", length = 255)
	private String deletedReason;
	
	@Basic
	@Column(name = "deleted_on")
	private Date deletedOn;
	
	@Basic
	@Column(name = "created_on")
	private Date createdOn;
	
	@ManyToOne
	@JoinColumn(name = "created_by")
	private User createdBy;
	
	@Override
	public Integer getId() {
		return id;
	}
	
	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public String getUuid() {
		return super.getUuid();
	}
	
	@Override
	public void setUuid(String uuid) {
		super.setUuid(uuid);
	}
	
	/*public User getOwner() {
		return owner;
	}
	
	public void setOwner(User owner) {
		this.owner = owner;
	}*/
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAlias() {
		return alias;
	}
	
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Boolean getDeleted() {
		return deleted;
	}
	
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	
	public User getDeletedBy() {
		return deletedBy;
	}
	
	public void setDeletedBy(User deletedBy) {
		this.deletedBy = deletedBy;
	}
	
	public String getDeletedReason() {
		return deletedReason;
	}
	
	public void setDeletedReason(String deletedReason) {
		this.deletedReason = deletedReason;
	}
	
	public Date getDeletedOn() {
		return deletedOn;
	}
	
	public void setDeletedOn(Date deletedOn) {
		this.deletedOn = deletedOn;
	}
	
	public Date getCreatedOn() {
		return createdOn;
	}
	
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	public User getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
}
