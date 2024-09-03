package com.workintech.s18d2.controller;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@AllArgsConstructor
//@NoArgsConstructor
//@Data
@RestController
@RequestMapping("/fruit")
public class FruitController {

    private final FruitService fruitService;

    @Autowired
    public FruitController(FruitService fruitService){
        this.fruitService=fruitService;
    }

    @GetMapping
    public List<Fruit> getByPrice(){
        return fruitService.getByPriceAsc();
    }
    @GetMapping("/desc")
    public List<Fruit> getByDescPrice(){
        return fruitService.getByPriceDesc();
    }
    @GetMapping("/{id}")
    public Fruit getById(@PathVariable Long id){
        return fruitService.getById(id);
    }

    @GetMapping("/name/{name}")
    public List<Fruit> getByName(@PathVariable String name){
       return fruitService.searchByName(name);
    }

    @PostMapping
    public Fruit save(@RequestBody Fruit fruit){
        return fruitService.save(fruit);
    }
    @DeleteMapping("/{id}")
    public Fruit delete(@PathVariable long id){
        return fruitService.delete(id);
    }

}