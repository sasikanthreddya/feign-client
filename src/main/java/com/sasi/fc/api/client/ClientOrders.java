package com.sasi.fc.api.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sasi.fc.api.dto.OrdersResponce;

@FeignClient(url="http://localhost:8080",name="CLIENT-ORDER")
public interface ClientOrders {
	
	@GetMapping("/gettOrders")
	public List<OrdersResponce>getallOrders();
	
	
	@GetMapping("/getPrice/{productName}")
	public Double getOrderPrice(@PathVariable String productName);	
}
