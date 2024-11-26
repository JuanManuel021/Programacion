package com.soa.bakend.bike.response;

import com.soa.bakend.bike.model.Agencia;

import java.util.List;

public class AgenciaResponse {
    private List<Agencia> agencias;
    public List<Agencia> getAgencias() {
        return agencias;
    }
    public void setAgencias(List<Agencia> agencias) {
        this.agencias = agencias;
    }
}

