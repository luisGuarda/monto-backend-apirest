package com.bcp.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bcp.pe.entity.TipoCambioEntity;

@Repository
public interface TipoCambioRepository extends JpaRepository<TipoCambioEntity, Integer>{
	
	TipoCambioEntity findById(int id);

}
