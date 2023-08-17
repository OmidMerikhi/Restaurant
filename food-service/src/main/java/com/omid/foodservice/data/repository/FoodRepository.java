package com.omid.foodservice.data.repository;

import com.omid.foodservice.data.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<Food,Integer> {
    Food getFoodById(Integer id);
    @Query("from Food f where f.name like :value or f.description like :value")
    List<Food> searchFood(@Param("value") String value);
}
