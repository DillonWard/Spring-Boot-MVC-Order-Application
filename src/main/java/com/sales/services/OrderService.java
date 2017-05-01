package com.sales.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.exceptions.IDException;
import com.sales.exceptions.StockException;
import com.sales.models.Customer;
import com.sales.models.Order;
import com.sales.models.Product;
import com.sales.repositories.CustomerRepos;
import com.sales.repositories.OrderRepos;
import com.sales.repositories.ProductRepos;

@Service("OrderService")
public class OrderService  {
	
	@Autowired
	private OrderRepos ordRepos;
	
	@Autowired
	private CustomerRepos custRepos;
	
	@Autowired 
	private ProductRepos prodRepos;
	
	private Customer cust;
	private Product prod;
	
	private DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private Date date = new Date();
	
	public Order save(Order ord) throws Exception{
		
		cust = custRepos.findOne(ord.getCust().getcId());
		prod = prodRepos.findOne(ord.getProd().getpId());
		
		if(cust == null){
			throw new IDException("#### CUSTOMER ID CANNOT BE EMPTY ####");
		} // if the customer is left empty
		else if(prod == null){
			throw new IDException("#### PRODUCT ID CANNOT BE EMPTY ####");
		} // if the product is left empty
		else if(ord.getCust().getcId() != cust.getcId()){
			throw new IDException("#### INVALID CUSTOMER ID ####");
		} // if the customer id does not exist
		else if(ord.getProd().getpId() != prod.getpId()){
			throw new IDException("#### INVALID PRODUCT ID ####");
		}// if the product id does not exist
		else if(ord.getQty() > prod.getQtyInStock()){
			throw new StockException("#### NOT ENOUGH OF REQUESTED ITEM IN STOCK ####");
		} // if the number of stock requested is larger than what is in stock
		
		else{
			// if no errors, make an order
			// lowers stock qty after order
			prod.setQtyInStock(prod.getQtyInStock() - ord.getQty());
			ord.setOrderDate(sdf.format(date)); // set date of order
			ord.getCust().setcName(cust.getcName()); // set the customer name
			ord.getProd().setpDesc(prod.getpDesc()); // set the product desc
			ordRepos.save(ord); // saves the order
			return ordRepos.save(ord); // returns the order

		}
	}
	
	public ArrayList<Order> getOrders(){
		
		return(ArrayList<Order>) ordRepos.findAll();
	} // returns the orders
}