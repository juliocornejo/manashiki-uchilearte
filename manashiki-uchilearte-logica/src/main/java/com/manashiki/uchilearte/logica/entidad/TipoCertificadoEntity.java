package com.manashiki.uchilearte.logica.entidad;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.IndexColumn;


/**
 * Entity implementation class for Entity: Region
 * en la base de Datos representa 
 */
@Entity
@Table (name="tipo_certificado")

public class TipoCertificadoEntity implements Serializable {
 
	private static final long serialVersionUID = 1L;
	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@IndexColumn(name="idx_tipo_certificado_id_tipo_certificado")
	@Column(name="id_tipo_certificado")
	private Integer idTipoCertificado;
	@OrderBy
	@Column(name="codigo_tipo_certificado")
	private String codigoTipoCertificado;
	@OrderBy
	@Column(name="nombre_tipo_certificado")
	private String nombreTipoCertificado;
	@OrderBy
	@Column(name="estado_tipo_certificado")
	private Boolean estadoTipoCertificado;
	
	@OrderBy
	@Column(name="prioridad_tipo_certificado")
	private Integer prioridadTipoCertificado;

	@OneToMany(mappedBy="fkIdTipoCertificado")
	private List<SolicitudCertificadoEntity> tipos_certificados;
	
	public TipoCertificadoEntity() {
		super();
	}
	
	
	
	public TipoCertificadoEntity(Boolean estadoTipoCertificado) {
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

	public List<SolicitudCertificadoEntity> getTipos_certificados() {
		return tipos_certificados;
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

	public void setTipos_certificados(List<SolicitudCertificadoEntity> tipos_certificados) {
		this.tipos_certificados = tipos_certificados;
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
