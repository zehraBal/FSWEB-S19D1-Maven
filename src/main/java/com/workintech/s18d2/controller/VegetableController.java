package com.workintech.s18d2.controller;

import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.services.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vegetable")
public class VegetableController {
    private VegetableService vegetableService;
    @Autowired
    public VegetableController(VegetableService vegetableService){
        this.vegetableService=vegetableService;
    }

    @GetMapping
    public List<Vegetable> getByPrice(){
        return vegetableService.getByPriceAsc();
    }
    @GetMapping("/desc")
    public List<Vegetable> getByDescPrice(){
        return vegetableService.getByPriceDesc();
    }
    @GetMapping("/{id}")
    public Vegetable getById(@PathVariable Long id){
        return vegetableService.getById(id);
    }

    @GetMapping("/{name}")
    public List<Vegetable> getByName(@PathVariable String name){
        return vegetableService.searchByName(name);
    }

    @PostMapping
    public Vegetable save(@RequestBody Vegetable vegetable){
        return vegetableService.save(vegetable);
    }

    @DeleteMapping("/{id}")
    public Vegetable delete(@PathVariable long id){
        return  vegetableService.delete(id);
    }

}
