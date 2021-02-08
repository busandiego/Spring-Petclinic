package com.lee.petclinic.service;

import com.lee.petclinic.dto.VetsDto;
import com.lee.petclinic.model.Owners;
import com.lee.petclinic.repository.OwnersRepository;
import com.lee.petclinic.repository.VetsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class OwnersService {

    //private final VetsRepository vetsRepository;

    OwnersRepository ownersRepository;

    public OwnersService(OwnersRepository ownersRepository) {
        this.ownersRepository = ownersRepository;
    }


    @Transactional
    public List<Owners> findAll() {

        List<Owners> owner = ownersRepository.findAll();

        return owner;
    }
    //String lastName =model.get("lastName")
    // Map<String, Object> model,

    @Transactional(readOnly = true)
    public List<Owners> lastNameSearch(Owners owners) {

        String lastName = owners.getLastName();
        if (lastName == null || lastName == "") {
            List<Owners> ownerList = ownersRepository.findAll();
            System.out.println("service: " + ownerList);
            return ownerList;
        } else {
            List<Owners> ownersList = (List<Owners>) ownersRepository.findByLastName(lastName);
            return ownersList;
        }
    }


    @Transactional
    public void addService(@ModelAttribute Owners owner) {
        System.out.println("service Owners값은?: " + owner);
        int result = ownersRepository.save(owner);

        if (result == 1) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }

    }


}
