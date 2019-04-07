package com.manashiki.uchilearte.logica.entidad;

import java.io.Serializable;
import java.lang.String;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.IndexColumn;

/**
 * Entity implementation class for Entity: Usuario
 * en la base de Datos representa el registro de las personas asociadas al servicio.
 */
@Entity
@Table (name="archivo_solicitud")

public class ArchivoSolicitudEntity implements Serializable {
 
	private static final long serialVersionUID = -4315421654091132599L;

	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_archivo_solicitud")
	private Integer idArchivoSolicitud;
	
	@OrderBy
	@Column(name="nombre_persona_solicitud")
	private String nombreArchivoSolicitud; //Nombre a Mostrar
	
	@OrderBy
	@Column(name="direccion_almacenamiento_archivo_solicitud")
	private String direccionAlmacenamientoArchivoSolicitud;

	@Column(name="tipo_archivo_solicitud")
	private String tipoArchivoSolicitud;
	
	@IndexColumn(name="idx_archivo_solicitud_fecha_archivo")
	@Column(name="fecha_archivo")
	private Timestamp fechaArchivo; //momento que que ejecutada la solicitud
	
	@OneToMany(mappedBy="fkIdArchivoSolicitud")
	private List<SolicitudAcademicaEntity> solicitudes_academicas;
	
	@OneToMany(mappedBy="fkIdArchivoSolicitud")
	private List<SolicitudPostulacionEntity> solicitudes_postulaciones;
	
	public ArchivoSolicitudEntity() {
		super();
	}

	public Integer getIdArchivoSolicitud() {
		return idArchivoSolicitud;
	}

	public String getNombreArchivoSolicitud() {
		return nombreArchivoSolicitud;
	}

	public String getDireccionAlmacenamientoArchivoSolicitud() {
		return direccionAlmacenamientoArchivoSolicitud;
	}

	public String getTipoArchivoSolicitud() {
		return tipoArchivoSolicitud;
	}

	public List<SolicitudAcademicaEntity> getSolicitudes_academicas() {
		return solicitudes_academicas;
	}

	public List<SolicitudPostulacionEntity> getSolicitudes_postulaciones() {
		return solicitudes_postulaciones;
	}

	public void setIdArchivoSolicitud(Integer idArchivoSolicitud) {
		this.idArchivoSolicitud = idArchivoSolicitud;
	}

	public void setNombreArchivoSolicitud(String nombreArchivoSolicitud) {
		this.nombreArchivoSolicitud = nombreArchivoSolicitud;
	}

	public void setDireccionAlmacenamientoArchivoSolicitud(String direccionAlmacenamientoArchivoSolicitud) {
		this.direccionAlmacenamientoArchivoSolicitud = direccionAlmacenamientoArchivoSolicitud;
	}

	public void setTipoArchivoSolicitud(String tipoArchivoSolicitud) {
		this.tipoArchivoSolicitud = tipoArchivoSolicitud;
	}

	public void setSolicitudes_academicas(List<SolicitudAcademicaEntity> solicitudes_academicas) {
		this.solicitudes_academicas = solicitudes_academicas;
	}

	public void setSolicitudes_postulaciones(List<SolicitudPostulacionEntity> solicitudes_postulaciones) {
		this.solicitudes_postulaciones = solicitudes_postulaciones;
	}

	public Timestamp getFechaArchivo() {
		return fechaArchivo;
	}

	public void setFechaArchivo(Timestamp fechaArchivo) {
		this.fechaArchivo = fechaArchivo;
	}
	
	
}
