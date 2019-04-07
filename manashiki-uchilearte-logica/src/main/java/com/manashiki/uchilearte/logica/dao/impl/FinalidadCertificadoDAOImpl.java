package com.manashiki.uchilearte.logica.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.FinalidadCertificadoDAO;
import com.manashiki.uchilearte.logica.entidad.FinalidadCertificadoEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.FinalidadCertificadoRepository;

@Repository
public class FinalidadCertificadoDAOImpl implements FinalidadCertificadoDAO{

	private static final Logger objLog = LoggerFactory.getLogger(FinalidadCertificadoDAOImpl.class);
	
	
	@Autowired
	FinalidadCertificadoRepository finalidadCertificadoRepository;
	
	/**
	 * Crea una Entidad FinalidadCertificado en la base de datos
	 * @param  aplicacion FinalidadCertificado
	 * @return void
	 * @exception no lanza excepciones
	 */
	public FinalidadCertificadoEntity crearFinalidadCertificadoEntity(FinalidadCertificadoEntity objFinalidadCertificadoEntity){
		objLog.info("INI - crearFinalidadCertificadoEntity ");
		FinalidadCertificadoEntity regionEntity = finalidadCertificadoRepository.save(objFinalidadCertificadoEntity);
		objLog.info("FIN - crearFinalidadCertificadoEntity "+objFinalidadCertificadoEntity.getIdFinalidadCertificado());
		return regionEntity;
	}
	
	/**
	 * Actualiza un Entidad FinalidadCertificado en la base de datos 
	 * @param  aplicacion FinalidadCertificado
	 * @return void
	 * @exception no lanza excepciones
	 */
	public FinalidadCertificadoEntity actualizarFinalidadCertificadoEntity(FinalidadCertificadoEntity objFinalidadCertificadoEntity){
		objLog.info("INI - actualizarFinalidadCertificadoEntity "+objFinalidadCertificadoEntity.getIdFinalidadCertificado());
		FinalidadCertificadoEntity regionEntity = finalidadCertificadoRepository.save(objFinalidadCertificadoEntity);
		objLog.info("FIN - actualizarFinalidadCertificadoEntity "+objFinalidadCertificadoEntity.getIdFinalidadCertificado());
		return regionEntity;
	
	}
	
	/**
	 * Método que devuelve Entidad FinalidadCertificado por el id
	 * @param  aplicacion FinalidadCertificado
	 * @return apliEmpresa FinalidadCertificado
	 * @exception no lanza excepciones
	 */
	public FinalidadCertificadoEntity buscarFinalidadCertificadoxIdEntity(FinalidadCertificadoEntity objFinalidadCertificadoEntity) throws PersistenceImplException{
		objLog.info("INI - buscarFinalidadCertificadoxIdEntity "+objFinalidadCertificadoEntity.getIdFinalidadCertificado());
		FinalidadCertificadoEntity regionEntity = null;
 		try {
 			regionEntity = finalidadCertificadoRepository.findOne(objFinalidadCertificadoEntity.getIdFinalidadCertificado());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
 		
 		if(regionEntity!=null){
 			if(regionEntity.getIdFinalidadCertificado()!=null){
 				objLog.info("FIN - buscarFinalidadCertificadoxIdEntity "+regionEntity.getIdFinalidadCertificado());
 			}
 		}
 		
 		
		return regionEntity;
	}
	
	/**
	 * Método que devuelve listado de Todas las FinalidadCertificados
	 * @return lista List<FinalidadCertificado>
	 * @exception no lanza excepciones
	 */
	public List<FinalidadCertificadoEntity> listarFinalidadCertificadoEntity(){
		objLog.info("INI - listarFinalidadCertificadoEntity");
		List<FinalidadCertificadoEntity> listaFinalidadCertificadoEntity = null;
		try {
			listaFinalidadCertificadoEntity = finalidadCertificadoRepository.findAll();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+listaFinalidadCertificadoEntity.size());
		}
		
		if(listaFinalidadCertificadoEntity!=null){
 				objLog.info("FIN - listarFinalidadCertificadoEntity "+listaFinalidadCertificadoEntity.size());
 		}
		
		return listaFinalidadCertificadoEntity;
	}
	
	public List<FinalidadCertificadoEntity> listarFinalidadCertificadoxEstadoEntity(FinalidadCertificadoEntity objFinalidadCertificadoEntity){
		objLog.info("INI - listarFinalidadCertificadoOrderByEstadoEntity");
		List<FinalidadCertificadoEntity> listaFinalidadCertificadoEntity = null;
		try {
			listaFinalidadCertificadoEntity = finalidadCertificadoRepository.findByEstadoFinalidadCertificadoOrderByPrioridadFinalidadCertificadoAsc(objFinalidadCertificadoEntity.getEstadoFinalidadCertificado());
			
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+listaFinalidadCertificadoEntity.size());
		}
		
		if(listaFinalidadCertificadoEntity!=null){
 				objLog.info("FIN - listarFinalidadCertificadoOrderByEstadoEntity: "+listaFinalidadCertificadoEntity.size());
 		}
		
		return listaFinalidadCertificadoEntity;
	}
	
	
}
