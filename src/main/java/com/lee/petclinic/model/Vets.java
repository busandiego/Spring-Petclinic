package com.lee.petclinic.model;

import com.lee.petclinic.dto.VetsDto;

import java.sql.Timestamp;
import java.util.List;

public class Vets {

    private Integer id;
    private String name;
    private String specialities;
    private Timestamp createdDate;


    public Vets(Integer id, String name, String specialities, Timestamp createdDate) {
        this.id = id;
        this.name = name;
        this.specialities = specialities;
        this.createdDate = createdDate;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialities() {
        return specialities;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialities(String specialities)
    {
        this.specialities = specialities;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public VetsDto toVetsDto(){
        return new VetsDto(id,name,specialities);
    }
}
