package com.bookstoremanagement.order.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bookstoremanagement.order.entities.Customer;
import com.bookstoremanagement.order.entities.OrderDetails;

@Repository("or")
public interface OrderRepository extends JpaRepository<OrderDetails,Integer>{
	

//	@Query("select c from Customer c where c.getId=:id")
//	public List<OrderDetails> listOrderByCustomer(@Param("id")Customer cs);
//	public OrderDetails viewOrderForCustomer(OrderDetails od);
//	public OrderDetails viewOrderForAdmin(OrderDetails od);
//	public List<OrderDetails> viewOrderByBook(Book book);
//	public List<Book> listBestSellingBook();
//	public OrderDetails getOrderById(int id);
}
