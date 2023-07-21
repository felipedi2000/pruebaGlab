package com.restaurante.arpirestboyaquito.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurante.arpirestboyaquito.models.reservas;
import com.restaurante.arpirestboyaquito.services.reservaserviceImp;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class reservascontroler {
    @Autowired
    reservaserviceImp reservaservice;

    @GetMapping("/reservas")
    public List<reservas> obtenereservas(){
        return reservaservice.obtenerall();
    }

    @PostMapping("/guardar")
    public ResponseEntity<reservas> guardarReserva (@RequestBody reservas reserva){
        reservas nuevaRes = reservaservice.guardar(reserva);
        return new ResponseEntity<>(nuevaRes, HttpStatus.CREATED);
    }

    @GetMapping("/reservas/{id}")
    public ResponseEntity<reservas> buscareserva(@PathVariable Long id){
        reservas clienteId = reservaservice.obtenerPorId(id);
        return ResponseEntity.ok(clienteId);
    }

    @PutMapping("/reservas/{id}")
    public ResponseEntity<reservas> actualizar(@PathVariable long id,@RequestBody reservas reserva){
        reservas clienteId = reservaservice.obtenerPorId(id);
        clienteId.setNombre(reserva.getNombre());
        clienteId.setApellidos(reserva.getApellidos());
        clienteId.setTipoDoc(reserva.getTipoDoc());
        clienteId.setIdentificacion(reserva.getIdentificacion());
        clienteId.setEmail(reserva.getEmail());
        clienteId.setFecha(reserva.getFecha());
        clienteId.setReserva(reserva.getReserva());
        clienteId.setObservaciones(reserva.getObservaciones());
        clienteId.setCantpersonas(reserva.getCantpersonas());
        reservas clienteAct = reservaservice.guardar(clienteId);
        return new ResponseEntity<>(clienteAct, HttpStatus.CREATED);
    }

    @DeleteMapping("/reservas/{id}")
    public ResponseEntity<HashMap<String,Boolean>> borrarRes (@PathVariable Long id){
        this.reservaservice.borrar(id);
        HashMap<String,Boolean> estadoResElim = new HashMap<>();
        estadoResElim.put("eliminado",true);
        return ResponseEntity.ok(estadoResElim);
    }
}
