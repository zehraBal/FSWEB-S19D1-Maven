package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Vegetable;

import java.util.List;
import java.util.Optional;

public interface VegetableService {
    Vegetable save(Vegetable vegetable);
    Vegetable delete(long id);
    Vegetable getById(long id);
    List<Vegetable> getByPriceAsc();
    List<Vegetable> getByPriceDesc();
    List<Vegetable> searchByName(String name);
}
