package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;
import java.lang.String;

public class FinalidadCertificadoModel implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 5444716888892334213L;
	private Integer idFinalidadCertificado;
	private String codigoFinalidadCertificado;
	private String nombreFinalidadCertificado;
	private Boolean estadoFinalidadCertificado;
	private Integer prioridadFinalidadCertificado;

	public FinalidadCertificadoModel() {
		super();
	}
	
	public FinalidadCertificadoModel(Boolean estadoFinalidadCertificado) {
		super();
		this.estadoFinalidadCertificado = estadoFinalidadCertificado;
	}

	public Integer getIdFinalidadCertificado() {
		return idFinalidadCertificado;
	}

	public String getCodigoFinalidadCertificado() {
		return codigoFinalidadCertificado;
	}

	public String getNombreFinalidadCertificado() {
		return nombreFinalidadCertificado;
	}

	public void setIdFinalidadCertificado(Integer idFinalidadCertificado) {
		this.idFinalidadCertificado = idFinalidadCertificado;
	}

	public void setCodigoFinalidadCertificado(String codigoFinalidadCertificado) {
		this.codigoFinalidadCertificado = codigoFinalidadCertificado;
	}

	public void setNombreFinalidadCertificado(String nombreFinalidadCertificado) {
		this.nombreFinalidadCertificado = nombreFinalidadCertificado;
	}

	public Boolean getEstadoFinalidadCertificado() {
		return estadoFinalidadCertificado;
	}

	public void setEstadoFinalidadCertificado(Boolean estadoFinalidadCertificado) {
		this.estadoFinalidadCertificado = estadoFinalidadCertificado;
	}

	public Integer getPrioridadFinalidadCertificado() {
		return prioridadFinalidadCertificado;
	}

	public void setPrioridadFinalidadCertificado(Integer prioridadFinalidadCertificado) {
		this.prioridadFinalidadCertificado = prioridadFinalidadCertificado;
	}
	
}
