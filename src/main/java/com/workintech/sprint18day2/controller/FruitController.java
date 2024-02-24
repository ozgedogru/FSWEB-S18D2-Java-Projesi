package com.workintech.sprint18day2.controller;

import com.workintech.sprint18day2.entity.Fruit;
import com.workintech.sprint18day2.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workintech/fruits")
public class FruitController {
    @Autowired
    private FruitService fruitService;

    @GetMapping
    public List<Fruit> getAllFruitsOrderByPriceAsc() {
        return fruitService.getAllFruitsOrderByPriceAsc();
    }
    @GetMapping("/{id}")
    public Fruit getFruitById(@PathVariable Long id) {
        return fruitService.getFruitById(id);
    }

    @GetMapping("/desc")
    public List<Fruit> getAllFruitsOrderByPriceDesc() {
        return fruitService.getAllFruitsOrderByPriceDesc();
    }

    @PostMapping
    public Fruit saveOrUpdateFruit(@RequestBody Fruit fruit) {
        return fruitService.saveOrUpdateFruit(fruit);
    }

    @PostMapping("/{name}")
    public List<Fruit> getFruitsByNameContaining(@PathVariable String name) {
        return fruitService.getFruitsByNameContaining(name);
    }

    @DeleteMapping("/{id}")
    public void deleteFruit(@PathVariable Long id) {
        fruitService.deleteFruit(id);
    }
}
