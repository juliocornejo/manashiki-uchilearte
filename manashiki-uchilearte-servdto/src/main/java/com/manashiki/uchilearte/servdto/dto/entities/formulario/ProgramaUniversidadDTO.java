package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="programaUniversidadDTO")
public class ProgramaUniversidadDTO implements Serializable{

	private static final long serialVersionUID = -537936973993838942L;
	
	private int idProgramaUniversidad = 0;
	private String codigoProgramaUniversidad = "";
	private String nombreProgramaUniversidad = "";
	private String duracionProgramaUniversidad = "";
	private String costoProgramaUniversidad = "";
	private boolean estadoProgramaUniversidad = false;
	private int prioridadProgramaUniversidad= 0;
	private int clasificacionPrograma= 0;
	
	public ProgramaUniversidadDTO() {
		super();
	}
	
	public ProgramaUniversidadDTO(String nombreProgramaUniversidad) {
		this.nombreProgramaUniversidad = nombreProgramaUniversidad;
	}

	public int getIdProgramaUniversidad() {
		return idProgramaUniversidad;
	}

	public String getCodigoProgramaUniversidad() {
		return codigoProgramaUniversidad;
	}

	public String getNombreProgramaUniversidad() {
		return nombreProgramaUniversidad;
	}

	public String getDuracionProgramaUniversidad() {
		return duracionProgramaUniversidad;
	}

	public String getCostoProgramaUniversidad() {
		return costoProgramaUniversidad;
	}

	public void setIdProgramaUniversidad(int idProgramaUniversidad) {
		this.idProgramaUniversidad = idProgramaUniversidad;
	}

	public void setCodigoProgramaUniversidad(String codigoProgramaUniversidad) {
		this.codigoProgramaUniversidad = codigoProgramaUniversidad;
	}

	public void setNombreProgramaUniversidad(String nombreProgramaUniversidad) {
		this.nombreProgramaUniversidad = nombreProgramaUniversidad;
	}

	public void setDuracionProgramaUniversidad(String duracionProgramaUniversidad) {
		this.duracionProgramaUniversidad = duracionProgramaUniversidad;
	}

	public void setCostoProgramaUniversidad(String costoProgramaUniversidad) {
		this.costoProgramaUniversidad = costoProgramaUniversidad;
	}

	public int getClasificacionPrograma() {
		return clasificacionPrograma;
	}

	public void setClasificacionPrograma(int clasificacionPrograma) {
		this.clasificacionPrograma = clasificacionPrograma;
	}

	public boolean isEstadoProgramaUniversidad() {
		return estadoProgramaUniversidad;
	}

	public void setEstadoProgramaUniversidad(boolean estadoProgramaUniversidad) {
		this.estadoProgramaUniversidad = estadoProgramaUniversidad;
	}

	public int getPrioridadProgramaUniversidad() {
		return prioridadProgramaUniversidad;
	}

	public void setPrioridadProgramaUniversidad(int prioridadProgramaUniversidad) {
		this.prioridadProgramaUniversidad = prioridadProgramaUniversidad;
	}
	
}
