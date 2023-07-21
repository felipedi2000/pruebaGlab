package com.restaurante.arpirestboyaquito.services;

import java.util.List;
import com.restaurante.arpirestboyaquito.models.reservas;

public interface reservaservice {
    public List<reservas> obtenerall();
    public reservas guardar(reservas reserva);
    public reservas obtenerPorId(Long id);
    public void borrar(long id);
}
