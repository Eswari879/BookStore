package com.bookstoremanagement.order.dto;

import com.bookstoremanagement.order.entities.Book;
import com.bookstoremanagement.order.entities.BookOrder;

public class OrderDetailsDto {
	
	private Book book;
	private BookOrder bookOrder;
	private int quantity;
	private int subtotal;
	
	
	public OrderDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
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
	public OrderDetailsDto(Book book, BookOrder bookOrder, int quantity, int subtotal) {
		super();
		this.book = book;
		this.bookOrder = bookOrder;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}
	@Override
	public String toString() {
		return "OrderDetailsDto [book=" + book + ", bookOrder=" + bookOrder + ", quantity=" + quantity + ", subtotal="
				+ subtotal + "]";
	}
	
	
}
