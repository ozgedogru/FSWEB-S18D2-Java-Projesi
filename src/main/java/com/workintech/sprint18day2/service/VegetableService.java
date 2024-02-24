package com.workintech.sprint18day2.service;

import com.workintech.sprint18day2.entity.Vegetable;

import java.util.List;

public interface VegetableService {
    List<Vegetable> getAllVegetablesOrderByPriceAsc();
    List<Vegetable> getAllVegetablesOrderByPriceDesc();
    List<Vegetable> getVegetablesByNameContaining(String name);
    Vegetable getVegetableById(Long id);
    Vegetable saveOrUpdateVegetable(Vegetable vegetable);
    void deleteVegetable(Long id);
}
