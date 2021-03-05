package com.educandoweb.springbootproject.Services;


import com.educandoweb.springbootproject.Entities.Orders;
import com.educandoweb.springbootproject.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Orders> findAll(){
        return repository.findAll();
    }

    public Orders findById(Long id){
        Optional<Orders> obj = repository.findById(id);
        return obj.get();
    }
}