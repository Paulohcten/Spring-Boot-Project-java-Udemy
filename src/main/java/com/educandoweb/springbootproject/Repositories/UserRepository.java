package com.educandoweb.springbootproject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoweb.springbootproject.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}