package com.workintech.sprint18day2.repository;

import com.workintech.sprint18day2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {
    @Query("SELECT v FROM Vegetable v ORDER BY v.price DESC")
    List<Vegetable> findAllByOrderByPriceDesc();

    @Query("SELECT v FROM Vegetable v ORDER BY v.price ASC")
    List<Vegetable> findAllByOrderByPriceAsc();

    List<Vegetable> findByNameContainingIgnoreCase(String name);
}
