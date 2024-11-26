package com.soa.bakend.bike.controller;



import com.soa.bakend.bike.model.Agencia;
import com.soa.bakend.bike.response.AgenciaResponseRest;
import com.soa.bakend.bike.service.IAgenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@CrossOrigin(origins={"http://localhost:4200/"})
@RestController
@RequestMapping("/v1")
public class AgenciaRestController {
    @Autowired
    private IAgenciaService service;
    @GetMapping("/agencias")
    public ResponseEntity<AgenciaResponseRest> consultaCat(){
        ResponseEntity<AgenciaResponseRest> response = service.getAgencia();
        return response;
    }
    @GetMapping("/agencias/{id}")
    public ResponseEntity<AgenciaResponseRest> consultaPorId(@PathVariable Long id){
        ResponseEntity<AgenciaResponseRest> response = service.buscarPorId(id);
        return response;
    }
    @PostMapping("/agencias")
    public ResponseEntity<AgenciaResponseRest> crear(@RequestBody Agencia request){
        ResponseEntity<AgenciaResponseRest> response = service.crear(request);
        return response;
    }
    @PutMapping("/agencias/{id}")
    public ResponseEntity<AgenciaResponseRest> modificar(@RequestBody Agencia request, @PathVariable Long id){
        ResponseEntity<AgenciaResponseRest> response = service.modificar(request,id);
        return response;
    }
    @DeleteMapping("/agencias/{id}")
    public ResponseEntity<AgenciaResponseRest> borrar( @PathVariable Long id){
        ResponseEntity<AgenciaResponseRest> response = service.borrar(id);
        return response;
    }

}

