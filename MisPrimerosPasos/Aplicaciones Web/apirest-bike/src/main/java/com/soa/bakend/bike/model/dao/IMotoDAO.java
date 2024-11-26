package com.soa.bakend.bike.model.dao;


import com.soa.bakend.bike.model.Moto;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IMotoDAO extends CrudRepository< Moto, Long> {
    Optional<Moto> findById(Long id);
    Optional<Moto> findByVin(int vin);
}