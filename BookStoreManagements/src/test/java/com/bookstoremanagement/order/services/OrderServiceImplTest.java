package com.bookstoremanagement.order.services;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.awt.print.Book;
import java.time.LocalDate;
import java.util.Optional;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.bookstoremanagement.order.controllers.OrderController;
import com.bookstoremanagement.order.dto.BookOrderDto;
import com.bookstoremanagement.order.dto.OrderDetailsDto;
import com.bookstoremanagement.order.entities.BookOrder;
import com.bookstoremanagement.order.entities.OrderDetails;
import com.bookstoremanagement.order.mapper.OrderDetailsMapper;
import com.bookstoremanagement.order.repository.OrderRepository;
import com.bookstoremanagement.order.service.IOrderServiceImpl;

import java.util.Arrays;

public class OrderServiceImplTest {

	@Mock
	BookOrderDto bookorderDto;
	@Mock
	OrderDetailsDto orderdetailsDto;
	@InjectMocks
	IOrderServiceImpl oci;
	@Mock
	BookOrder bookorder;
	@Mock
	BookOrder bookorder1;
	@Mock
	OrderDetails orderdetails;
	@Mock
	OrderDetails orderdetails1;
	@Mock
	Book book;
	@Mock
	Book book1;
	@Mock
	OrderRepository or;

	@BeforeEach
	public void startup()
	{
		MockitoAnnotations.initMocks(this);
//		os=mock(IOrderService.class);
		bookorder=new BookOrder(1,null,LocalDate.of(2020,10,12),102,"Confirmed",null,"handcash","Eshu","Phn1");
		bookorder1=new BookOrder(2,null,LocalDate.of(2019,12,10),103,"NotConfirmed",null,"online","Raji","Phn2");
		orderdetails=new OrderDetails(1,null,bookorder,10,101);
		orderdetails1=new OrderDetails(2,null,bookorder,20,102);
		 
	 }

	@Test         
	void testGetOrderById()
	{
	        when(or.findById(1)).thenReturn(Optional.of(orderdetails));
	        assertEquals(orderdetails,oci.getOrderById(1));
	        Mockito.verify(or,times(1)).findById(1);
	    
	}
	
	@Test     //ADD
	public void testaddOrder() 
	{ 
		Mockito.when(or.save(any(OrderDetails.class))).thenReturn(orderdetails);
		OrderDetailsDto orderdetailsDto=OrderDetailsMapper.toOrderDetailsDto(orderdetails);
		OrderDetails orderdetailsDto1=oci.addOrder(orderdetailsDto);
		assertEquals(orderdetailsDto1.getOrderId(),orderdetailsDto1.getOrderId());
		Mockito.verify(or,times(1)).save(any(OrderDetails.class));
	}
	
	@Test        
	public void testListAllOrders() 
	{
		Mockito.when(or.findAll()).thenReturn(Arrays.asList(orderdetails));
		assertEquals(Arrays.asList(orderdetails),oci.listAllOrders());
		Mockito.verify(or).findAll();
	}
	
	@Test     //DELETE
	 public void testcancelOrder() {
		when(or.findById(1)).thenReturn(Optional.of(orderdetails));
		assertEquals("DELETED",oci.cancelOrder(1));
		 Mockito.verify(or).deleteById(1);
	 }

}
