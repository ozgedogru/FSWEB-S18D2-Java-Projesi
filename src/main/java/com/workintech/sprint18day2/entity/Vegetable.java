package com.workintech.sprint18day2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "vegetable", schema = "workintech")

public class Vegetable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @NotNull(message = "Fiyat alani bos birakilamaz.")
    @Positive(message = "Fiyat negatif deger alamaz.")
    @Column(name = "price")
    private double price;

    @Column(name = "is_grown_on_tree")
    private boolean isGrownOnTree;

}
