package com.lee.petclinic.repository;

import com.lee.petclinic.dto.OwnersDto;
import com.lee.petclinic.dto.VetsDto;
import com.lee.petclinic.model.Owners;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Repository
public interface OwnersRepository {
    //List<OwnersDto> findAll();
    List<Owners> findAll();

    int save(Owners owner);

    Owners findById(Integer id);

    Collection<Owners> findByLastName(@Param("lastName") String lastName);

}
