package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="semestreTemporadaDTO")
public class SemestreTemporadaDTO implements Serializable {
 

	private static final long serialVersionUID = -6333428817911635601L;
	
	private int idSemestreTemporada;
	private String nombreSemestreTemporada; //Nombre a Mostrar
	private String descripcionSemestreTemporada;
	private Date fechaActivacionDesde = null;
	private String sFechaActivacionDesde = "";
	private Date fechaActivacionHasta = null;
	private String sFechaActivacionHasta = "";
	
	public SemestreTemporadaDTO() {
		super();
	}

	public int getIdSemestreTemporada() {
		return idSemestreTemporada;
	}

	public void setIdSemestreTemporada(int idSemestreTemporada) {
		this.idSemestreTemporada = idSemestreTemporada;
	}

	public String getNombreSemestreTemporada() {
		return nombreSemestreTemporada;
	}

	public void setNombreSemestreTemporada(String nombreSemestreTemporada) {
		this.nombreSemestreTemporada = nombreSemestreTemporada;
	}

	public String getDescripcionSemestreTemporada() {
		return descripcionSemestreTemporada;
	}

	public void setDescripcionSemestreTemporada(String descripcionSemestreTemporada) {
		this.descripcionSemestreTemporada = descripcionSemestreTemporada;
	}

	public Date getFechaActivacionDesde() {
		return fechaActivacionDesde;
	}

	public void setFechaActivacionDesde(Date fechaActivacionDesde) {
		this.fechaActivacionDesde = fechaActivacionDesde;
	}

	public String getsFechaActivacionDesde() {
		return sFechaActivacionDesde;
	}

	public void setsFechaActivacionDesde(String sFechaActivacionDesde) {
		this.sFechaActivacionDesde = sFechaActivacionDesde;
	}

	public Date getFechaActivacionHasta() {
		return fechaActivacionHasta;
	}

	public void setFechaActivacionHasta(Date fechaActivacionHasta) {
		this.fechaActivacionHasta = fechaActivacionHasta;
	}

	public String getsFechaActivacionHasta() {
		return sFechaActivacionHasta;
	}

	public void setsFechaActivacionHasta(String sFechaActivacionHasta) {
		this.sFechaActivacionHasta = sFechaActivacionHasta;
	}
	
	
}
