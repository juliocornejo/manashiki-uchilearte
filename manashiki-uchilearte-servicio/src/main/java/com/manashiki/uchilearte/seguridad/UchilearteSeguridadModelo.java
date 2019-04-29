//package com.manashiki.uchilearte.seguridad;
//
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.codehaus.jackson.annotate.JsonProperty;
//import org.codehaus.jackson.map.DeserializationConfig;
//import org.codehaus.jackson.map.ObjectMapper;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import com.manashiki.seguridad.servdto.dto.entities.formulario.TipoAccionUsuario;
//import com.manashiki.seguridad.servdto.dto.entities.formulario.UsuarioSeguridad;
//import com.manashiki.seguridad.servdto.dto.entities.transferencia.ResponseSeguridad;
//
//import vijnana.respuesta.wrapper.request.ConsultaSeguridad;
//import vijnana.respuesta.wrapper.request.ConsultaWebmail;
//import vijnana.respuesta.wrapper.response.seguridad.AutentificacionContext;
//import vijnana.respuesta.wrapper.response.seguridad.AutentificacionResponse;
//import vijnana.respuesta.wrapper.response.seguridad.BasicContext;
//import vijnana.respuesta.wrapper.response.seguridad.sessionplataforma.SessionPlataforma;
//import vijnana.seguridad.orquestador.cliente.ClienteSeguridad;
//import vijnana.seguridad.orquestador.properties.VijnanaSeguridadProperties;
//import vijnana.utilidades.component.utilidades.AppDate;
//import vijnana.utilidades.component.utilidades.Ip;
//import vijnana.utilidades.component.utilidades.JsonMappeo;
//import vijnana.utilidades.component.utilidades.TipoFormatoFecha;
//import vijnana.wsrest.seguridad.Seguridad;
//
//public class UchilearteSeguridadModelo {
//
//	private static final Logger objLog = LoggerFactory.getLogger(UchilearteSeguridadModelo.class);
//
//	private VijnanaSeguridadProperties vijnanaSeguridadProperties = new VijnanaSeguridadProperties();
//	
////	private  webUchileProperties = new WebUchileProperties();
//	
//	private ClienteSeguridad clienteSeguridad = new ClienteSeguridad();
//
//	//Aqui se setean las variables que van a ir a seguridad.
//	public UchilearteSeguridadModelo() {
//		super();
//		this.clienteSeguridad = new ClienteSeguridad();
//	}
//	
//	//Validar el metodo si tenemos acceso a seguridad por uchilearte.
//	
//	public SessionPlataforma obtenerUsuarioLogin(String remoteAddr, String remoteHost, String dataRequest,
//			String nombreAplicacionSeguridad, String nombreAplicacion, String nombreAplicacionProducto,
//			String nombreAplicacionProductoServicio, String metodoHttp, String dominioEmpresa, String rolContexto, String keySeguridad,
//			int ttlSession, String nombreUsuario, String contrasenhaUsuarioEmpresa) throws Exception{
//			
//		
//		ConsultaSeguridad consultaSeguridad = new ConsultaSeguridad(remoteAddr,remoteHost,dataRequest,nombreAplicacionSeguridad,
//				nombreAplicacion,nombreAplicacionProducto,nombreAplicacionProductoServicio,
//				metodoHttp,dominioEmpresa,rolContexto,keySeguridad, ttlSession,
//				nombreUsuario,contrasenhaUsuarioEmpresa);
//		
////		Seguridad seguridad = new Seguridad(consultaSeguridad);
//
//
//		return null;
//	}
//
//	
//
//}
