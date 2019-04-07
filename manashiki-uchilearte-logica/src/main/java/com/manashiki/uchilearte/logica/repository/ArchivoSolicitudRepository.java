package com.manashiki.uchilearte.logica.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manashiki.uchilearte.logica.entidad.ArchivoSolicitudEntity;

public interface ArchivoSolicitudRepository extends JpaRepository<ArchivoSolicitudEntity, Integer> {
	
}
