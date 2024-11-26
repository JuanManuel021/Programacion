package com.soa.bakend.bike.response;

import com.soa.bakend.bike.model.Moto;

import java.util.List;

public class MotoResponse {
    private List<Moto> motos;
    public List<Moto> getMotos(){return motos;}

    public void setMotos(List<Moto> motos) {
        this.motos = motos;
    }
}
