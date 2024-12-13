
package com.turism.demo.service;

import com.turism.demo.interfaceService.iSPersona;
import com.turism.demo.model.mPersona;
import com.turism.demo.view.vPersona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class sPersona implements iSPersona {
    
    @Autowired
    private vPersona vP;

    @Override
    public List<mPersona> listar() {
        return (List<mPersona>) vP.findAll();
    }

    @Override
    public Optional<mPersona> listarId(int id) {
        return vP.findById(id);
    }
    
    @Override
    public int save(mPersona mP) {
        int res = 0;
        mPersona mPerson = vP.save(mP); 
    
        if (mPerson != null) {
         res = 1;
        }
    
        return res;
    }

    @Override
    public void delete(int id) {
        vP.deleteById(id);
    }

}
