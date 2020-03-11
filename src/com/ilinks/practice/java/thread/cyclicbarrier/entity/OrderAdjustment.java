package com.ilinks.practice.java.thread.cyclicbarrier.entity;

import java.math.BigDecimal;

public class OrderAdjustment {
	private String adjustmentType;
	private BigDecimal adjustmentAmt;
	
	private OrderAdjustment(String type, BigDecimal amt) {
		this.adjustmentAmt = amt;
		this.adjustmentType = type;
	}
	
	public String getAdjustmentType() {
		return adjustmentType;
	}
	public BigDecimal getAdjustmentAmt() {
		return adjustmentAmt;
	}
	public void setAdjustmentType(String adjustmentType) {
		this.adjustmentType = adjustmentType;
	}
	public void setAdjustmentAmt(BigDecimal adjustmentAmt) {
		this.adjustmentAmt = adjustmentAmt;
	}
	@Override
	public String toString() {
		return "OrderAdjustment [adjustmentType=" + adjustmentType + ", adjustmentAmt=" + adjustmentAmt + "]";
	}
	
	public static OrderAdjustment getInstance(String type, BigDecimal amt) {
		return new OrderAdjustment(type, amt);
	}
}
