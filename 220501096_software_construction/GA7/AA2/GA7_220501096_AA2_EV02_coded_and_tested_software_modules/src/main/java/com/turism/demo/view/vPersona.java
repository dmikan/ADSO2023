/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turism.demo.view;

import com.turism.demo.model.mPersona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vPersona extends CrudRepository<mPersona, Integer> {
    // Puedes agregar métodos personalizados aquí si es necesario
}

