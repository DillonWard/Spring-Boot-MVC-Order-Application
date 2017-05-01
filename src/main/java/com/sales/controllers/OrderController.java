package com.sales.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sales.models.Order;
import com.sales.services.OrderService;

@Controller
public class OrderController {

	@Autowired
	private OrderService ordServ;
	
	@RequestMapping(value = "/showOrders", method = RequestMethod.GET)
	public String showOrder(Model m){
		
		ArrayList<Order> orders = ordServ.getOrders();
		m.addAttribute("orders", orders);
		return "showOrders";
	}
	
	@RequestMapping(value = "/addOrder", method = RequestMethod.GET)
	public String getOrder(@ModelAttribute("order1") Order ord, HttpServletRequest http){
		
		return "addOrder";
	}
	
	@RequestMapping(value = "/addOrder", method = RequestMethod.POST)
	public String postOrder(@Valid @ModelAttribute("order1") Order ord, BindingResult result, HttpServletRequest http, Model m) throws Exception{
		
		if(result.hasErrors()){
			
			return "addOrder";
		}
		
		else{
			ordServ.save(ord);
			ArrayList<Order> orders = ordServ.getOrders();
			m.addAttribute("orders", orders);
			return "showOrders";
		}
	}
}
