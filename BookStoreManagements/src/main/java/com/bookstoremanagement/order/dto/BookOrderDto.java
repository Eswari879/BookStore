package com.bookstoremanagement.order.dto;

import java.time.LocalDate;

import com.bookstoremanagement.order.entities.Address;
import com.bookstoremanagement.order.entities.Customer;

public class BookOrderDto {
	
	private int orderId;
	private Customer customer;
	private LocalDate orderDate;
	private int orderTotal;
	private String status;
	private Address shippingAddress;
	private String paymentMethod;
	private String recipientName;
	private String recipientPhone;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getRecipientPhone() {
		return recipientPhone;
	}
	public void setRecipientPhone(String recipientPhone) {
		this.recipientPhone = recipientPhone;
	}
	public BookOrderDto(int orderId, Customer customer, LocalDate orderDate, int orderTotal, String status,
			Address shippingAddress, String paymentMethod, String recipientName, String recipientPhone) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.orderDate = orderDate;
		this.orderTotal = orderTotal;
		this.status = status;
		this.shippingAddress = shippingAddress;
		this.paymentMethod = paymentMethod;
		this.recipientName = recipientName;
		this.recipientPhone = recipientPhone;
	}
	@Override
	public String toString() {
		return "BookOrderDto [orderId=" + orderId + ", customer=" + customer + ", orderDate=" + orderDate
				+ ", orderTotal=" + orderTotal + ", status=" + status + ", shippingAddress=" + shippingAddress
				+ ", paymentMethod=" + paymentMethod + ", recipientName=" + recipientName + ", recipientPhone="
				+ recipientPhone + "]";
	}
	
	

}
