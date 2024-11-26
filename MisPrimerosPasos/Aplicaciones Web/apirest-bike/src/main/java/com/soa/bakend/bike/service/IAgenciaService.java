package com.soa.bakend.bike.service;

import com.soa.bakend.bike.model.Agencia;
import com.soa.bakend.bike.response.AgenciaResponseRest;
import org.springframework.http.ResponseEntity;

public interface IAgenciaService {

        public ResponseEntity<AgenciaResponseRest> getAgencia();
        public ResponseEntity<AgenciaResponseRest> buscarPorId(Long id);
        public ResponseEntity<AgenciaResponseRest> crear(Agencia agencia);
        public ResponseEntity<AgenciaResponseRest> modificar(Agencia agencia, Long id);
        public ResponseEntity<AgenciaResponseRest> borrar(Long id);
    }
