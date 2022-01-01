package com.bookstoremanagement.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstoremanagement.order.dto.BookOrderDto;
import com.bookstoremanagement.order.dto.OrderDetailsDto;
import com.bookstoremanagement.order.entities.BookOrder;
import com.bookstoremanagement.order.entities.Customer;
import com.bookstoremanagement.order.entities.OrderDetails;
import com.bookstoremanagement.order.exceptions.OrderAlreadyExistsExceptions;
import com.bookstoremanagement.order.exceptions.OrderIdNotFoundExceptions;
import com.bookstoremanagement.order.mapper.BookOrderMapper;
import com.bookstoremanagement.order.mapper.OrderDetailsMapper;
import com.bookstoremanagement.order.repository.OrderRepository;

@Service
public class IOrderServiceImpl implements IOrderService {
	
	@Autowired
	OrderRepository or;
	
	@Override
	public List<OrderDetails> listAllOrders() {
		// TODO Auto-generated method stub
		return or.findAll();
	}

	/*@Override
	public List<OrderDetails> listOrderByCustomer(Customer cs) {
		// TODO Auto-generated method stub
		return ;
	}*/

	@Override
	public String cancelOrder(int id) {
		// TODO Auto-generated method stub
		Optional<OrderDetails> cat = or.findById(id);
		if(cat.isPresent()) {
			 or.deleteById(id);
			 return "DELETED";
		}
		else {
			throw new OrderIdNotFoundExceptions("Id not found");
		}
	}

	@Override
	public OrderDetails addOrder(OrderDetailsDto od) {
		// TODO Auto-generated method stub
		OrderDetails orderdetailsobj = OrderDetailsMapper.toStatement(od);
		return or.save(orderdetailsobj);
		
	
	}

	@Override
	public OrderDetails updateOrder(OrderDetailsDto od) {
		// TODO Auto-generated method stub
		OrderDetails orderdetailsobj2= OrderDetailsMapper.toStatement(od);
		return or.save(orderdetailsobj2);
	}

	@Override
	public OrderDetails getOrderById(int id) {
		// TODO Auto-generated method stub
		Optional<OrderDetails> cat = or.findById(id);
		if(cat.isPresent()) {
			return cat.get();
		}
		throw new OrderIdNotFoundExceptions("Id not found");
	}
	

}
