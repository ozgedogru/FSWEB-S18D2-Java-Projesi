package com.workintech.sprint18day2.repository;

import com.workintech.sprint18day2.entity.Vegetable;
import com.workintech.sprint18day2.service.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VegetableServiceImpl implements VegetableService {

    @Autowired
    private VegetableRepository vegetableRepository;

    @Override
    public List<Vegetable> getAllVegetablesOrderByPriceAsc() {
        return vegetableRepository.findAllByOrderByPriceAsc();
    }

    @Override
    public List<Vegetable> getAllVegetablesOrderByPriceDesc() {
        return vegetableRepository.findAllByOrderByPriceDesc();
    }

    @Override
    public List<Vegetable> getVegetablesByNameContaining(String name) {
        return vegetableRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public Vegetable getVegetableById(Long id) {
        return vegetableRepository.findById(id).orElse(null);
    }

    @Override
    public Vegetable saveOrUpdateVegetable(Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }

    @Override
    public void deleteVegetable(Long id) {
        vegetableRepository.deleteById(id);
    }
}
