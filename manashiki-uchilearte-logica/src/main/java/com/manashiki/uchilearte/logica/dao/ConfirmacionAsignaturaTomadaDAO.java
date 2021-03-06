package com.manashiki.uchilearte.logica.dao;

import java.util.List;

import com.manashiki.uchilearte.logica.entidad.ConfirmacionAsignaturaTomadaEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;

public interface ConfirmacionAsignaturaTomadaDAO{
	
	public ConfirmacionAsignaturaTomadaEntity crearConfirmacionAsignaturaTomadaEntity(ConfirmacionAsignaturaTomadaEntity objConfirmacionAsignaturaTomadaEntity );
	public ConfirmacionAsignaturaTomadaEntity actualizarConfirmacionAsignaturaTomadaEntity(ConfirmacionAsignaturaTomadaEntity objConfirmacionAsignaturaTomadaEntity );
 	public ConfirmacionAsignaturaTomadaEntity buscarConfirmacionAsignaturaTomadaxIdEntity(ConfirmacionAsignaturaTomadaEntity objConfirmacionAsignaturaTomadaEntity ) throws PersistenceImplException;
 	public List<ConfirmacionAsignaturaTomadaEntity> listarConfirmacionAsignaturaTomadaEntity();
}
