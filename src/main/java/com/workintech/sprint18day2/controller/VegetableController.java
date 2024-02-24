package com.workintech.sprint18day2.controller;

import com.workintech.sprint18day2.entity.Vegetable;
import com.workintech.sprint18day2.service.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workintech/vegetables")
public class VegetableController {

    @Autowired
    private VegetableService vegetableService;

    @GetMapping
    public List<Vegetable> getAllVegetablesOrderByPriceAsc() {
        return vegetableService.getAllVegetablesOrderByPriceAsc();
    }

    @GetMapping("/{id}")
    public Vegetable getVegetableById(@PathVariable Long id) {
        return vegetableService.getVegetableById(id);
    }

    @GetMapping("/desc")
    public List<Vegetable> getAllVegetablesOrderByPriceDesc() {
        return vegetableService.getAllVegetablesOrderByPriceDesc();
    }

    @PostMapping
    public Vegetable saveOrUpdateVegetable(@RequestBody Vegetable vegetable) {
        return vegetableService.saveOrUpdateVegetable(vegetable);
    }

    @PostMapping("/{name}")
    public List<Vegetable> getVegetablesByNameContaining(@PathVariable String name) {
        return vegetableService.getVegetablesByNameContaining(name);
    }

    @DeleteMapping("/{id}")
    public void deleteVegetable(@PathVariable Long id) {
        vegetableService.deleteVegetable(id);
    }
}
