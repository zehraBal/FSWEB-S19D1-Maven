package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="vegetable",schema="fsweb")
public class Vegetable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long  id;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private double price;

    @Column(name="grown_On_Tree")
    private boolean isGrownOnTree;
}
