package com.sales.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sales.services.CustomerService;
import com.sales.services.OrderService;
import com.sales.services.ProductService;

@Controller
@SessionAttributes(value = {"Customer", "Product", "Order"})
public class MainController {

	public List<String> customers = new ArrayList<String>();
	public List<String> products = new ArrayList<String>();
	public List<String> orders = new ArrayList<String>();
	
	@Autowired
	@Qualifier("CustomerService")
	private CustomerService custServ;
	
	@Qualifier("ProductService")
	private ProductService prodServ;
	
	@Qualifier("OrderService")
	private OrderService ordServ;
}
