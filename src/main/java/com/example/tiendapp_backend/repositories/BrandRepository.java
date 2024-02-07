package com.example.tiendapp_backend.repositories;

import com.example.tiendapp_backend.models.Brands;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends CrudRepository<Brands, Integer> {
}
