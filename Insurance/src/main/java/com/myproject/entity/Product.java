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

@Entity
@Table(name = "product")
public class Product extends IdEntity {
	/**
	 * 产品代码
	 */
	@NotBlank
	private String code;
	/**
	 * 产品名称
	 */
	@NotBlank
	private String name;
	private String describe;
	private Date creatDate;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "Product [code=" + code + ", name=" + name + ", describe="
				+ describe + ", creatDate=" + creatDate + "]";
	}
}