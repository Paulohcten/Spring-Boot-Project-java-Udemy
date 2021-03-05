package com.educandoweb.springbootproject.Repositories;

import com.educandoweb.springbootproject.Entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long> {

}