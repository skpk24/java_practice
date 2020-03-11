package com.ilinks.practice.java.thread.cyclicbarrier.entity;

import java.math.BigDecimal;

public class OrderItem {
	
	private String orderId;
	private Integer itemSeqId;
	private String productId;
	private String productName;
	private BigDecimal quantity;
	private BigDecimal price;
	
	public String getOrderId() {
		return orderId;
	}
	public Integer getItemSeqId() {
		return itemSeqId;
	}
	public String getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public void setItemSeqId(Integer itemSeqId) {
		this.itemSeqId = itemSeqId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "OrderItem [orderId=" + orderId + ", itemSeqId=" + itemSeqId + ", productId=" + productId
				+ ", productName=" + productName + ", quantity=" + quantity + ", price=" + price + "]";
	}
}
