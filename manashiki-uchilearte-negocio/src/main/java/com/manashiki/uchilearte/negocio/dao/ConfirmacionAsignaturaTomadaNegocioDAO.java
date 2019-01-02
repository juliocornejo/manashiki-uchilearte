package com.manashiki.uchilearte.negocio.dao;

import java.util.List;

import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.ConfirmacionAsignaturaTomadaModel;


public interface ConfirmacionAsignaturaTomadaNegocioDAO{
	
	public ConfirmacionAsignaturaTomadaModel crearConfirmacionAsignaturaTomadaModel(ConfirmacionAsignaturaTomadaModel objConfirmacionAsignaturaTomadaModel );
	public ConfirmacionAsignaturaTomadaModel actualizarConfirmacionAsignaturaTomadaModel(ConfirmacionAsignaturaTomadaModel objConfirmacionAsignaturaTomadaModel );
 	public ConfirmacionAsignaturaTomadaModel buscarConfirmacionAsignaturaTomadaxIdModel(ConfirmacionAsignaturaTomadaModel objConfirmacionAsignaturaTomadaModel ) throws NegocioImplException;
 	public List<ConfirmacionAsignaturaTomadaModel> listarConfirmacionAsignaturaTomadaModel();
}