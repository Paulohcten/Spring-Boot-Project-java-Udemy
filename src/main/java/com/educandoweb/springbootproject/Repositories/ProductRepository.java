package com.educandoweb.springbootproject.Repositories;

import com.educandoweb.springbootproject.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}