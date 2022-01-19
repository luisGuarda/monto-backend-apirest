package com.bcp.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bcp.pe.entity.MontoEntity;

@Repository
public interface MontoRepository extends JpaRepository<MontoEntity, Integer>{
	
	

}
