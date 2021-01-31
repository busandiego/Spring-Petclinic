package com.lee.petclinic.service;

import com.lee.petclinic.dto.VetsDto;
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

    public List<VetsDto> checkFindAll(){
         return vetsRepository.findAll();
    }

}
