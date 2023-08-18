package com.omid.foodservice.data.repository;

import com.omid.foodservice.data.entity.MaterialType;
import com.omid.foodservice.data.entity.RawMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RawMaterialRepository extends JpaRepository<RawMaterial,Integer> {
    RawMaterial getRawMaterialById(Integer id);
    @Query("from RawMaterial r where r.name like :value")
    List<RawMaterial> searchRawMaterial(@Param("value") String value);

    List<RawMaterial> findByMaterialType(MaterialType materialType);

}
