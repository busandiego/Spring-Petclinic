package com.lee.petclinic.repository;

import com.lee.petclinic.model.Vets;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VetsRepository {

public List<Vets> findAll();



}
