package com.omid.foodservice.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "food")
@Data
@JsonIgnoreProperties
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(name = "food_group")
    @Enumerated(EnumType.STRING)
    private FoodType foodType;
    private String description;
    private int price;

    public Food(String name, FoodType foodType, String description, int price) {
        this.name = name;
        this.foodType = foodType;
        this.description = description;
        this.price = price;
    }

    public Food() {
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", foodType=" + foodType +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
