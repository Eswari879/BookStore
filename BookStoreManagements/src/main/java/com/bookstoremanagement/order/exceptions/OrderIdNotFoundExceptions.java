package com.bookstoremanagement.order.exceptions;

public class OrderIdNotFoundExceptions extends RuntimeException  {
	public OrderIdNotFoundExceptions(String msg)
	{
		super(msg);
	}
}
