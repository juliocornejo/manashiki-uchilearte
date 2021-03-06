package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;

public class ProgramaUniversidadPostulacionModel implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 8262998924298353961L;
	private Integer idProgramaUniversidadPostulacion;
	private String codigoProgramaUniversidadPostulacion;
	private String nombreProgramaUniversidadPostulacion;
	private String duracionProgramaUniversidadPostulacion;
	private Boolean estadoProgramaUniversidadPostulacion;
	private Integer prioridadProgramaUniversidadPostulacion;
	private String costoProgramaUniversidadPostulacion;
	private Integer clasificacionProgramaPostulacion;

	
	public ProgramaUniversidadPostulacionModel() {
		super();
	}
	
	public ProgramaUniversidadPostulacionModel(Boolean estadoProgramaUniversidadPostulacion) {
		super();
		this.estadoProgramaUniversidadPostulacion = estadoProgramaUniversidadPostulacion;
	}

	public Integer getIdProgramaUniversidadPostulacion() {
		return idProgramaUniversidadPostulacion;
	}

	public void setIdProgramaUniversidadPostulacion(Integer idProgramaUniversidadPostulacion) {
		this.idProgramaUniversidadPostulacion = idProgramaUniversidadPostulacion;
	}

	public String getCodigoProgramaUniversidadPostulacion() {
		return codigoProgramaUniversidadPostulacion;
	}

	public void setCodigoProgramaUniversidadPostulacion(String codigoProgramaUniversidadPostulacion) {
		this.codigoProgramaUniversidadPostulacion = codigoProgramaUniversidadPostulacion;
	}

	public String getNombreProgramaUniversidadPostulacion() {
		return nombreProgramaUniversidadPostulacion;
	}

	public void setNombreProgramaUniversidadPostulacion(String nombreProgramaUniversidadPostulacion) {
		this.nombreProgramaUniversidadPostulacion = nombreProgramaUniversidadPostulacion;
	}

	public String getDuracionProgramaUniversidadPostulacion() {
		return duracionProgramaUniversidadPostulacion;
	}

	public void setDuracionProgramaUniversidadPostulacion(String duracionProgramaUniversidadPostulacion) {
		this.duracionProgramaUniversidadPostulacion = duracionProgramaUniversidadPostulacion;
	}

	public String getCostoProgramaUniversidadPostulacion() {
		return costoProgramaUniversidadPostulacion;
	}

	public void setCostoProgramaUniversidadPostulacion(String costoProgramaUniversidadPostulacion) {
		this.costoProgramaUniversidadPostulacion = costoProgramaUniversidadPostulacion;
	}

	public Integer getClasificacionProgramaPostulacion() {
		return clasificacionProgramaPostulacion;
	}

	public void setClasificacionProgramaPostulacion(Integer clasificacionProgramaPostulacion) {
		this.clasificacionProgramaPostulacion = clasificacionProgramaPostulacion;
	}

	public Boolean getEstadoProgramaUniversidadPostulacion() {
		return estadoProgramaUniversidadPostulacion;
	}

	public void setEstadoProgramaUniversidadPostulacion(Boolean estadoProgramaUniversidadPostulacion) {
		this.estadoProgramaUniversidadPostulacion = estadoProgramaUniversidadPostulacion;
	}

	public Integer getPrioridadProgramaUniversidadPostulacion() {
		return prioridadProgramaUniversidadPostulacion;
	}

	public void setPrioridadProgramaUniversidadPostulacion(Integer prioridadProgramaUniversidadPostulacion) {
		this.prioridadProgramaUniversidadPostulacion = prioridadProgramaUniversidadPostulacion;
	}

//	public Integer getPrioridad() {
//		return prioridad;
//	}
//
//	public void setPrioridad(Integer prioridad) {
//		this.prioridad = prioridad;
//	}
	
	
	
//	public Integer getSubClasificacionProgramaPostulacion() {
//		return subClasificacionProgramaPostulacion;
//	}
//
//	public void setSubClasificacionProgramaPostulacion(Integer subClasificacionProgramaPostulacion) {
//		this.subClasificacionProgramaPostulacion = subClasificacionProgramaPostulacion;
//	}
	
	
}
