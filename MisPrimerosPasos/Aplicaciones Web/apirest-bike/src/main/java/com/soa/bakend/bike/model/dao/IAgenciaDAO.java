package com.soa.bakend.bike.model.dao;

import com.soa.bakend.bike.model.Agencia;
import org.springframework.data.repository.CrudRepository;

public interface IAgenciaDAO extends CrudRepository<Agencia,Long> {
}
