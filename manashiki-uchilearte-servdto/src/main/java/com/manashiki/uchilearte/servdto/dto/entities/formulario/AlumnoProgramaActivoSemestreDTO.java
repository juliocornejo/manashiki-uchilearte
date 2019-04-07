package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;
import java.util.Date;

public class AlumnoProgramaActivoSemestreDTO implements Serializable {
 
	private static final long serialVersionUID = -7680302162672877658L;

	private int idAlumnoProgramaActivoSemestre;
	
	private int idProgramaActivoSemestre;
	
	private int idAlumno;
	
	private Date fechaInicialInscripcionAlumnoProgramaActivoSemestre; 
	
	private int estadoAlumnoProgramaActivoSemestre;
	
	public AlumnoProgramaActivoSemestreDTO() {
		super();
	}

	public int getIdAlumnoProgramaActivoSemestre() {
		return idAlumnoProgramaActivoSemestre;
	}

	public void setIdAlumnoProgramaActivoSemestre(int idAlumnoProgramaActivoSemestre) {
		this.idAlumnoProgramaActivoSemestre = idAlumnoProgramaActivoSemestre;
	}

	public int getIdProgramaActivoSemestre() {
		return idProgramaActivoSemestre;
	}

	public void setIdProgramaActivoSemestre(int idProgramaActivoSemestre) {
		this.idProgramaActivoSemestre = idProgramaActivoSemestre;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public Date getFechaInicialInscripcionAlumnoProgramaActivoSemestre() {
		return fechaInicialInscripcionAlumnoProgramaActivoSemestre;
	}

	public void setFechaInicialInscripcionAlumnoProgramaActivoSemestre(
			Date fechaInicialInscripcionAlumnoProgramaActivoSemestre) {
		this.fechaInicialInscripcionAlumnoProgramaActivoSemestre = fechaInicialInscripcionAlumnoProgramaActivoSemestre;
	}

	public int getEstadoAlumnoProgramaActivoSemestre() {
		return estadoAlumnoProgramaActivoSemestre;
	}

	public void setEstadoAlumnoProgramaActivoSemestre(int estadoAlumnoProgramaActivoSemestre) {
		this.estadoAlumnoProgramaActivoSemestre = estadoAlumnoProgramaActivoSemestre;
	}
	
}
