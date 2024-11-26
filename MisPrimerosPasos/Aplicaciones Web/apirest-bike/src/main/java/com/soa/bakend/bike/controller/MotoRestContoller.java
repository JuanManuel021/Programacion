package com.soa.bakend.bike.controller;

/*
    Objetos
 */

import com.soa.bakend.bike.model.Moto;
import com.soa.bakend.bike.model.Moto;
import com.soa.bakend.bike.model.dao.IMotoDAO;
import com.soa.bakend.bike.response.MotoResponseRest;
import com.soa.bakend.bike.response.MotoResponseRest;
import com.soa.bakend.bike.service.MotoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class MotoRestContoller {

    @Autowired
    private IMotoDAO example;
    @Autowired
    private MotoServiceImpl motoServiceImpl;

    @GetMapping("/motos")
    public ResponseEntity<MotoResponseRest> ConsultaMoto(){
        ResponseEntity<MotoResponseRest> response = motoServiceImpl.getAllMoto();
        return response;
    }
    @GetMapping("/motos/id/{id}")
    public ResponseEntity<MotoResponseRest> consultaPorId(@PathVariable Long id){
        ResponseEntity<MotoResponseRest> response = motoServiceImpl.getMotoById(id);
        return response;
    }
    @GetMapping("/motos/vin/{vin}")
    public ResponseEntity<MotoResponseRest> consultaPorVin(@PathVariable int vin){
        ResponseEntity<MotoResponseRest> response = motoServiceImpl.getMotoByVin(vin);
        return response;
    }
    @PostMapping("/motos")
    public ResponseEntity<MotoResponseRest> crear(@RequestBody Moto request){
        ResponseEntity<MotoResponseRest> response = motoServiceImpl.buildMoto(request);
        return response;
    }
    @PutMapping("/motos/{id}")
    public ResponseEntity<MotoResponseRest> modificar(@RequestBody Moto request, @PathVariable Long id){
        ResponseEntity<MotoResponseRest> response = motoServiceImpl.updateMoto(request,id);
        return response;
    }
    @DeleteMapping("/motos/{id}")
    public ResponseEntity<MotoResponseRest> borrar( @PathVariable Long id){
        ResponseEntity<MotoResponseRest> response = motoServiceImpl.deleteMoto(id);
        return response;
    }

}




