package com.bookstoremanagement.order.exceptions;

public class OrderAlreadyExistsExceptions extends RuntimeException{
	public OrderAlreadyExistsExceptions(String msg)
	{
		super(msg);
	}
}
