package com.bookstoremanagement.order.service;

import java.util.List;
import java.util.Locale.Category;

import com.bookstoremanagement.order.dto.BookOrderDto;
import com.bookstoremanagement.order.dto.OrderDetailsDto;
import com.bookstoremanagement.order.entities.BookOrder;
import com.bookstoremanagement.order.entities.Customer;
import com.bookstoremanagement.order.entities.OrderDetails;

public interface IOrderService {

	public List<OrderDetails> listAllOrders();
//	public List<OrderDetails> listOrderByCustomer(Customer cs);
//	public OrderDetails viewOrderForCustomer(OrderDetails od);
//	public OrderDetails viewOrderForAdmin(OrderDetails od);
//	public OrderDetails cancelOrder(OrderDetails od);
	public OrderDetails addOrder(OrderDetailsDto od);
	public OrderDetails updateOrder(OrderDetailsDto od);
//	public List<OrderDetails> viewOrderByBook(Book book);
//	public List<Book> listBestSellingBook();
	public OrderDetails getOrderById(int id);
	
	public String cancelOrder(int id);

}
