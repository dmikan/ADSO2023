package com.turism.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//ANOTACIONES
@Entity
@Table(name="tiposDocumento")
public class mTipoPersona {
    //ANOTACIONES
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTipoDocumento;
    private String nombreTipo;
    
    public mTipoPersona() {
    }

    public mTipoPersona(int idTipoDocumento, String nombreTipo) {
        this.idTipoDocumento = idTipoDocumento;
        this.nombreTipo = nombreTipo;
    }

    public int getId() {
        return idTipoDocumento;
    }

    public void setId(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getName() {
        return nombreTipo;
    }

    public void setName(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
    
        
    
}