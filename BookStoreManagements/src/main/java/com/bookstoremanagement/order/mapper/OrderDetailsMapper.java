package com.bookstoremanagement.order.mapper;

import com.bookstoremanagement.order.dto.BookOrderDto;
import com.bookstoremanagement.order.dto.OrderDetailsDto;
import com.bookstoremanagement.order.entities.BookOrder;
import com.bookstoremanagement.order.entities.OrderDetails;

public class OrderDetailsMapper {
	public static OrderDetails toStatement(OrderDetailsDto orderdetailsDto)
	{
	OrderDetails orderdetails=new OrderDetails();
	orderdetails.setBook(orderdetailsDto.getBook());
	orderdetails.setBookOrder(orderdetailsDto.getBookOrder());
	orderdetails.setQuantity(orderdetailsDto.getQuantity());
	orderdetails.setSubtotal(orderdetailsDto.getSubtotal());
	return orderdetails;
}
	public static OrderDetailsDto toOrderDetailsDto(OrderDetails orderdetails) 
	{
		OrderDetailsDto orderdetailsdto = new OrderDetailsDto();
		orderdetailsdto.setBook(orderdetails.getBook());
		orderdetailsdto.setBookOrder(orderdetails.getBookOrder());
		orderdetailsdto.setQuantity(orderdetails.getQuantity());
		orderdetailsdto.setSubtotal(orderdetails.getSubtotal());
		return orderdetailsdto;
	}
	
	
}