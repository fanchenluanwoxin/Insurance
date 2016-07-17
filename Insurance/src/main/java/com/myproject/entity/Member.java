/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.myproject.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 部门成员
 * @author Administrator
 *
 */
@Entity
@Table(name = "member")
public class Member extends IdEntity {
	/**
	 *名称
	 */
	@NotBlank
	private String name;
	/**
	 * 所属部门
	 */
	@NotBlank
	private String deptid;
	/**
	 * 描述
	 */
	private String describe;
	private Date creatDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptid() {
		return deptid;
	}
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public Date getCreatDate() {
		return creatDate;
	}
	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", deptid=" + deptid + ", describe="
				+ describe + ", creatDate=" + creatDate + "]";
	}
}