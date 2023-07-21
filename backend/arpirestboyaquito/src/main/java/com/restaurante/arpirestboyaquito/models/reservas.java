package com.restaurante.arpirestboyaquito.models;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class reservas implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id;
    
	private String nombre;
    
	private String apellidos;
    
	private String tipoDoc;
    
	private String identificacion;

	private String email;
    
	private String fecha;

	private String reserva;

	private String observaciones;

	private int cantpersonas;
    public reservas() {
		super();
	}
	public reservas(Long id, String nombre, String apellidos, String tipoDoc, String identificacion, String email, String fecha, String observaciones, int cantpersonas ) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
        this.tipoDoc = tipoDoc;
        this.identificacion = identificacion;
        this.email = email;
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.cantpersonas = cantpersonas;
	}
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getReserva() {
        return reserva;
    }
    public void setReserva(String reserva) {
        this.reserva = reserva;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public int getCantpersonas() {
        return cantpersonas;
    }
    public void setCantpersonas(int cantpersonas) {
        this.cantpersonas = cantpersonas;
    }
}
