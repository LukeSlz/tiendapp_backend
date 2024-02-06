package com.example.tiendapp_backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@Table(name = "brands")
@With
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Brands implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "reference")
    private String reference;
}
