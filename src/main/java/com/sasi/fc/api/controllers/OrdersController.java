package com.sasi.fc.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sasi.fc.api.client.ClientOrders;
import com.sasi.fc.api.dto.OrdersResponce;

@RestController
public class OrdersController {
	
	@Autowired
	private ClientOrders clientOrders;

	@GetMapping("/findAllOrders")
	public List<OrdersResponce> getAllOreders() {
		return clientOrders.getallOrders();
      }
	
	@GetMapping("/priceByProductname/{productName}")
	public Double getOrderPrice(@PathVariable String productName) {
		
		Double orderPrice=null;
	    	//List<OrdersResponce> ordersList=getAllOreders();
		
	    	/* return getAllOreders().stream().map
	    			 (name->new OrdersResponce().getName().equalsIgnoreCase(name)).c)
	    	*/	 
		    for(OrdersResponce order:getAllOreders()) {
		    	if(order.getName().equalsIgnoreCase(productName)) {
		    		orderPrice= order.getAmount();
		    	}
		    }
			return orderPrice;
	    	 
	}

}