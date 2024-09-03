package com.workintech.s18d2.services;

import com.workintech.s18d2.exceptions.PlantException;
import com.workintech.s18d2.repository.VegetableRepository;
import com.workintech.s18d2.entity.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VegetableServiceImpl implements VegetableService{

    private VegetableRepository vegetableRepository;
    @Autowired
    public VegetableServiceImpl(VegetableRepository vegetableRepository){
        this.vegetableRepository=vegetableRepository;
    }
    @Override
    public Vegetable save(Vegetable vegetable) {
        return  vegetableRepository.save(vegetable);
    }

    @Override
    public Vegetable  delete(long id) {
       Vegetable veg= getById(id);
       vegetableRepository.deleteById(id);
       return veg;
    }

    @Override
    public List<Vegetable> getByPriceDesc() {
        return vegetableRepository.getByPriceDesc();
    }

    @Override
    public List<Vegetable> searchByName(String name) {
        return vegetableRepository.searchByName(name);
    }

    @Override
    public List<Vegetable> getByPriceAsc() {
        return vegetableRepository.getByPriceAsc();
    }

    @Override
    public Vegetable getById(long id) {
        return vegetableRepository.findById(id).orElseThrow(()-> new PlantException("plant with given id is not exist", HttpStatus.NOT_FOUND));
    }
}
