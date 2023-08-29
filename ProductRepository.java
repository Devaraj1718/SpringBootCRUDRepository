package com.example.demo.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.crud.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	 
}