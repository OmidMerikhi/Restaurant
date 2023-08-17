package com.omid.foodservice.data.service;

import com.omid.foodservice.data.entity.Food;
import com.omid.foodservice.data.repository.FoodRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    @Autowired
    private FoodRepository foodRepository;

    public Food addFood(Food food){
        return foodRepository.save(food);
    }

    public Food editFood(Integer id,Food food) throws Exception{
        Food foodDb=getFood(id);
        if(food.getName()!=null){
            foodDb.setName(food.getName());
        }
        if(food.getFoodType()!=null){
            foodDb.setFoodType(food.getFoodType());
        }
        if(food.getDescription()!=null){
            foodDb.setDescription(food.getDescription());
        }
        if(food.getPrice()!=0){
            foodDb.setPrice(food.getPrice());
        }
        return foodRepository.saveAndFlush(foodDb);
    }

    public Food getFood(Integer id) throws Exception{
        Food food= foodRepository.getFoodById(id);
        if(food==null){
            throw new Exception("غذایی با این مشخصه یافت نشد");
        }
        return food;
    }

    public List<Food> getAllFood(){
        return foodRepository.findAll();
    }

    public List<Food> searchFood(String value){
        return foodRepository.searchFood("%"+value+"%");
    }




}
