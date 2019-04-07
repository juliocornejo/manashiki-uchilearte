package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;

public class ProgramaActivoSemestreModel implements Serializable {
 

	private static final long serialVersionUID = -4823628814973538188L;

	private Integer idProgramaActivoSemestre;
	private Integer idProgramaUniversidad;
	private Integer idSemestreTemporada;
	private String descripcionProgramaActivoSemestre; //mail de solicitante
	private Boolean estadoProgramaActivoSemestre;
	private Integer prioridadProgramaActivoSemestre;
	
	public ProgramaActivoSemestreModel() {
		super();
	}

	public Integer getIdProgramaActivoSemestre() {
		return idProgramaActivoSemestre;
	}

	public void setIdProgramaActivoSemestre(Integer idProgramaActivoSemestre) {
		this.idProgramaActivoSemestre = idProgramaActivoSemestre;
	}

	public Integer getIdProgramaUniversidad() {
		return idProgramaUniversidad;
	}

	public void setIdProgramaUniversidad(Integer idProgramaUniversidad) {
		this.idProgramaUniversidad = idProgramaUniversidad;
	}

	public Integer getIdSemestreTemporada() {
		return idSemestreTemporada;
	}

	public void setIdSemestreTemporada(Integer idSemestreTemporada) {
		this.idSemestreTemporada = idSemestreTemporada;
	}

	public String getDescripcionProgramaActivoSemestre() {
		return descripcionProgramaActivoSemestre;
	}

	public void setDescripcionProgramaActivoSemestre(String descripcionProgramaActivoSemestre) {
		this.descripcionProgramaActivoSemestre = descripcionProgramaActivoSemestre;
	}

	public Boolean getEstadoProgramaActivoSemestre() {
		return estadoProgramaActivoSemestre;
	}

	public void setEstadoProgramaActivoSemestre(Boolean estadoProgramaActivoSemestre) {
		this.estadoProgramaActivoSemestre = estadoProgramaActivoSemestre;
	}

	public Integer getPrioridadProgramaActivoSemestre() {
		return prioridadProgramaActivoSemestre;
	}

	public void setPrioridadProgramaActivoSemestre(Integer prioridadProgramaActivoSemestre) {
		this.prioridadProgramaActivoSemestre = prioridadProgramaActivoSemestre;
	}
	
	
	
}
