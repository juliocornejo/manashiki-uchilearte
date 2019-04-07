package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;

public class TipoCertificadoModel implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 7453078237613812012L;
	private Integer idTipoCertificado;
	private String codigoTipoCertificado;
	private String nombreTipoCertificado;
	private Boolean estadoTipoCertificado;
	private Integer prioridadTipoCertificado;

	public TipoCertificadoModel() {
		super();
	}
	
	public TipoCertificadoModel(Boolean estadoTipoCertificado) {
		super();
		this.estadoTipoCertificado = estadoTipoCertificado;
	}

	public Integer getIdTipoCertificado() {
		return idTipoCertificado;
	}

	public String getCodigoTipoCertificado() {
		return codigoTipoCertificado;
	}

	public String getNombreTipoCertificado() {
		return nombreTipoCertificado;
	}

	public void setIdTipoCertificado(Integer idTipoCertificado) {
		this.idTipoCertificado = idTipoCertificado;
	}

	public void setCodigoTipoCertificado(String codigoTipoCertificado) {
		this.codigoTipoCertificado = codigoTipoCertificado;
	}

	public void setNombreTipoCertificado(String nombreTipoCertificado) {
		this.nombreTipoCertificado = nombreTipoCertificado;
	}

	public Boolean getEstadoTipoCertificado() {
		return estadoTipoCertificado;
	}

	public void setEstadoTipoCertificado(Boolean estadoTipoCertificado) {
		this.estadoTipoCertificado = estadoTipoCertificado;
	}

	public Integer getPrioridadTipoCertificado() {
		return prioridadTipoCertificado;
	}
	
	public void setPrioridadTipoCertificado(Integer prioridadTipoCertificado) {
		this.prioridadTipoCertificado = prioridadTipoCertificado;
	}
	
	
	
}
