package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="tipoSolicitudDTO")
public class TipoSolicitudDTO implements Serializable{
	
	private static final long serialVersionUID = 6482683334399094483L;

	private int idTipoSolicitud;
	private String codigoTipoSolicitud;
	private String nombreTipoSolicitud;
	private boolean estadoTipoSolicitud;
	private int prioridadTipoSolicitud;
	
	public TipoSolicitudDTO() {
		super();
	}

	public int getIdTipoSolicitud() {
		return idTipoSolicitud;
	}

	public String getCodigoTipoSolicitud() {
		return codigoTipoSolicitud;
	}

	public String getNombreTipoSolicitud() {
		return nombreTipoSolicitud;
	}

	public void setIdTipoSolicitud(int idTipoSolicitud) {
		this.idTipoSolicitud = idTipoSolicitud;
	}

	public void setCodigoTipoSolicitud(String codigoTipoSolicitud) {
		this.codigoTipoSolicitud = codigoTipoSolicitud;
	}

	public void setNombreTipoSolicitud(String nombreTipoSolicitud) {
		this.nombreTipoSolicitud = nombreTipoSolicitud;
	}

	public int getPrioridadTipoSolicitud() {
		return prioridadTipoSolicitud;
	}

	public void setPrioridadTipoSolicitud(int prioridadTipoSolicitud) {
		this.prioridadTipoSolicitud = prioridadTipoSolicitud;
	}

	public boolean isEstadoTipoSolicitud() {
		return estadoTipoSolicitud;
	}

	public void setEstadoTipoSolicitud(boolean estadoTipoSolicitud) {
		this.estadoTipoSolicitud = estadoTipoSolicitud;
	}
}
