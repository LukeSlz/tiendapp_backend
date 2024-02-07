package com.example.tiendapp_backend.repositories;

import com.example.tiendapp_backend.models.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Products, Integer> {
}
