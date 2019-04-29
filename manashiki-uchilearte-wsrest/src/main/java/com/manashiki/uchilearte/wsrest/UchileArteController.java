package com.manashiki.uchilearte.wsrest;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.ArchivoSolicitudDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ComunaDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.FinalidadCertificadoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadPostulacionDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.RegionDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudAcademicaDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudCertificadoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudPostulacionDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoCertificadoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoSolicitudDTO;
import com.manashiki.uchilearte.servdto.request.RequestProductoDTO;
import com.manashiki.uchilearte.servdto.transaccion.NegocioSolicitudDTO;
import com.manashiki.uchilearte.servdto.wrapper.UchileArte;
import com.manashiki.uchilearte.servicio.FactoryServicio;
import com.manashiki.uchilearte.wrapper.WrapperUchileArte;
//import com.manashiki.uchilearte.wrapper.WrapperUchileArte;

import seguridad.sucuritate.impl.Securitate;
import vijnana.respuesta.wrapper.response.AbstractWrapperError;
import vijnana.utilidades.component.utilidades.AppDate;

@Component
@Path("/uchileArte")
public class UchileArteController {


	@Context
	private HttpServletRequest httpServletRequest;

	@Autowired
	FactoryServicio factoryServicio;

	@Autowired
	Securitate securitate;

	@GET
	@Path("/prueba/{cadena}")
	@Produces({ "application/json" })
	public Response pruebaJson(@PathParam("cadena") String variable) {

		//		securitate = new WSSeguridadSeguridad() {
		//			boolean security (HttpServletRequest httpServletRequest){
		//				// TODO Auto-generated method stub
		//				return false;
		//			}
		//		
		//		}; 
		String responseGG = ".. servicio rest uchilearte 19-11-2016";

		return Response.status(201).entity(responseGG).build();
	}


