package com.lee.petclinic.service;

import com.lee.petclinic.model.Vets;
import com.lee.petclinic.repository.VetsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VetsService {

    //private final VetsRepository vetsRepository;

    VetsRepository vetsRepository;

    public VetsService(VetsRepository vetsRepository){
        this.vetsRepository = vetsRepository;
    }


    public List<Vets> checkFindAll(){

         List<Vets> vets = vetsRepository.findAll();

        System.out.println("vets: "+ vets);




         return vets;
    }




}
