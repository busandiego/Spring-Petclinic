package com.lee.petclinic.service;

import com.lee.petclinic.dto.VetsDto;
import com.lee.petclinic.model.Owners;
import com.lee.petclinic.repository.OwnersRepository;
import com.lee.petclinic.repository.VetsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OwnersService {

    //private final VetsRepository vetsRepository;

    OwnersRepository ownersRepository;

    public OwnersService(OwnersRepository ownersRepository){
        this.ownersRepository = ownersRepository;
    }


    @Transactional
    public void addService(Owners owner) {
        System.out.println("service Owners값은?: " + owner);
        int result = ownersRepository.save(owner);

        if(result == 1) {
            System.out.println("성공");
        } else{
            System.out.println("실패");
        }

    }



}
