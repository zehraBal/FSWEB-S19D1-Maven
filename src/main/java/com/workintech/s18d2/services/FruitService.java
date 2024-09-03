package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;

import java.util.List;
import java.util.Optional;

public interface FruitService {
    Fruit save(Fruit fruit);
    Fruit getById(long id);
    Fruit delete(long id);
    List<Fruit> getByPriceAsc();
    List<Fruit> getByPriceDesc();
    List<Fruit> searchByName(String name);
}
