package com.turism.demo.interfaceService;

import com.turism.demo.model.mTipoPersona;
import java.util.List;
import java.util.Optional;

public interface iSTipoPersona {
    public List<mTipoPersona> listarTP();
    public Optional<mTipoPersona> listarIdTP(int id);
    public int saveTP(mTipoPersona mTP);
    public void deleteTP(int id);
}
