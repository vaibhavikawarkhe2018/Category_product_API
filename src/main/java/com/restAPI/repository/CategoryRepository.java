package com.restAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restAPI.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>
{

}
