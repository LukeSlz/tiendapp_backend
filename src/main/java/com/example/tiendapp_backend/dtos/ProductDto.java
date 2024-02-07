package com.example.tiendapp_backend.dtos;

import com.example.tiendapp_backend.models.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {
    private Integer id;
    private String name;
    private Size size;
    private String notes;
    private String brand;
    private Integer quantity;
    private Date shipDate;
}
