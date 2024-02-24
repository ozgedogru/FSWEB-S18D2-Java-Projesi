package com.workintech.sprint18day2.service;

import com.workintech.sprint18day2.entity.Fruit;

import java.util.List;

public interface FruitService {
    List<Fruit> getAllFruitsOrderByPriceAsc();
    List<Fruit> getAllFruitsOrderByPriceDesc();
    List<Fruit> getFruitsByNameContaining(String name);
    Fruit getFruitById(Long id);
    Fruit saveOrUpdateFruit(Fruit fruit);
    void deleteFruit(Long id);
}
