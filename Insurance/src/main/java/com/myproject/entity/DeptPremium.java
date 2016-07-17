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
@Table(name = "deptpremium")
public class DeptPremium extends IdEntity {
	/**
	 * 自保件保费
	 */
	@NotBlank
	private int sPremium;
	/**
	 * 客户保费
	 */
	@NotBlank
	private int cCpremium;
	/**
	 * 自保件佣金
	 */
	@NotBlank
	private int sCommission;
	/**
	 * 客户保费佣金
	 */
	@NotBlank
	private int cCommission;
	/**
	 * 佣金合计
	 */
	@NotBlank
	private int SumPremium;
	/**
	 * 组业绩合计
	 */
	private int total;
	private Date creatDate;
	public int getsPremium() {
		return sPremium;
	}
	public void setsPremium(int sPremium) {
		this.sPremium = sPremium;
	}
	public int getcCpremium() {
		return cCpremium;
	}
	public void setcCpremium(int cCpremium) {
		this.cCpremium = cCpremium;
	}
	public int getsCommission() {
		return sCommission;
	}
	public void setsCommission(int sCommission) {
		this.sCommission = sCommission;
	}
	public int getcCommission() {
		return cCommission;
	}
	public void setcCommission(int cCommission) {
		this.cCommission = cCommission;
	}
	public int getSumPremium() {
		return SumPremium;
	}
	public void setSumPremium(int sumPremium) {
		SumPremium = sumPremium;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Date getCreatDate() {
		return creatDate;
	}
	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}
	@Override
	public String toString() {
		return "DeptPremium [sPremium=" + sPremium + ", cCpremium=" + cCpremium
				+ ", sCommission=" + sCommission + ", cCommission="
				+ cCommission + ", SumPremium=" + SumPremium + ", total="
				+ total + ", creatDate=" + creatDate + "]";
	}
}