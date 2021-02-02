package com.lee.petclinic.repository;

import com.lee.petclinic.dto.OwnersDto;
import com.lee.petclinic.dto.VetsDto;
import com.lee.petclinic.model.Owners;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnersRepository {
    //List<OwnersDto> findAll();
    List<Owners> Post(Integer id);
    int save(Owners owner);
}
