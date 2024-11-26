package com.soa.bakend.bike.service;

import com.soa.bakend.bike.model.Agencia;
import com.soa.bakend.bike.model.dao.IAgenciaDAO;
import com.soa.bakend.bike.response.AgenciaResponseRest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AgenciaServicIempl implements IAgenciaService {
    private static final Logger log = LoggerFactory.getLogger(AgenciaServicIempl.class);
    @Autowired
    private IAgenciaDAO agenciaDao;

    @Override
    @Transactional(readOnly = true)
    public ResponseEntity<AgenciaResponseRest> getAgencia() {
        log.info("Inicio metodo categoria");
        AgenciaResponseRest response = new AgenciaResponseRest();
        try {
            List<Agencia> agencias = (List<Agencia>) agenciaDao.findAll();
            response.getAgenciaResponse().setAgencias(agencias);
            response.setMetada("Resultado OK", "00", "Respuesta exitosa");

        } catch (Exception e) {
            response.setMetada("Resultado ERROR", "-01", "Error al buscar");
            log.error("Error al buscar", e.getMessage());
            e.getStackTrace();
            return new ResponseEntity<AgenciaResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<AgenciaResponseRest>(response, HttpStatus.OK);
    }

    @Override
    @Transactional(readOnly = true)
    public ResponseEntity<AgenciaResponseRest> buscarPorId(Long id) {
        log.info("Inicio metodo buscar por ID");
        AgenciaResponseRest response = new AgenciaResponseRest();
        List<Agencia> list = new ArrayList<Agencia>();
        try {
            Optional<Agencia> categoria = agenciaDao.findById(id);
            if (categoria.isPresent()) {
                list.add(categoria.get());
                response.getAgenciaResponse().setAgencias(list);
                response.setMetada("Resultado OK", "00", "Respuesta exitosa");

            } else {
                log.info("No se encontro el categoria");
                response.getAgenciaResponse().setAgencias(list);
                response.setMetada("Resultado ERROR", "-01", "Error al buscar");
            }

        } catch (Exception e) {
            response.setMetada("Resultado ERROR", "-01", "Error al buscar");
            log.error("Error al buscar", e.getMessage());
            e.getStackTrace();
            return new ResponseEntity<AgenciaResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<AgenciaResponseRest>(response, HttpStatus.OK);
    }

    @Override
    @Transactional
    public ResponseEntity<AgenciaResponseRest> crear(Agencia categoria) {
        log.info("Creando una categoria");
        AgenciaResponseRest response = new AgenciaResponseRest();
        List<Agencia> list = new ArrayList<Agencia>();
        try {
            Agencia agenciaGuardar = agenciaDao.save(categoria);
            if (agenciaGuardar != null) {
                list.add(agenciaGuardar);
                response.getAgenciaResponse().setAgencias(list);
                response.setMetada("Resultado OK", "00", "Respuesta exitosa");

            } else {
                log.info("No se encontro el categoria");
                response.setMetada("Respuesta no creada", "-1", "Error al crear");
                return new ResponseEntity<AgenciaResponseRest>(response, HttpStatus.BAD_REQUEST);
            }

        } catch (Exception e) {
            response.setMetada("Resultado ERROR", "-01", "Error al crear");
            log.error("Error al guardar categoria", e.getMessage());
            e.getStackTrace();
            return new ResponseEntity<AgenciaResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<AgenciaResponseRest>(response, HttpStatus.OK);
    }

    @Override
    @Transactional
    public ResponseEntity<AgenciaResponseRest> modificar(Agencia agencia, Long id) {
        log.info("Creando una categoria");
        AgenciaResponseRest response = new AgenciaResponseRest();
        List<Agencia> list = new ArrayList<Agencia>();
        try {
            Optional<Agencia> categoriaBuscar = agenciaDao.findById(id);
            if (categoriaBuscar.isPresent()) {
                categoriaBuscar.get().setNombre(agencia.getNombre());
                categoriaBuscar.get().setDireccion(agencia.getDireccion());
                categoriaBuscar.get().setEdo(agencia.getEdo());
                categoriaBuscar.get().setGerente(agencia.getGerente());
                categoriaBuscar.get().setTelefono(agencia.getTelefono());

                Agencia AgenciaActualizar = agenciaDao.save(categoriaBuscar.get());
                if (AgenciaActualizar != null) {
                    list.add(AgenciaActualizar);
                    response.getAgenciaResponse().setAgencias(list);
                    response.setMetada("Resultado OK", "00", "Respuesta exitosa");
                } else {
                    log.info("No se encontro el categoria");
                    response.setMetada("Respuesta no creada", "-1", "Error al modificar");
                    return new ResponseEntity<AgenciaResponseRest>(response, HttpStatus.BAD_REQUEST);
                }
            } else {
                log.info("No se encontro el categoria");
                response.setMetada("Respuesta no creada", "-1", "Error al crear");
                return new ResponseEntity<AgenciaResponseRest>(response, HttpStatus.BAD_REQUEST);
            }

        } catch (Exception e) {
            response.setMetada("Resultado ERROR", "-01", "Error al buscar");
            log.error("Error al guardar categoria", e.getMessage());
            e.getStackTrace();
            return new ResponseEntity<AgenciaResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<AgenciaResponseRest>(response, HttpStatus.OK);
    }

    @Override
    @Transactional
    public ResponseEntity<AgenciaResponseRest> borrar(Long id) {
        log.info("Inicio metodo borrar");
        AgenciaResponseRest response = new AgenciaResponseRest();
        List<Agencia> list = new ArrayList<>();
        try {
            agenciaDao.deleteById(id);
            response.setMetada("Resultado OK", "00", "Eliminación exitosa");

        } catch (Exception e) {
            response.setMetada("Resultado ERROR", "-01", "Error al buscar");
            log.error("Error al buscar", e.getMessage());
            e.getStackTrace();
            return new ResponseEntity<AgenciaResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<AgenciaResponseRest>(response, HttpStatus.OK);
    }
}

