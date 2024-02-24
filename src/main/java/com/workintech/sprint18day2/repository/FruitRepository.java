package com.workintech.sprint18day2.repository;

import com.workintech.sprint18day2.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit, Long> {

    @Query("SELECT f FROM Fruit f ORDER BY f.price DESC")
    List<Fruit> findAllByOrderByPriceDesc();

    @Query("SELECT f FROM Fruit f ORDER BY f.price ASC")
    List<Fruit> findAllByOrderByPriceAsc();

    List <Fruit> findByNameContainingIgnoreCase(String name);

}
