package com.wwd.PracticeMySQL.dao;

import java.util.Date;

/**
 * 定义字段
 * @author WangWD
 *
 */

public class Money {
	
	/*
	 * ID
	 */
	private int monId;
	
	/*
	 * 平台
	 */
	private String monName;
	
	/*
	 * 还款日期
	 */
	private Date monDate;
	
	/*
	 * 还款金额
	 */
	private float monAmount;
	
	/*
	 * 还款期限
	 */
	private int monCount;
	
	/*
	 * 剩余还款金额
	 */
	private float monAllAmount;

	public int getMonId() {
		return monId;
	}

	public void setMonId(int monId) {
		this.monId = monId;
	}

	public String getMonName() {
		return monName;
	}

	public void setMonName(String monName) {
		this.monName = monName;
	}

	public Date getMonDate() {
		return monDate;
	}

	public void setMonDate(Date monDate) {
		this.monDate = monDate;
	}

	public float getMonAmount() {
		return monAmount;
	}

	public void setMonAmount(float monAmount) {
		this.monAmount = monAmount;
	}

	public int getMonCount() {
		return monCount;
	}

	public void setMonCount(int monCount) {
		this.monCount = monCount;
	}

	public float getMonAllAmount() {
		return monAllAmount;
	}

	public void setMonAllAmount(float monAllAmount) {
		this.monAllAmount = monAllAmount;
	}

}
