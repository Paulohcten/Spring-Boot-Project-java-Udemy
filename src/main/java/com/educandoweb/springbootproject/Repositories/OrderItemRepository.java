package com.educandoweb.springbootproject.Repositories;

import com.educandoweb.springbootproject.Entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}