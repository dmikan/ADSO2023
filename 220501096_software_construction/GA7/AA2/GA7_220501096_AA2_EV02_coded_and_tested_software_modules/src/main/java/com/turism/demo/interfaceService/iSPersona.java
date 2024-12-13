
package com.turism.demo.interfaceService;

import com.turism.demo.model.mPersona;
import java.util.List;
import java.util.Optional;

public interface iSPersona {
    public List<mPersona> listar();
    public Optional<mPersona> listarId(int id);
    
    public int save(mPersona mP);
    public void delete(int id);
}
