package com.lee.petclinic.repository;

import com.lee.petclinic.dto.VetsDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VetsRepository {
    List<VetsDto> findAll();
}
