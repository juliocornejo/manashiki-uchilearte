package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="tipoCertificadoDTO")
public class TipoCertificadoDTO implements Serializable{
 
	private static final long serialVersionUID = -3149454368528357641L;

	private int idTipoCertificado;
	private String codigoTipoCertificado;
	private String nombreTipoCertificado;
	private boolean estadoTipoCertificado;
	private int prioridadTipoCertificado;
	
	public TipoCertificadoDTO() {
		super();
	}

	public int getIdTipoCertificado() {
		return idTipoCertificado;
	}

	public String getCodigoTipoCertificado() {
		return codigoTipoCertificado;
	}

	public String getNombreTipoCertificado() {
		return nombreTipoCertificado;
	}

	public void setIdTipoCertificado(int idTipoCertificado) {
		this.idTipoCertificado = idTipoCertificado;
	}

	public void setCodigoTipoCertificado(String codigoTipoCertificado) {
		this.codigoTipoCertificado = codigoTipoCertificado;
	}

	public void setNombreTipoCertificado(String nombreTipoCertificado) {
		this.nombreTipoCertificado = nombreTipoCertificado;
	}

	public boolean isEstadoTipoCertificado() {
		return estadoTipoCertificado;
	}

	public void setEstadoTipoCertificado(boolean estadoTipoCertificado) {
		this.estadoTipoCertificado = estadoTipoCertificado;
	}

	public int getPrioridadTipoCertificado() {
		return prioridadTipoCertificado;
	}

	public void setPrioridadTipoCertificado(int prioridadTipoCertificado) {
		this.prioridadTipoCertificado = prioridadTipoCertificado;
	}
	
}
