package com.manashiki.uchilearte.wrapper;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonProperty;

import com.manashiki.uchilearte.servdto.wrapper.UchileArte;

import vijnana.respuesta.wrapper.response.AbstractWrapperError;
import vijnana.respuesta.wrapper.response.AbstractWrapper;


@XmlRootElement(name="wrapperUchileArte")
public class WrapperUchileArte extends AbstractWrapper implements Serializable{

	private static final long serialVersionUID = 8865841942078096681L;
	
	@JsonProperty("data")
	private UchileArte data;
	
	public WrapperUchileArte( AbstractWrapperError error, String tiempoRespuesta, String url,
			String tipoMetodo, UchileArte data) {
		super(tiempoRespuesta, url, error, tipoMetodo);
		this.data = data;
	}
	
	public WrapperUchileArte() {
		super();
	}
	
	public UchileArte getData() {
		return data;
	}

	public void setData(UchileArte data) {
		this.data = data;
	}

	
}
