package com.workintech.sprint18day2.repository;

import com.workintech.sprint18day2.entity.Fruit;
import com.workintech.sprint18day2.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitServiceImpl implements FruitService {

    @Autowired
    private FruitRepository fruitRepository;

    @Override
    public List<Fruit> getAllFruitsOrderByPriceAsc() {
        return fruitRepository.findAllByOrderByPriceAsc();
    }

    @Override
    public List<Fruit> getAllFruitsOrderByPriceDesc() {
        return fruitRepository.findAllByOrderByPriceDesc();
    }

    @Override
    public List<Fruit> getFruitsByNameContaining(String name) {
        return fruitRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public Fruit getFruitById(Long id) {
        return fruitRepository.findById(id).orElse(null);
    }

    @Override
    public Fruit saveOrUpdateFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public void deleteFruit(Long id) {
        fruitRepository.deleteById(id);
    }

}
