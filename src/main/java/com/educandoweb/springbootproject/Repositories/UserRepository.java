package com.educandoweb.springbootproject.Repositories;

import com.educandoweb.springbootproject.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}