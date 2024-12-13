
package com.turism.demo.view;

import com.turism.demo.model.mTipoPersona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vTipoPersona extends CrudRepository<mTipoPersona, Integer> {
    // Puedes agregar métodos personalizados aquí si es necesario
}
