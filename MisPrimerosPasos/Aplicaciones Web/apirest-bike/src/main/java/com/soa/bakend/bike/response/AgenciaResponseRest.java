package com.soa.bakend.bike.response;

public class AgenciaResponseRest extends ResponseRest{

    private AgenciaResponse agenciaResponse=new AgenciaResponse();

    public AgenciaResponse getAgenciaResponse() {return agenciaResponse;    }
    public void setAgenciaResponse(AgenciaResponse agenciaResponse) {
        this.agenciaResponse = agenciaResponse;
    }
}
