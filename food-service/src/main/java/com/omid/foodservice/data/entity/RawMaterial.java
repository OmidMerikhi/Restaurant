package com.omid.foodservice.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import javax.lang.model.element.Name;

@Entity
@Data
@JsonIgnoreProperties
@Table(name = "raw_material")
public class RawMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private MaterialType materialType;
    private String inventory;

    public RawMaterial(String name, MaterialType materialType, String inventory) {
        this.name = name;
        this.materialType = materialType;
        this.inventory = inventory;
    }

    public RawMaterial() {
    }

    @Override
    public String toString() {
        return "RawMaterial{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", materialType=" + materialType +
                ", inventory='" + inventory + '\'' +
                '}';
    }
}
