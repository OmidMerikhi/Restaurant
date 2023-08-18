package com.omid.foodservice.data.service;

import com.omid.foodservice.data.entity.MaterialType;
import com.omid.foodservice.data.entity.RawMaterial;
import com.omid.foodservice.data.repository.RawMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RawMaterialService {
    @Autowired
    private RawMaterialRepository rawMaterialRepository;

    public List<RawMaterial> getAllRawMaterial(){
        return rawMaterialRepository.findAll();
    }

    public RawMaterial getRawMaterialById(Integer id)throws Exception{
        RawMaterial rawMaterial= rawMaterialRepository.getRawMaterialById(id);
        if(rawMaterial==null){
            throw new Exception("مواد اولیه با این مشخصه یافت نشد!");
        }
        return rawMaterial;
    }

    public RawMaterial addRawMaterial(RawMaterial rawMaterial){
        return rawMaterialRepository.save(rawMaterial);
    }

    public RawMaterial editRawMaterial(Integer id,RawMaterial rawMaterial)throws Exception{
        RawMaterial rawMaterialDb=getRawMaterialById(id);
        if(rawMaterial.getName()!=null){
            rawMaterialDb.setName(rawMaterialDb.getName());
        }
        if(rawMaterial.getMaterialType()!=null){
            rawMaterialDb.setMaterialType(rawMaterial.getMaterialType());
        }
        if(rawMaterial.getInventory()!=null){
            rawMaterialDb.setInventory(rawMaterial.getInventory());
        }
        return rawMaterialRepository.saveAndFlush(rawMaterialDb);
    }

    public List<RawMaterial> searchRawMaterial(String value){
        return rawMaterialRepository.searchRawMaterial("%"+value+"%");
    }

    public List<RawMaterial> getRawMaterialByMaterialType(MaterialType materialType){
        return rawMaterialRepository.findByMaterialType(materialType);
    }

}
