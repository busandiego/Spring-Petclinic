package com.lee.petclinic.dto;


import com.lee.petclinic.model.Vets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VetsDto {

    private Integer id;

    private String name;

    private String specialities;

    public VetsDto() {
        this.id = 0;
        this.name = "";
        this.specialities = "";
    }

    public VetsDto(Integer id, String name, String specialities) {
        this.id = id;
        this.name = name;
        this.specialities = specialities;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialities() {
        return specialities;
    }

    public void setSpecialities(String name) {
        this.specialities = name;
    }

    public List<String> getSpecialitiesList() {
        return new ArrayList<String>(Arrays.asList(specialities.split(",")));
    }

    public Vets toVets(){
        return new Vets(id,name,specialities,null);
    }

    @Override
    public String toString() {
        return "VetsDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specialities='" + specialities + '\'' +
                '}';
    }
}
