package com.bookstoremanagement.order.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookstoremanagement.order.dto.BookOrderDto;
import com.bookstoremanagement.order.dto.OrderDetailsDto;
import com.bookstoremanagement.order.entities.OrderDetails;
import com.bookstoremanagement.order.responses.ResponseInfo;
import com.bookstoremanagement.order.service.IOrderService;
import com.bookstoremanagement.order.service.IOrderServiceImpl;

@RestController
public class OrderController {
	
	@Autowired 
	IOrderService os;
	
//	@GetMapping("/order")
//	ResponseEntity<ResponseInfo> viewAllCategory(HttpServletRequest req){
//			ResponseInfo ri=null;
//			ri.setUri(req.getRequestURI());
//			ri.setStatusType(HttpStatus.OK);
//			ri.setStatusCode(HttpStatus.OK.value());
//			ri.setMsg("Return Successfully");
//			return new ResponseEntity<>(ri,HttpStatus.OK);
//		}
	
	@PostMapping("/order")
	public OrderDetails addOrder(@Valid @RequestBody OrderDetailsDto od)       //Add
	{
		return os.addOrder(od);
		
	}
	
	@DeleteMapping("/order/{id}")
	public String cancelOrder(@PathVariable("id") int id)        //Delete
	{
		return os.cancelOrder(id);
	}
	
	
	@PutMapping("/order")
	public OrderDetails updateOrder(@Valid @RequestBody OrderDetailsDto od)        //Update
	{
		return os.updateOrder(od);
	}
	
	
	@GetMapping("/order")                                      //Get
	public List<OrderDetails> listAllOrders()
	{
		return os.listAllOrders();
	}
	
	
	

//	@GetMapping("/order/{id}")
//	public OrderDetails getOrderById(int id) {
//		// TODO Auto-generated method stub
//		return os.getOrderById(id);
//	}

	/*@GetMapping("/order/{id}")
	public List<OrderDetails> listOrderByCustomer(Customer cs)
	{
		
	}
	
	@GetMapping("/order")
	public List<OrderDetails> viewOrderByBook(Book book)
	{
		
	}
	
	@GetMapping("/order")
	public List<Book> listBestSellingBook()
	{
		
	}
	
	@GetMapping("/order/{id}")
	public OrderDetails viewOrderForCustomer( OrderDetails od)
	{
		
	}
	
	
	@GetMapping("/order")
	public OrderDetails viewOrderForAdmin( OrderDetails od)
	{
		
	}*/
	
	
}
