package com.omid.foodservice.controller;

import com.omid.foodservice.data.entity.Food;
import com.omid.foodservice.data.entity.FoodType;
import com.omid.foodservice.data.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @GetMapping
    public List<Food> getAll(){
        return foodService.getAllFood();
    }
    @GetMapping("/{id}")
    public Food get(@PathVariable("id") Integer id) throws Exception{
        return foodService.getFood(id);
    }

    @PostMapping
    public Food save(@RequestBody Food food){
        return foodService.addFood(food);
    }

    @PatchMapping("/edit/{id}")
    public Food edit(@PathVariable("id") Integer id,@RequestBody Food food)throws Exception{
        return foodService.editFood(id,food);
    }

    @GetMapping("/search/{value}")
    public List<Food> search(@PathVariable String value){
        return foodService.searchFood(value);
    }

    @GetMapping("/byFoodType/{type}")
    public List<Food> getByType(@PathVariable("type") FoodType foodType){
        return foodService.getByFoodType(foodType);
    }


}
