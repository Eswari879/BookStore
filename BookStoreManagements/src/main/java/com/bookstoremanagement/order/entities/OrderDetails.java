package com.bookstoremanagement.order.entities;



import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
public class OrderDetails implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	@OneToOne(cascade=CascadeType.ALL)
	private Book book;
	@OneToOne(cascade=CascadeType.ALL)
	private BookOrder bookOrder;
//	@Min(value=0,message="Must be empty")
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int quantity;
//	@Min(value=101,message="subTotal Must not be lessthan 100.00")
//	@NotEmpty(message="Must not be empty")
	private int subtotal;
	
	public OrderDetails()
	{
		
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public BookOrder getBookOrder() {
		return bookOrder;
	}
	public void setBookOrder(BookOrder bookOrder) {
		this.bookOrder = bookOrder;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public OrderDetails(int orderId, Book book, BookOrder bookOrder,
			@Min(value = 0, message = "Must be empty") int quantity, int subtotal) {
		super();
		this.orderId = orderId;
		this.book = book;
		this.bookOrder = bookOrder;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", book=" + book + ", bookOrder=" + bookOrder + ", quantity="
				+ quantity + ", subtotal=" + subtotal + "]";
	}
	
	
	
	
	
	
}

