package com.bookstoremanagement.order.mapper;


import com.bookstoremanagement.order.dto.BookOrderDto;
import com.bookstoremanagement.order.entities.BookOrder;

public class BookOrderMapper {
	
	public static BookOrder toStatement(BookOrderDto bookorderDto) 
	{
		BookOrder bookorder = new BookOrder();
		bookorder.setOrderId(bookorderDto.getOrderId());
		bookorder.setCustomer(bookorderDto.getCustomer());
		bookorder.setOrderDate(bookorderDto.getOrderDate());
		bookorder.setOrderTotal((int) bookorderDto.getOrderTotal());
		bookorder.setStatus(bookorderDto.getStatus());
		bookorder.setShippingAddress(bookorderDto.getShippingAddress());
		bookorder.setPaymentMethod(bookorderDto.getPaymentMethod());
		bookorder.setRecipientName(bookorderDto.getRecipientName());
		bookorder.setRecipientPhone(bookorderDto.getRecipientPhone());
		return bookorder;
		
		
	}
}
