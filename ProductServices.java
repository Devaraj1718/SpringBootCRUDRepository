package com.example.demo.crud.service;

import java.util.List;

import com.example.demo.crud.model.Product;

public interface ProductServices {
	 public List<Product> listAllPro();
	  
	     
	    public void savePro(Product product);
	   
	    public Product getPro(long id);
	   
	    public void deletePro(long id);
	    
}
