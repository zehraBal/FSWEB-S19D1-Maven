package com.workintech.s18d2.entity;

import jakarta.persistence.Entity;

@Entity
public class Vegetable {
    private long  id;
    private String name;
    private double price;
    private boolean isGrownOnTree;
}
