package com.restAPI.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restAPI.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>
{

}
