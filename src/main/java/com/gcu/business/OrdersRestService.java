package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gcu.model.*;

@RestController
@RequestMapping("/service") 
public class OrdersRestService {

	@Autowired
	private OrdersBusinessServiceInterface service;
	
	public OrdersRestService() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping(path="/json", produces={MediaType.APPLICATION_JSON_VALUE})
	public List<OrderModel> getOrdersAsJson(){
		return service.getOrders();
	}
	
	@GetMapping(path="/xml", produces={MediaType.APPLICATION_XML_VALUE})
	 public OrderList getOrdersAsXml() {
		 OrderList list = new OrderList();
		 list.setOrders(service.getOrders());
		 return list;
	 }

}
