package com.omid.foodservice.controller;

import com.omid.foodservice.data.entity.MaterialType;
import com.omid.foodservice.data.entity.RawMaterial;
import com.omid.foodservice.data.service.RawMaterialService;
import jakarta.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rawMaterials")
public class RawMaterialController {
    @Autowired
    private RawMaterialService rawMaterialService;

    @GetMapping
    public List<RawMaterial> getAll(){
        return rawMaterialService.getAllRawMaterial();
    }

    @GetMapping("/{id}")
    public RawMaterial get(@PathVariable("id") Integer id) throws Exception{
        return rawMaterialService.getRawMaterialById(id);
    }

    @GetMapping("/search/{value}")
    public List<RawMaterial> search(@PathVariable("value") String value){
        return rawMaterialService.searchRawMaterial(value);
    }

    @GetMapping("/byMaterialType/{type}")
    public List<RawMaterial> getByMaterialType(@PathVariable("type")MaterialType type){
        return rawMaterialService.getRawMaterialByMaterialType(type);
    }

    @PostMapping
    public RawMaterial add(@RequestBody RawMaterial rawMaterial){
        return rawMaterialService.addRawMaterial(rawMaterial);
    }

    @PatchMapping("/edit/{id}")
    public RawMaterial edit(@PathVariable("id") Integer id,@RequestBody RawMaterial rawMaterial) throws Exception{
        return rawMaterialService.editRawMaterial(id,rawMaterial);
    }
}
