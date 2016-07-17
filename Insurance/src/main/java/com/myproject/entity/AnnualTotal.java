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
public class AnnualTotal extends IdEntity {
	/**
	 * 月份
	 */
	@NotBlank
	private int month;
	/**
	 * 出单日期
	 */
	@NotBlank
	private Date issuanceDate;
	/**
	 * 产品代码
	 */
	@NotBlank
	private String productId;
	/**
	 * 自保件保费
	 */
	@NotBlank
	private int sSumPremium;
	/**
	 * 客户保费
	 */
	@NotBlank
	private int cSumPremium;
	/**
	 * 佣金系数
	 */
	@NotBlank
	private Double coefficient;
	/**
	 * 自保件佣金
	 */
	@NotBlank
	private int sSumCommission;
	/**
	 * 考核佣金
	 */
	@NotBlank
	private int checkCommission;
	/**
	 * 备注
	 */
	private String describe;
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getsSumPremium() {
		return sSumPremium;
	}
	public void setsSumPremium(int sSumPremium) {
		this.sSumPremium = sSumPremium;
	}
	public int getcSumPremium() {
		return cSumPremium;
	}
	public void setcSumPremium(int cSumPremium) {
		this.cSumPremium = cSumPremium;
	}
	public Double getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(Double coefficient) {
		this.coefficient = coefficient;
	}
	public int getsSumCommission() {
		return sSumCommission;
	}
	public void setsSumCommission(int sSumCommission) {
		this.sSumCommission = sSumCommission;
	}
	public int getCheckCommission() {
		return checkCommission;
	}
	public void setCheckCommission(int checkCommission) {
		this.checkCommission = checkCommission;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
	public Date getIssuanceDate() {
		return issuanceDate;
	}
	public void setIssuanceDate(Date issuanceDate) {
		this.issuanceDate = issuanceDate;
	}
	@Override
	public String toString() {
		return "AnnualTotal [month=" + month + ", issuanceDate=" + issuanceDate
				+ ", productId=" + productId 
				+ ", sSumPremium=" + sSumPremium + ", cSumPremium="
				+ cSumPremium + ", coefficient=" + coefficient
				+ ", sSumCommission=" + sSumCommission + ", checkCommission="
				+ checkCommission + ", describe=" + describe + "]";
	}
}