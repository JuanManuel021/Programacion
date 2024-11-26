package com.soa.bakend.bike.response;

public class MotoResponseRest extends ResponseRest {
    private MotoResponse motoResponse=new MotoResponse();
    public MotoResponse getMotoResponse(){return motoResponse;}
    public void setMotoResponse(MotoResponse motoResponse){
        this.motoResponse=motoResponse;
    }
}
