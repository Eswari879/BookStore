package com.bookstoremanagement.ordercontrollers;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookstoremanagement.order.controllers.OrderController;
import com.bookstoremanagement.order.dto.BookOrderDto;
import com.bookstoremanagement.order.dto.OrderDetailsDto;
import com.bookstoremanagement.order.entities.BookOrder;
import com.bookstoremanagement.order.entities.OrderDetails;
import com.bookstoremanagement.order.service.IOrderService;

//@SpringBootTest
//@ExtendWith(MockitoExtension.class)
public class OrderControllersTest {
	
@InjectMocks
OrderController ordercontroller;
	
@Mock
BookOrder bookorder;
@Mock
OrderDetails orderdetails;
@Mock
static IOrderService os;
@Mock
BookOrderDto bookorderDto;
@Mock
BookOrderDto bookorderDto1;
@Mock
OrderDetailsDto orderdetailsDto;
@Mock
OrderDetailsDto orderdetailsDto1;
@Mock
Book book;
@Mock
Book book1;

@BeforeEach
public void startup()
{
	MockitoAnnotations.initMocks(this);
//	os=mock(IOrderService.class);
	bookorderDto=new BookOrderDto(1,null,LocalDate.of(2020,10,12),102,"Confirmed",null,"handcash","Eshu","Phn1");
	bookorderDto1=new BookOrderDto(2,null,LocalDate.of(2019,12,10),103,"NotConfirmed",null,"online","Raji","Phn2");
	orderdetailsDto=new OrderDetailsDto(null,null,10,101);
	orderdetailsDto1=new OrderDetailsDto(null,null,20,102);
	
//	 when(os.addOrder(orderdetailsDto1)).thenReturn(orderdetailsDto);
//	 when(os.cancelOrder(bookorderDto.getOrderId())).thenReturn("DELETED");
 }

@Test    //POST
public void testaddOrder() {
	Mockito.when(os.addOrder(orderdetailsDto)).thenReturn(orderdetails);  
	assertEquals(orderdetails,ordercontroller.addOrder(orderdetailsDto));
	Mockito.verify(os).addOrder(orderdetailsDto);
}

@Test  //GET
public void testListAllOrders() {
	Mockito.when(os.listAllOrders()).thenReturn(Arrays.asList(orderdetails));
	assertEquals(Arrays.asList(orderdetails),ordercontroller.listAllOrders());
	Mockito.verify(os).listAllOrders();
}

@Test //PUT
public void updateOrderTest() {
	orderdetails=new OrderDetails(1,null,null,10,101);
	when(os.updateOrder(orderdetailsDto)).thenReturn(orderdetails);
    OrderDetails update = os.updateOrder(orderdetailsDto);
    assertEquals(orderdetails, update);
}

@Test //DELETE
public void cancelOrderTest() {
	orderdetails = new OrderDetails(1,null,null,10,101);
	 when(os.cancelOrder(orderdetails.getOrderId())).thenReturn("DELETED");
	 String status = os.cancelOrder(1);
	 assertEquals("DELETED", status);
}
 


}
