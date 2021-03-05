package com.educandoweb.springbootproject.Repositories;

import com.educandoweb.springbootproject.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}