package com.soa.bakend.bike.service;

import com.soa.bakend.bike.response.MotoResponseRest;

import com.soa.bakend.bike.model.Moto;
import com.soa.bakend.bike.model.dao.IMotoDAO;

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
public class MotoServiceImpl implements IMotoService {
    private static final Logger log= LoggerFactory.getLogger(MotoServiceImpl.class);

    @Autowired
    private IMotoDAO motoDAO;

    @Override
    @Transactional(readOnly = true)
    public ResponseEntity<MotoResponseRest> getAllMoto(){
        log.info("Inicio metodo Example");
        MotoResponseRest response =new MotoResponseRest();
        try {
            List<Moto> moto=(List<Moto>) motoDAO.findAll();
            response.getMotoResponse().setMotos(moto);
            response.setMetada("Resultado encontrado","00","Respuesta correcta");


        } catch (Exception e) {
            response.setMetada("Resultado con error","01","Error al buscar");
            log.error("Error al buscar",e.getMessage());
            e.getStackTrace();
            return new ResponseEntity<MotoResponseRest>(response,HttpStatus.INTERNAL_SERVER_ERROR);


        }
        return new ResponseEntity<MotoResponseRest>(response, HttpStatus.OK);
    }
    @Override
    @Transactional(readOnly = true)
    public ResponseEntity<MotoResponseRest> getMotoById(Long id) {
        log.info("Inicio metodo buscar por ID");
        MotoResponseRest response = new MotoResponseRest();
        List<Moto> list = new ArrayList<Moto>();
        try {
            Optional<Moto> moto = motoDAO.findById(id);
            if (moto.isPresent()) {
                list.add(moto.get());
                response.getMotoResponse().setMotos(list);
                response.setMetada("Resultado OK", "00", "Respuesta exitosa");

            } else {
                log.info("No se encontro el moto");
                response.getMotoResponse().setMotos(list);
                response.setMetada("Resultado ERROR", "-01", "Error al buscar");
            }

        } catch (Exception e) {
            response.setMetada("Resultado ERROR", "-01", "Error al buscar");
            log.error("Error al buscar", e.getMessage());
            e.getStackTrace();
            return new ResponseEntity<MotoResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<MotoResponseRest>(response, HttpStatus.OK);
    }

    @Override
    @Transactional(readOnly = true)
    public ResponseEntity<MotoResponseRest> getMotoByVin(int vin) {
        log.info("Inicio metodo buscar por VIN");
        MotoResponseRest response = new MotoResponseRest();
        List<Moto> list = new ArrayList<>();

        try {
            Optional<Moto> moto = motoDAO.findByVin(vin); // Usa el método findByVin
            if (moto.isPresent()) {
                list.add(moto.get());
                response.getMotoResponse().setMotos(list);
                response.setMetada("Resultado OK", "00", "Respuesta exitosa");
            } else {
                log.info("No se encontró la moto con el VIN especificado");
                response.getMotoResponse().setMotos(list);
                response.setMetada("Resultado ERROR", "-01", "Error al buscar");
            }
        } catch (Exception e) {
            response.setMetada("Resultado ERROR", "-01", "Error al buscar");
            log.error("Error al buscar", e.getMessage());
            e.printStackTrace(); // Mejor usa e.printStackTrace() para imprimir la traza completa
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @Override
    @Transactional
    public ResponseEntity<MotoResponseRest> buildMoto(Moto moto) {
        log.info("Creando una moto");
        MotoResponseRest response = new MotoResponseRest();
        List<Moto> list = new ArrayList<Moto>();
        try {
            Moto categoriaGuardar = motoDAO.save(moto);
            if (categoriaGuardar != null) {
                list.add(categoriaGuardar);
                response.getMotoResponse().setMotos(list);
                response.setMetada("Resultado OK", "00", "Respuesta exitosa");

            } else {
                log.info("No se encontro el moto");
                response.setMetada("Respuesta no creada", "-1", "Error al crear");
                return new ResponseEntity<MotoResponseRest>(response, HttpStatus.BAD_REQUEST);
            }

        } catch (Exception e) {
            response.setMetada("Resultado ERROR", "-01", "Error al crear");
            log.error("Error al guardar moto", e.getMessage());
            e.getStackTrace();
            return new ResponseEntity<MotoResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<MotoResponseRest>(response, HttpStatus.OK);
    }

    @Override
    @Transactional
    public ResponseEntity<MotoResponseRest> updateMoto(Moto moto, Long id) {
        log.info("Creando una moto");
        MotoResponseRest response = new MotoResponseRest();
        List<Moto> list = new ArrayList<Moto>();
        try {
            Optional<Moto> categoriaBuscar = motoDAO.findById(id);
            if (categoriaBuscar.isPresent()) {
                categoriaBuscar.get().setModelo(moto.getModelo());
                categoriaBuscar.get().setPrecio(moto.getPrecio());
                categoriaBuscar.get().setTipo(moto.getTipo());
                categoriaBuscar.get().setVersion(moto.getVersion());
                categoriaBuscar.get().setYear(moto.getYear());
                categoriaBuscar.get().setEdo(moto.getEdo());
                categoriaBuscar.get().setVin(moto.getVin());
                categoriaBuscar.get().setAgencia(moto.getAgencia());


                Moto categoriaActualizar = motoDAO.save(categoriaBuscar.get());
                if (categoriaActualizar != null) {
                    list.add(categoriaActualizar);
                    response.getMotoResponse().setMotos(list);
                    response.setMetada("Resultado OK", "00", "Respuesta exitosa");
                } else {
                    log.info("No se encontro el moto");
                    response.setMetada("Respuesta no creada", "-1", "Error al modificar");
                    return new ResponseEntity<MotoResponseRest>(response, HttpStatus.BAD_REQUEST);
                }
            } else {
                log.info("No se encontro el moto");
                response.setMetada("Respuesta no creada", "-1", "Error al crear");
                return new ResponseEntity<MotoResponseRest>(response, HttpStatus.BAD_REQUEST);
            }

        } catch (Exception e) {
            response.setMetada("Resultado ERROR", "-01", "Error al buscar");
            log.error("Error al guardar moto", e.getMessage());
            e.getStackTrace();
            return new ResponseEntity<MotoResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<MotoResponseRest>(response, HttpStatus.OK);
    }

    @Override
    @Transactional
    public ResponseEntity<MotoResponseRest> deleteMoto(Long id) {
        log.info("Inicio metodo borrar");
        MotoResponseRest response = new MotoResponseRest();
        List<Moto> list = new ArrayList<>();
        try {
            motoDAO.deleteById(id);
            response.setMetada("Resultado OK", "00", "Eliminación exitosa");

        } catch (Exception e) {
            response.setMetada("Resultado ERROR", "-01", "Error al buscar");
            log.error("Error al buscar", e.getMessage());
            e.getStackTrace();
            return new ResponseEntity<MotoResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<MotoResponseRest>(response, HttpStatus.OK);
    }

}
