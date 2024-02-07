package com.example.tiendapp_backend.services;

import com.example.tiendapp_backend.dtos.BrandDto;
import com.example.tiendapp_backend.repositories.BrandRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServices {
    private final BrandRepository brandRepository;

    public BrandServices(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    /**
     * Read method to get all the items.
     * No params are used
     * @return List of the values. Type of DTO
     */
    public ResponseEntity<List<BrandDto>> findAll(){
        var a = brandRepository.findAll();
        System.out.println(a);      //Testing on console
        return new ResponseEntity(a, HttpStatus.OK);
    }
}
