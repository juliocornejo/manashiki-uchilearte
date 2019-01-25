package com.manashiki.uchilearte.seguridad;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.manashiki.seguridad.servdto.dto.entities.formulario.TipoAccionUsuario;
import com.manashiki.seguridad.servdto.dto.entities.formulario.UsuarioSeguridad;
import com.manashiki.seguridad.servdto.dto.entities.transferencia.ResponseSeguridad;

import vijnana.respuesta.wrapper.request.ConsultaSeguridad;
import vijnana.respuesta.wrapper.request.ConsultaWebmail;
import vijnana.respuesta.wrapper.response.seguridad.AutentificacionContext;
import vijnana.respuesta.wrapper.response.seguridad.AutentificacionResponse;
import vijnana.respuesta.wrapper.response.seguridad.BasicContext;
import vijnana.respuesta.wrapper.response.seguridad.sessionplataforma.SessionPlataforma;
import vijnana.seguridad.orquestador.cliente.ClienteSeguridad;
import vijnana.seguridad.orquestador.properties.VijnanaSeguridadProperties;
import vijnana.utilidades.component.utilidades.AppDate;
import vijnana.utilidades.component.utilidades.Ip;
import vijnana.utilidades.component.utilidades.JsonMappeo;
import vijnana.utilidades.component.utilidades.TipoFormatoFecha;

public class UchilearteSeguridadModelo {

	private static final Logger objLog = LoggerFactory.getLogger(UchilearteSeguridadModelo.class);

	private VijnanaSeguridadProperties vijnanaSeguridadProperties = new VijnanaSeguridadProperties();
	
//	private  webUchileProperties = new WebUchileProperties();
	
	private ClienteSeguridad clienteSeguridad = new ClienteSeguridad();

	//Aqui se setean las variables que van a ir a seguridad.
	public UchilearteSeguridadModelo() {
		super();
		this.clienteSeguridad = new ClienteSeguridad();
	}
	
	//Validar el metodo si tenemos acceso a seguridad por uchilearte.
	public SessionPlataforma obtenerUsuarioLogin(SessionPlataforma sessionPlataforma, String usernamePerfil, String passwordContrasenha) throws Exception{


		ConsultaSeguridad consultaSeguridad = new ConsultaSeguridad();

		consultaSeguridad.setDominioEmpresa(UchileOrquestadorConstantes.getDominioempresa()); // httpServletRequest.get
		consultaSeguridad.setRolContexto(UchileOrquestadorConstantes.getRolusuario());
		//---------------------------------------
		consultaSeguridad.setNombreAplicacion(UchileOrquestadorConstantes.getAplicacion());
		consultaSeguridad.setKeySeguridad(sessionPlataforma.getDataPlataformaAutentificacion().get("seguridad").getEnterpriseContext().getKeyEnterprise());

		//ir a buscar todos los metodos que van a ser utilizados

		clienteSeguridad = new ClienteSeguridad(usernamePerfil, passwordContrasenha,
				vijnanaSeguridadProperties.getVijnanaClientTimeoutConexion(),
				vijnanaSeguridadProperties.getVijnanaClientReadConexion());
		
		AutentificacionResponse autentificacionResponse = clienteSeguridad.postConsultaSeguridad(consultaSeguridad, vijnanaSeguridadProperties.getVijnanaServidor(), vijnanaSeguridadProperties.getLocalObtenerUsuarioLogin());

		if(autentificacionResponse!=null && autentificacionResponse.getBasicContext()!=null){
			sessionPlataforma.setDataUsuarioBasic(new HashMap<String, BasicContext>());  
			sessionPlataforma.getDataUsuarioBasic().put(usernamePerfil, autentificacionResponse.getBasicContext());
		}

		return sessionPlataforma;
	}

	

}
