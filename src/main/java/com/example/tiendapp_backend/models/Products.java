package com.example.tiendapp_backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "products")
@With
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Products implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "size")
    private Size size;

    @Column(name = "notes")
    private String notes;

    @ManyToOne
    @JoinColumn(name = "brand_id", nullable = false)
    private Brands brand;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "ship_date")
    private Date shipDate;
}
