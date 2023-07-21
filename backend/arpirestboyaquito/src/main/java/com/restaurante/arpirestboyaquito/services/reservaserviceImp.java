package com.restaurante.arpirestboyaquito.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurante.arpirestboyaquito.models.reservas;
import com.restaurante.arpirestboyaquito.repositories.reservasRepositori;

@Service
public class reservaserviceImp implements reservaservice {

    @Autowired
    reservasRepositori reservasRepositoriaRep;
    
    @Override
    public List<reservas> obtenerall() {
        return reservasRepositoriaRep.findAll();
    }

    @Override
    public reservas guardar(reservas reserva) {
        return reservasRepositoriaRep.save(reserva);
    }

    @Override
    public reservas obtenerPorId(Long id) {
        return reservasRepositoriaRep.findById(id).orElse(null);
    }

    @Override
    public void borrar(long id) {
        reservasRepositoriaRep.deleteById(id);
    }
}
