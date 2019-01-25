package com.manashiki.uchilearte.logica.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.TipoSolicitudDAO;
import com.manashiki.uchilearte.logica.entidad.TipoCertificadoEntity;
import com.manashiki.uchilearte.logica.entidad.TipoSolicitudEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.TipoSolicitudRepository;

@Repository
public class TipoSolicitudDAOImpl implements TipoSolicitudDAO{

	private static final Logger objLog = LoggerFactory.getLogger(TipoSolicitudDAOImpl.class);
	
	
	@Autowired
	TipoSolicitudRepository tipoSolicitudRepository;
	
	/**
	 * Crea una Entidad TipoSolicitud en la base de datos
	 * @param  aplicacion TipoSolicitud
	 * @return void
	 * @exception no lanza excepciones
	 */
	public TipoSolicitudEntity crearTipoSolicitudEntity(TipoSolicitudEntity objTipoSolicitudEntity){
		objLog.info("INI - crearTipoSolicitudEntity ");
		TipoSolicitudEntity regionEntity = tipoSolicitudRepository.save(objTipoSolicitudEntity);
		objLog.info("FIN - crearTipoSolicitudEntity "+objTipoSolicitudEntity.getIdTipoSolicitud());
		return regionEntity;
	}
	
	/**
	 * Actualiza un Entidad TipoSolicitud en la base de datos 
	 * @param  aplicacion TipoSolicitud
	 * @return void
	 * @exception no lanza excepciones
	 */
	public TipoSolicitudEntity actualizarTipoSolicitudEntity(TipoSolicitudEntity objTipoSolicitudEntity){
		objLog.info("INI - actualizarTipoSolicitudEntity "+objTipoSolicitudEntity.getIdTipoSolicitud());
		TipoSolicitudEntity regionEntity = tipoSolicitudRepository.save(objTipoSolicitudEntity);
		objLog.info("FIN - actualizarTipoSolicitudEntity "+objTipoSolicitudEntity.getIdTipoSolicitud());
		return regionEntity;
	
	}
	
	/**
	 * Método que devuelve Entidad TipoSolicitud por el id
	 * @param  aplicacion TipoSolicitud
	 * @return apliEmpresa TipoSolicitud
	 * @exception no lanza excepciones
	 */
	public TipoSolicitudEntity buscarTipoSolicitudxIdEntity(TipoSolicitudEntity objTipoSolicitudEntity) throws PersistenceImplException{
		objLog.info("INI - buscarTipoSolicitudxIdEntity "+objTipoSolicitudEntity.getIdTipoSolicitud());
		TipoSolicitudEntity regionEntity = null;
 		try {
 			regionEntity = tipoSolicitudRepository.findOne(objTipoSolicitudEntity.getIdTipoSolicitud());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
 		
 		if(regionEntity!=null){
 			if(regionEntity.getIdTipoSolicitud()!=null){
 				objLog.info("FIN - buscarTipoSolicitudxIdEntity "+regionEntity.getIdTipoSolicitud());
 			}
 		}
 		
 		
		return regionEntity;
	}
	
	/**
	 * Método que devuelve listado de Todas las TipoSolicituds
	 * @return lista List<TipoSolicitud>
	 * @exception no lanza excepciones
	 */
	public List<TipoSolicitudEntity> listarTipoSolicitudesEntity(){
		objLog.info("INI - listarTipoSolicitudesEntity");
		List<TipoSolicitudEntity> listaTipoSolicitudEntity = null;
		try {
			listaTipoSolicitudEntity = tipoSolicitudRepository.findAll();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+listaTipoSolicitudEntity.size());
		}
		
		if(listaTipoSolicitudEntity!=null){
 				objLog.info("FIN - listarTipoSolicitudsEntity "+listaTipoSolicitudEntity.size());
 		}
		
		return listaTipoSolicitudEntity;
	}
	
	public List<TipoSolicitudEntity> listarTipoSolicitudesOrderCodigoTipoSolicitudEntity(TipoSolicitudEntity objTipoSolicitudEntity){
		objLog.info("INI - listarTipoSolicitudesOrderCodigoTipoSolicitudEntity");
		List<TipoSolicitudEntity> listaTipoSolicitudEntity = null;
		try {
			listaTipoSolicitudEntity = tipoSolicitudRepository.findByEstadoTipoSolicitudOrderByCodigoTipoSolicitudAsc(objTipoSolicitudEntity.getEstadoTipoSolicitud());
			
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+listaTipoSolicitudEntity.size());
		}
		
		if(listaTipoSolicitudEntity!=null){
 				objLog.info("FIN - listarTipoSolicitudesOrderCodigoTipoSolicitudEntity "+listaTipoSolicitudEntity.size());
 		}
		
		return listaTipoSolicitudEntity;
	}
	
}
