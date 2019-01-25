package com.manashiki.uchilearte.logica.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.TipoCertificadoDAO;
import com.manashiki.uchilearte.logica.entidad.TipoCertificadoEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.TipoCertificadoRepository;

@Repository
public class TipoCertificadoDAOImpl implements TipoCertificadoDAO{

	private static final Logger objLog = LoggerFactory.getLogger(TipoCertificadoDAOImpl.class);
	
	
	@Autowired
	TipoCertificadoRepository tipoCertificadoRepository;
	
	/**
	 * Crea una Entidad TipoCertificado en la base de datos
	 * @param  aplicacion TipoCertificado
	 * @return void
	 * @exception no lanza excepciones
	 */
	public TipoCertificadoEntity crearTipoCertificadoEntity(TipoCertificadoEntity objTipoCertificadoEntity){
		objLog.info("INI - crearTipoCertificadoEntity ");
		TipoCertificadoEntity tipoCertificadoEntity = tipoCertificadoRepository.save(objTipoCertificadoEntity);
		objLog.info("FIN - crearTipoCertificadoEntity "+objTipoCertificadoEntity.getIdTipoCertificado());
		return tipoCertificadoEntity;
	}
	
	/**
	 * Actualiza un Entidad TipoCertificado en la base de datos 
	 * @param  aplicacion TipoCertificado
	 * @return void
	 * @exception no lanza excepciones
	 */
	public TipoCertificadoEntity actualizarTipoCertificadoEntity(TipoCertificadoEntity objTipoCertificadoEntity){
		objLog.info("INI - actualizarTipoCertificadoEntity "+objTipoCertificadoEntity.getIdTipoCertificado());
		TipoCertificadoEntity tipoCertificadoEntity = tipoCertificadoRepository.save(objTipoCertificadoEntity);
		objLog.info("FIN - actualizarTipoCertificadoEntity "+objTipoCertificadoEntity.getIdTipoCertificado());
		return tipoCertificadoEntity;
	
	}
	
	/**
	 * Método que devuelve Entidad TipoCertificado por el id
	 * @param  aplicacion TipoCertificado
	 * @return apliEmpresa TipoCertificado
	 * @exception no lanza excepciones
	 */
	public TipoCertificadoEntity buscarTipoCertificadoxIdEntity(TipoCertificadoEntity objTipoCertificadoEntity) throws PersistenceImplException{
		objLog.info("INI - buscarTipoCertificadoxIdEntity "+objTipoCertificadoEntity.getIdTipoCertificado());
		TipoCertificadoEntity tipoCertificadoEntity = null;
 		try {
 			tipoCertificadoEntity = tipoCertificadoRepository.findOne(objTipoCertificadoEntity.getIdTipoCertificado());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
 		
 		if(tipoCertificadoEntity!=null){
 			if(tipoCertificadoEntity.getIdTipoCertificado()!=null){
 				objLog.info("FIN - buscarTipoCertificadoxIdEntity: "+tipoCertificadoEntity.getIdTipoCertificado());
 			}
 		}
 		
 		
		return tipoCertificadoEntity;
	}
	
	/**
	 * Método que devuelve listado de Todas las TipoCertificados
	 * @return lista List<TipoCertificado>
	 * @exception no lanza excepciones
	 */
	public List<TipoCertificadoEntity> listarTipoCertificadoEntity(){
		objLog.info("INI - listarTipoCertificadoEntity");
		List<TipoCertificadoEntity> listaTipoCertificadoEntity = null;
		try {
			listaTipoCertificadoEntity = tipoCertificadoRepository.findAll();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+listaTipoCertificadoEntity.size());
		}
		
		if(listaTipoCertificadoEntity!=null){
 				objLog.info("FIN - listarTipoCertificadosEntity: "+listaTipoCertificadoEntity.size());
 		}
		
		return listaTipoCertificadoEntity;
	}
	
	public List<TipoCertificadoEntity> listarTipoCertificadoOrderByCodigoTipoCertificadoEntity(TipoCertificadoEntity objTipoCertificadoEntity){
		objLog.info("INI - listarTipoCertificadoOrderByCodigoTipoCertificadoEntity");
		List<TipoCertificadoEntity> listaTipoCertificadoEntity = null;
		try {
			listaTipoCertificadoEntity = tipoCertificadoRepository.findByEstadoTipoCertificadoOrderByCodigoTipoCertificadoAsc(objTipoCertificadoEntity.getEstadoTipoCertificado());
			
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+listaTipoCertificadoEntity.size());
		}
		
		if(listaTipoCertificadoEntity!=null){
 				objLog.info("FIN - listarTipoCertificadoOrderByCodigoTipoCertificadoEntity: "+listaTipoCertificadoEntity.size());
 		}
		
		return listaTipoCertificadoEntity;
	}
	
}
