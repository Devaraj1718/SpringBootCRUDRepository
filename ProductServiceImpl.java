package com.example.demo.crud.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.crud.model.Product;
import com.example.demo.crud.repository.ProductRepository;
import com.example.demo.crud.service.ProductServices;

@Service
public class ProductServiceImpl implements ProductServices {
	 
private ProductRepository productRepository;
	    public ProductServiceImpl(ProductRepository productRepository) {
	super();
	this.productRepository = productRepository;
}	     
	    public List<Product> listAllPro() {
	        return productRepository.findAll();
	    }
	     
	    public void savePro(Product product) {
	    	productRepository.save(product);
	    }
	     
	    public Product getPro(long id) {
	        return productRepository.findById(id).get();
	    }     
	    public void deletePro(long id) {
	    	productRepository.deleteById(id);
	    }
	}
 