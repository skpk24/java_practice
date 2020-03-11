package com.ilinks.practice.java.thread.cyclicbarrier.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Order {
	
	private String orderId;
	private Date createdDate;
	private BigDecimal grossTotal;
	private BigDecimal netTotal;
	
	private Address billingAddress;
	private Address shippingAddress;
	
	private OrderAdjustment adjustment;
	
	private List<OrderItem> items;

	public String getOrderId() {
		return orderId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public BigDecimal getGrossTotal() {
		return grossTotal;
	}

	public BigDecimal getNetTotal() {
		return netTotal;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public OrderAdjustment getAdjustment() {
		return adjustment;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	@Override
	public String toString() {
		return "\nOrder [orderId=" + orderId + " , createdDate=" + createdDate + ", grossTotal=" + grossTotal
				+ ", netTotal=" + netTotal + ", billingAddress=" + billingAddress + ", shippingAddress="
				+ shippingAddress + ", adjustment=" + adjustment + ", items=" + items + "]";
	}
	
	private Order(OrderBuilder builder) {
		 this.orderId = builder.getOrderId();
		 this.createdDate = builder.getCreatedDate();
		 this.grossTotal = builder.getGrossTotal();
		 this.netTotal = builder.getNetTotal();
		
		 this.billingAddress = builder.getBillingAddress();
		 this.shippingAddress = builder.getShippingAddress();
		
		 this.adjustment = builder.getAdjustment();
		
		 this.items = builder.getItems();
	}
	
	public static class OrderBuilder{
		private String orderId;
		private Date createdDate;
		private BigDecimal grossTotal;
		private BigDecimal netTotal;
		
		private Address billingAddress;
		private Address shippingAddress;
		
		private OrderAdjustment adjustment;
		
		private List<OrderItem> items;
		
		public OrderBuilder(String orderId, Date createdDate) {
			this.orderId = orderId;
			this.createdDate = createdDate;
		}
		
		public Order build() {
			return new Order(this);
		}

		public String getOrderId() {
			return orderId;
		}

		public Date getCreatedDate() {
			return createdDate;
		}

		public BigDecimal getGrossTotal() {
			return grossTotal;
		}

		public BigDecimal getNetTotal() {
			return netTotal;
		}

		public Address getBillingAddress() {
			return billingAddress;
		}

		public Address getShippingAddress() {
			return shippingAddress;
		}

		public OrderAdjustment getAdjustment() {
			return adjustment;
		}

		public List<OrderItem> getItems() {
			return items;
		}

		public void setGrossTotal(BigDecimal grossTotal) {
			this.grossTotal = grossTotal;
		}

		public void setNetTotal(BigDecimal netTotal) {
			this.netTotal = netTotal;
		}

		public void setBillingAddress(Address billingAddress) {
			this.billingAddress = billingAddress;
		}

		public void setShippingAddress(Address shippingAddress) {
			this.shippingAddress = shippingAddress;
		}

		public void setAdjustment(OrderAdjustment adjustment) {
			this.adjustment = adjustment;
		}

		public void setItems(List<OrderItem> items) {
			this.items = items;
		}
		
		public BigDecimal calGrossTotal(List<OrderItem> items) {
			BigDecimal total = BigDecimal.ZERO;
			if(items == null) return BigDecimal.ZERO;
			
//			for(OrderItem item : items) {
//				total = total.add(item.getPrice().multiply(item.getQuantity()));
//			}
			
			total = items.stream().map(i -> i.getPrice().multiply(i.getQuantity())).reduce(BigDecimal.ZERO, BigDecimal::add);
			
			return total;
		}
		
		public BigDecimal calNetTotal(BigDecimal grossTotal, BigDecimal adjustment) {
			return grossTotal.subtract(adjustment);
		}
		
		
	}
	
}
