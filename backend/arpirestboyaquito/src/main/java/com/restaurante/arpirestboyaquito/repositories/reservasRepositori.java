package com.restaurante.arpirestboyaquito.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurante.arpirestboyaquito.models.reservas;

@Repository
public interface reservasRepositori extends JpaRepository<reservas, Long>{
    
}