	@POST
	@Path("/listarProgramaUniversidad")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarProgramaUniversidad(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try {
			//enviar AutenticationContext por la autorizacion
			//keySession
			//obtener la lista de servicios disponibles
			if(securitate.security(httpServletRequest)){
				List<ProgramaUniversidadDTO> retListaProgramaUniversidadDTO=factoryServicio.getProgramaUniversidadServicio().listarProgramaUniversidadDTO();

				if(retListaProgramaUniversidadDTO!=null && retListaProgramaUniversidadDTO.size()>0){
					uchileArte.setListaProgramaUniversidadDTO(retListaProgramaUniversidadDTO);
				}
			}
		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);

		} 
		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();


	}

	@POST
	@Path("/listarProgramaUniversidadConEstado")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarProgramaUniversidadConEstado(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try {
			//enviar AutenticationContext por la autorizacion
			//keySession
			//obtener la lista de servicios disponibles
			if(securitate.security(httpServletRequest)){
				List<ProgramaUniversidadDTO> retListaProgramaUniversidadDTO=factoryServicio.getProgramaUniversidadServicio().listarProgramaUniversidadxEstadoDTO();

				if(retListaProgramaUniversidadDTO!=null && retListaProgramaUniversidadDTO.size()>0){
					uchileArte.setListaProgramaUniversidadDTO(retListaProgramaUniversidadDTO);
				}
			}

		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);

		} 

		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();

	}

	@POST
	@Path("/listarProgramaUniversidadPostulacion")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarProgramaUniversidadPostulacion(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				List<ProgramaUniversidadPostulacionDTO> retListaProgramaUniversidadPostulacionDTO=factoryServicio.getProgramaUniversidadPostulacionServicio().listarProgramaUniversidadPostulacionDTO();

				if(retListaProgramaUniversidadPostulacionDTO!=null && retListaProgramaUniversidadPostulacionDTO.size()>0){
					uchileArte.setListaProgramaUniversidadPostulacionDTO(retListaProgramaUniversidadPostulacionDTO);
				}
			}
		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}


		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();

	}

	@POST
	@Path("/listarProgramaUniversidadPostulacionConEstado")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarProgramaUniversidadPostulacionConEstado(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				List<ProgramaUniversidadPostulacionDTO> retListaProgramaUniversidadPostulacionDTO=factoryServicio.getProgramaUniversidadPostulacionServicio().listarProgramaUniversidadPostulacionxEstadoDTO();

				if(retListaProgramaUniversidadPostulacionDTO!=null && retListaProgramaUniversidadPostulacionDTO.size()>0){
					uchileArte.setListaProgramaUniversidadPostulacionDTO(retListaProgramaUniversidadPostulacionDTO);
				}
			}
		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}

		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();

	}




	/******** Solicitudes Certificado  Solicitudes Certificado  Solicitudes Certificado  Solicitudes Certificado  Solicitudes Certificado  Solicitudes Certificado****/
	@POST
	@Path("/listarTipoCertificado")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarTipoCertificado(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				List<TipoCertificadoDTO> retListaTipoCertificadoDTO=factoryServicio.getTipoCertificadoServicio().listarTipoCertificadoDTO();//Traer Todos

				if(retListaTipoCertificadoDTO!=null && retListaTipoCertificadoDTO.size()>0){
					uchileArte.setListaTipoCertificadoDTO(retListaTipoCertificadoDTO);
				}
			}
		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}

		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();

	}

	@POST
	@Path("/listarTipoCertificadoConEstado")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarTipoCertificadoConEstado(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				List<TipoCertificadoDTO> retListaTipoCertificadoDTO = factoryServicio.getTipoCertificadoServicio().listarTipoCertificadoxEstadoDTO();

				if(retListaTipoCertificadoDTO!=null && retListaTipoCertificadoDTO.size()>0){
					uchileArte.setListaTipoCertificadoDTO(retListaTipoCertificadoDTO);
				}
			}
		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}


		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();

	}


	@POST
	@Path("/listarFinalidadCertificado")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarFinalidadCertificado(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		// Mostrar Todo
		try{
			if(securitate.security(httpServletRequest)){
				List<FinalidadCertificadoDTO> retListaFinalidadCertificadoDTO=factoryServicio.getFinalidadCertificadoServicio().listarFinalidadCertificadoDTO();

				if(retListaFinalidadCertificadoDTO!=null && retListaFinalidadCertificadoDTO.size()>0){
					uchileArte.setListaFinalidadCertificadoDTO(retListaFinalidadCertificadoDTO);
				}
			}
		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}

		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();
	}

	@POST
	@Path("/listarFinalidadCertificadoConEstado")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarFinalidadCertificadoConEstado(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		// Mostrar Todo
		try{
			if(securitate.security(httpServletRequest)){
				List<FinalidadCertificadoDTO> retListaFinalidadCertificadoDTO=factoryServicio.getFinalidadCertificadoServicio().listarFinalidadCertificadoOrdenDTO();

				if(retListaFinalidadCertificadoDTO!=null && retListaFinalidadCertificadoDTO.size()>0){
					uchileArte.setListaFinalidadCertificadoDTO(retListaFinalidadCertificadoDTO);
				}
			}
		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}

		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();
	}


	@POST
	@Path("/crearSolicitudCertificado")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response crearSolicitudCertificado(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				SolicitudCertificadoDTO solicitudCertificadoDTO = factoryServicio.getSolicitudCertificadoServicio().crearSolicitudCertificadoDTO(requestProductoDTO.getSolicitudCertificadoDTO());

				if(solicitudCertificadoDTO!=null && solicitudCertificadoDTO.getIdSolicitudCertificado()>0){
					uchileArte.setSolicitudCertificadoDTO(solicitudCertificadoDTO);
				}
			}
		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}

		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();

	}


	@POST
	@Path("/listarSolicitudCertificado")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarSolicitudCertificados(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				List<SolicitudCertificadoDTO> retSolicitudCertificadoDTO  = factoryServicio.getSolicitudCertificadoServicio().listarSolicitudCertificadosDTO();

				if(retSolicitudCertificadoDTO!=null && retSolicitudCertificadoDTO.size()>0){
					uchileArte.setListaSolicitudCertificadoDTO(retSolicitudCertificadoDTO);
				}
			}
		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}



		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();
	}

	@POST
	@Path("/listarSolicitudCertificadoxEntreFechas")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarSolicitudCertificadoxEntreFechas(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				List<SolicitudCertificadoDTO> retListaSolicitudCertificadoDTO = factoryServicio.getSolicitudCertificadoServicio().listarSolicitudCertificadoxEntreFechasDTO(requestProductoDTO.getListaSolicitudCertificadoDTO().get(0), requestProductoDTO.getListaSolicitudCertificadoDTO().get(1));

				if(retListaSolicitudCertificadoDTO!=null && retListaSolicitudCertificadoDTO.size()>0){
					uchileArte.setListaSolicitudCertificadoDTO(retListaSolicitudCertificadoDTO);
				}
			}
		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}



		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();
	}

	/******** Solicitudes Certificado  Solicitudes Certificado  Solicitudes Certificado  Solicitudes Certificado  Solicitudes Certificado  Solicitudes Certificado****/
	/******** Solicitudes Academicas  Solicitudes Academicas  Solicitudes Academicas  Solicitudes Academicas  Solicitudes Academicas  Solicitudes Academicas *********/


	@POST
	@Path("/listarTipoSolicitud")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarTipoSolicitud(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				List<TipoSolicitudDTO> retListaTipoSolicitudDTO=factoryServicio.getTipoSolicitudServicio().listarTipoSolicitudDTO();

				if(retListaTipoSolicitudDTO!=null && retListaTipoSolicitudDTO.size()>0){
					uchileArte.setListaTipoSolicitudDTO(retListaTipoSolicitudDTO);
				}
			}

		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}

		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();

	}

	@POST
	@Path("/listarTipoSolicitudConEstado")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarTipoSolicitudConEstado(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				List<TipoSolicitudDTO> retListaTipoSolicitudDTO =factoryServicio.getTipoSolicitudServicio().listarTipoSolicitudOrdenxEstadoDTO();

				if(retListaTipoSolicitudDTO!=null && retListaTipoSolicitudDTO.size()>0){
					uchileArte.setListaTipoSolicitudDTO(retListaTipoSolicitudDTO);
				}
			}


		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}
		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();

	}

	@POST
	@Path("/crearArchivoSolicitud")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response crearArchivoSolicitud(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				ArchivoSolicitudDTO metArchivoSolicitudAcademicaDTO = factoryServicio.getArchivoSolicitudServicio().crearArchivoSolicitudDTO(requestProductoDTO.getArchivoSolicitudDTO());

				if(metArchivoSolicitudAcademicaDTO!=null && metArchivoSolicitudAcademicaDTO.getIdArchivoSolicitud()>0){
					uchileArte.setArchivoAcademicaDTO(metArchivoSolicitudAcademicaDTO);
				}
			}

		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}
		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();
	}


	@POST
	@Path("/actualizarArchivoSolicitud")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response actualizarArchivoSolicitud(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				ArchivoSolicitudDTO metArchivoSolicitudAcademicaDTO = factoryServicio.getArchivoSolicitudServicio().actualizarArchivoSolicitudDTO(requestProductoDTO.getArchivoSolicitudDTO());

				if(metArchivoSolicitudAcademicaDTO!=null && metArchivoSolicitudAcademicaDTO.getIdArchivoSolicitud()>0){
					uchileArte.setArchivoAcademicaDTO(metArchivoSolicitudAcademicaDTO);
				}
			}


		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}

		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();
	}

	@POST
	@Path("/crearSolicitudAcademica")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response crearSolicitudAcademica(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				SolicitudAcademicaDTO solicitudAcademicaDTO = factoryServicio.getSolicitudAcademicaServicio().crearSolicitudAcademicaDTO(requestProductoDTO.getSolicitudAcademicaDTO());

				if(solicitudAcademicaDTO!=null && solicitudAcademicaDTO.getIdArchivoSolicitud()>0){
					uchileArte.setSolicitudAcademicaDTO(solicitudAcademicaDTO);
				}
			}

		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}

		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();
	}

	@POST
	@Path("/listarSolicitudAcademica")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarSolicitudAcademica(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				List<SolicitudAcademicaDTO> retListaSolicitudAcademicaDTO = factoryServicio.getSolicitudAcademicaServicio().listarSolicitudAcademicasDTO();

				if(retListaSolicitudAcademicaDTO!=null && retListaSolicitudAcademicaDTO.size()>0){
					uchileArte.setListaSolicitudAcademicaDTO(retListaSolicitudAcademicaDTO);
				}
			}
		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}



		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();
	}

	@POST
	@Path("/listarSolicitudAcademicaxEntreFechas")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarSolicitudAcademicaxEntreFechas(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				List<SolicitudAcademicaDTO> retListaSolicitudAcademicaDTO  = factoryServicio.getSolicitudAcademicaServicio().listarSolicitudAcademicaxEntreFechasDTO(requestProductoDTO.getListaSolicitudAcademicaDTO().get(0), requestProductoDTO.getListaSolicitudAcademicaDTO().get(1));

				if(retListaSolicitudAcademicaDTO!=null && retListaSolicitudAcademicaDTO.size()>0){
					uchileArte.setListaSolicitudAcademicaDTO(retListaSolicitudAcademicaDTO);
				}
			}
		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}

		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();
	}

	@POST
	@Path("/buscarArchivoSolicitud")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response buscarArchivoSolicitud(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				ArchivoSolicitudDTO archivoSolicitudDTO = factoryServicio.getArchivoSolicitudServicio().buscarArchivoSolicitudIdDTO(requestProductoDTO.getArchivoSolicitudDTO());

				if(archivoSolicitudDTO!=null && archivoSolicitudDTO.getIdArchivoSolicitud()>0){
					uchileArte.setArchivoAcademicaDTO(archivoSolicitudDTO);
				}
			}

		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}
		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();
	}

	@POST
	@Path("/listarRegion")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarRegion(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				List<RegionDTO> retListaRegionDTO = factoryServicio.getRegionServicio().listarRegionesDTO();

				if(retListaRegionDTO!=null && retListaRegionDTO.size()>0){
					uchileArte.setListaRegionDTO(retListaRegionDTO);
				}
			}
		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}

		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();
	}

	@POST
	@Path("/listarComunasxRegion")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarComunasxRegion(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				List<ComunaDTO> retListaComunaDTO  = factoryServicio.getComunaServicio().listarComunasDTOxRegion(requestProductoDTO.getComunaDTO());

				if(retListaComunaDTO!=null && retListaComunaDTO.size()>0){
					uchileArte.setListaComunaDTO(retListaComunaDTO);
				}
			}

		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}

		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();
	}

	@POST
	@Path("/crearSolicitudPostulacion")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response crearSolicitudPostulacion(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				SolicitudPostulacionDTO solicitudPostulacionDTO = factoryServicio.getSolicitudPostulacionServicio().crearSolicitudPostulacionDTO(requestProductoDTO.getSolicitudPostulacionDTO());

				if(solicitudPostulacionDTO!=null && solicitudPostulacionDTO.getIdSolicitudPostulacion()>0){
					uchileArte.setSolicitudPostulacionDTO(solicitudPostulacionDTO);
				}
			}

		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}

		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();
	}



	@POST
	@Path("/listarSolicitudPostulacion")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarSolicitudPostulacion(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				List<SolicitudPostulacionDTO> retListaSolicitudPostulacionDTO = factoryServicio.getSolicitudPostulacionServicio().listarSolicitudPostulacionesDTO();

				if(retListaSolicitudPostulacionDTO!=null && retListaSolicitudPostulacionDTO.size()>0){
					uchileArte.setListaSolicitudPostulacionDTO(retListaSolicitudPostulacionDTO);
				}
			}
		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}

		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();
	}

	//	@POST
	//	@Path("/listarSolicitudPostulacionxEntreFechas")
	//	@Consumes({ "application/json" })
	//	@Produces({ "application/json" })
	//	public Response listarSolicitudPostulacionxEntreFechas(RequestProductoDTO requestProductoDTO) {
	//		WrapperUchileArte wrapperUchileArte = null;
	//
	//		UchileArte uchileArte = new UchileArte();
	//
	//		Instant start = Instant.now();
	//
	//		int cantidadResultados = 0;
	//
	//		List<SolicitudPostulacionDTO> retListaSolicitudPostulacionDTO = new ArrayList<SolicitudPostulacionDTO>();
	//		/*-------------------------------------------------------------------------------------------------------------*/
	//		retListaSolicitudPostulacionDTO = factoryServicio.getSolicitudPostulacionServicio().listarSolicitudPostulacionxEntreFechasDTO(requestProductoDTO.getListaSolicitudPostulacionDTO().get(0), requestProductoDTO.getListaSolicitudPostulacionDTO().get(1));
	//
	//		if(retListaSolicitudPostulacionDTO!=null && retListaSolicitudPostulacionDTO.size()>0){
	//			cantidadResultados = retListaSolicitudPostulacionDTO.size();
	//		}
	//
	//		uchileArte.setListaSolicitudPostulacionDTO(retListaSolicitudPostulacionDTO);
	//		/*-------------------------------------------------------------------------------------------------------------*/
	//
	//		Instant end = Instant.now();
	//
	//		Duration duration = Duration.between(start, end);
	//
	//		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());
	//
	//		//wrapperUchileArte = new WrapperUchileArte( tiempoRespuesta, cantidadResultados, this.httpServletRequest.getRequestURL().toString(), null,
	//				//this.httpServletRequest.getContentType(), uchileArte);
	//
	//		return Response.status(201).entity(wrapperUchileArte).build();
	//	}

	@POST
	@Path("/listarSolicitudPostulacionxEntreFechas")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarSolicitudPostulacionxEntreFechas(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				List<SolicitudPostulacionDTO> retListaSolicitudPostulacionDTO = factoryServicio.getSolicitudPostulacionServicio().listarSolicitudPostulacionxEntreFechasDTO(requestProductoDTO.getListaSolicitudPostulacionDTO().get(0), requestProductoDTO.getListaSolicitudPostulacionDTO().get(1));

				if(retListaSolicitudPostulacionDTO!=null && retListaSolicitudPostulacionDTO.size()>0){
					uchileArte.setListaSolicitudPostulacionDTO(retListaSolicitudPostulacionDTO);
				}
			}

		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}

		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();
	}

	@POST
	@Path("/crearNegocioSolicitud")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response crearNegocioSolicitud(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		try{
			if(securitate.security(httpServletRequest)){
				NegocioSolicitudDTO negocioSolicitudDTO = factoryServicio.getNegocioSolicitudServicio().crearNegocioSolicitudDTO(requestProductoDTO.getNegocioSolicitudDTO());

				if(negocioSolicitudDTO!=null && negocioSolicitudDTO.getIdNegocioSolicitudDTO()>0){
					uchileArte.setNegocioSolicitudDTO(negocioSolicitudDTO);
				}
			}

		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}

		if(error==null){
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), uchileArte);
		}
		else{
			wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.httpServletRequest.getRequestURL().toString(),
					this.httpServletRequest.getMethod(), null);
		}

		return Response.status(201).entity(wrapperUchileArte).build();
	}

}
