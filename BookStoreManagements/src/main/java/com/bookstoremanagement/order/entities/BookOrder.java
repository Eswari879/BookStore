package com.bookstoremanagement.order.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class BookOrder implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	@OneToOne(cascade=CascadeType.ALL)
	private Customer customer;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate orderDate;
	@Min(value=101,message="orderTotal Must exceed 100.00")
	@NotEmpty(message="Must not be empty")
	private int orderTotal;
	@NotEmpty(message="order must be Confirmed")
	private String status;
	@OneToOne(cascade=CascadeType.ALL)
	private Address shippingAddress;
	@NotEmpty(message="Pay through handcash or online")
	private String paymentMethod;
	@NotEmpty(message="Must not be empty")
	private String recipientName;
	@NotEmpty(message="Must not be empty")
	private String recipientPhone;
	
	public BookOrder()
	{
		
	}
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
	public double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(int d) {
		this.orderTotal = d;
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
	
	
	@Override
	public String toString() {
		return "BookOrder [orderId=" + orderId + ", customer=" + customer + ", orderDate=" + orderDate + ", orderTotal="
				+ orderTotal + ", status=" + status + ", shippingAddress=" + shippingAddress + ", paymentMethod="
				+ paymentMethod + ", recipientName=" + recipientName + ", recipientPhone=" + recipientPhone + "]";
	}
	
	
	public BookOrder(int orderId, Customer customer, LocalDate orderDate, int orderTotal, String status,
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
	
	
	
}
