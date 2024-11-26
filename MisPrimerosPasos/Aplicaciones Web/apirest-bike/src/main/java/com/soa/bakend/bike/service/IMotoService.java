package com.soa.bakend.bike.service;

import com.soa.bakend.bike.model.Moto;
import com.soa.bakend.bike.response.MotoResponseRest;
import org.springframework.http.ResponseEntity;

public interface IMotoService {
    public ResponseEntity<MotoResponseRest> getAllMoto();

   public ResponseEntity<MotoResponseRest> getMotoById(Long id);

   public ResponseEntity<MotoResponseRest> getMotoByVin(int vin);

   public ResponseEntity<MotoResponseRest> buildMoto(Moto moto);

 public ResponseEntity<MotoResponseRest> updateMoto(Moto moto, Long id);

   public ResponseEntity<MotoResponseRest> deleteMoto(Long id);

}

