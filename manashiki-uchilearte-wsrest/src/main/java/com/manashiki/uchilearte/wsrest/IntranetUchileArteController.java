package com.manashiki.uchilearte.wsrest;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.AlumnoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.AlumnoProgramaActivoSemestreDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.AsignaturaProgramaActivoSemestreDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.AsignaturaTomadaProgramaActivoSemestreDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaActivoSemestreDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SemestreTemporadaDTO;
import com.manashiki.uchilearte.servdto.request.RequestProductoDTO;
import com.manashiki.uchilearte.servdto.wrapper.UchileArte;
import com.manashiki.uchilearte.servicio.FactoryServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.wrapper.WrapperUchileArte;

import vijnana.respuesta.wrapper.response.AbstractWrapperError;
import vijnana.utilidades.component.utilidades.AppDate;

@Component
@Path("/intranetUchileArteController")
public class IntranetUchileArteController {

	@Context
	private HttpServletRequest httpServletRequest;

	@Autowired
	FactoryServicio factoryServicio;

	@GET
	@Path("/prueba/{cadena}")
	@Produces({ "application/json" })
	public Response pruebaJson(@PathParam("cadena") String variable) {

		String responseGG = ".. servicio rest intranet 19-11-2016";

		return Response.status(201).entity(responseGG).build();
	}

	//	ADMIN
	//	1) listarAlumnoNoAsociados
	//	1) listarAlumnoAsociados
	//	1) crearAlumno->Asociar a Usuario
	//	1) actualizarAlumno->Asociar a Usuario
	//	1) listarProgramaUniversidad
	//	2)crearProgramasActivosSemestre
	//	2)actualizarProgramasActivosSemestre
	//	3)crearAlumnoProgramaActivoSemestre
	//	3)actualizarAlumnoProgramaActivoSemestre
	//	4)crearAsignaturasProgramasActivosSemestre
	//	4)actualizarAsignaturasProgramasActivosSemestre
	//	6) listarAsignaturasProgramasActivosSemestreTomadasxAlumno

	//	USUARIO
	//	1) obtenerAlumnoxUsuario
	//	2)obtenerProgramasActivosSemestre
	//	3)obtenerAsignaturasProgramasActivosSemestre
	//	4)seleccionarAsignaturasProgramasActivosSemestre
	//	5)crearConfirmacionAsignaturasTomadas
	//	6) enviarCorreoConfirmacionAsignaturasTomada

	@POST
	@Path("/listarSemestreTemporada")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarSemestreTemporada(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		vijnana.respuesta.wrapper.response.AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		List<SemestreTemporadaDTO> listaSemestreTemporadaDTO = new ArrayList<SemestreTemporadaDTO>();
		try {
			listaSemestreTemporadaDTO = factoryServicio.getSemestreTemporadaServicio().listarSemestreTemporadaDTO();

			if(listaSemestreTemporadaDTO!=null && listaSemestreTemporadaDTO.size()>0){
				uchileArte.setListaSemestreTemporadaDTO(listaSemestreTemporadaDTO);
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
	@Path("/crearSemestreTemporada")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response crearSemestreTemporada(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		SemestreTemporadaDTO semestreTemporadaDTO = new SemestreTemporadaDTO();

		try{
			semestreTemporadaDTO=factoryServicio.getSemestreTemporadaServicio().crearSemestreTemporadaDTO(requestProductoDTO.getSemestreTemporadaDTO());

			if(semestreTemporadaDTO!=null && semestreTemporadaDTO.getIdSemestreTemporada()>0){
				uchileArte.setSemestreTemporadaDTO(semestreTemporadaDTO);
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
	@Path("/actualizarSemestreTemporada")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response actualizarSemestreTemporada(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		SemestreTemporadaDTO semestreTemporadaDTO = new SemestreTemporadaDTO();

		try{
			semestreTemporadaDTO = factoryServicio.getSemestreTemporadaServicio().actualizarSemestreTemporadaDTO(requestProductoDTO.getSemestreTemporadaDTO());

			if(semestreTemporadaDTO!=null && semestreTemporadaDTO.getIdSemestreTemporada()>0){
				uchileArte.setSemestreTemporadaDTO(semestreTemporadaDTO);
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
	@Path("/buscarSemestreTemporada")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response buscarSemestreTemporada(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		SemestreTemporadaDTO semestreTemporadaDTO = new SemestreTemporadaDTO();

		try {
			semestreTemporadaDTO = factoryServicio.getSemestreTemporadaServicio().buscarSemestreTemporadaxIdDTO(requestProductoDTO.getSemestreTemporadaDTO());

			if(semestreTemporadaDTO!=null && semestreTemporadaDTO.getIdSemestreTemporada()>0){
				uchileArte.setSemestreTemporadaDTO(semestreTemporadaDTO);
			}

		} catch (ServicioImplException e) {
			
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

	//Crear el Crear Usuario Universidad de Chile como servicio para los alumnos
	@POST
	@Path("/crearAlumno")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response crearAlumno(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		AlumnoDTO retAlumnoDTO = new AlumnoDTO();
		try{

			retAlumnoDTO=factoryServicio.getAlumnoServicio().crearAlumnoDTO(requestProductoDTO.getAlumnoDTO());//Traer Todos

			if(retAlumnoDTO!=null && retAlumnoDTO.getIdAlumnoUchile() >0){
				uchileArte.setAlumnoDTO(retAlumnoDTO);
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
	@Path("/actualizarAlumno")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response actualizarAlumno(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		AlumnoDTO retAlumnoDTO = new AlumnoDTO();
		try{
			retAlumnoDTO=factoryServicio.getAlumnoServicio().actualizarAlumnoDTO(requestProductoDTO.getAlumnoDTO());//Traer Todos

			if(retAlumnoDTO!=null && retAlumnoDTO.getIdAlumnoUchile() >0){
				uchileArte.setAlumnoDTO(retAlumnoDTO);
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
	@Path("/obtenerAlumnoxUsuario")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response obtenerAlumnoxUsuario(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		AlumnoDTO retAlumnoDTO = new AlumnoDTO();
		try{
			retAlumnoDTO=factoryServicio.getAlumnoServicio().buscarAlumnoxIdUsuarioxIdEstadoDTO(requestProductoDTO.getAlumnoDTO());//Traer Todos

			if(retAlumnoDTO!=null && retAlumnoDTO.getIdAlumnoUchile() >0){
				uchileArte.setAlumnoDTO(retAlumnoDTO);
			}
		}catch(ServicioImplException e){

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
	@Path("/listarAlumnoNoAsociadoToUsuario")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarAlumnoNoAsociadoToUsuario(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		List<AlumnoDTO> listaAlumnoDTO = new ArrayList<AlumnoDTO>();
		try{
			listaAlumnoDTO =factoryServicio.getAlumnoServicio().listarAlumnoNoAsociadoToUsuario();//Traer Todos

			if(listaAlumnoDTO!=null && listaAlumnoDTO.size() >0){
				uchileArte.setListaAlumnoDTO(listaAlumnoDTO);
			}
		}catch(ServicioImplException e){

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
	@Path("/listarAlumnoNoAsociadoToSeguridad")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarAlumnoNoAsociadoToSeguridad(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		List<AlumnoDTO> listaAlumnoDTO = new ArrayList<AlumnoDTO>();
		try{
			listaAlumnoDTO = factoryServicio.getAlumnoServicio().listarAlumnoNoAsociadoToSeguridad();//Traer Todos

			if(listaAlumnoDTO!=null && listaAlumnoDTO.size() >0){
				uchileArte.setListaAlumnoDTO(listaAlumnoDTO);
			}
		}catch(ServicioImplException e){

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
	@Path("/crearProgramaActivoSemestre")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response crearProgramaActivoSemestre(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		ProgramaActivoSemestreDTO programaActivoSemestreDTO = new ProgramaActivoSemestreDTO();
		try{
			programaActivoSemestreDTO=factoryServicio.getProgramaActivoSemestreServicio().crearProgramaActivoSemestreDTO(requestProductoDTO.getProgramaActivoSemestreDTO());

			if(programaActivoSemestreDTO!=null && programaActivoSemestreDTO.getIdProgramaActivoSemestre()>0){
				uchileArte.setProgramaActivoSemestreDTO(programaActivoSemestreDTO);
			}

		}catch(Exception e){

			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}
		/*-------------------------------------------------------------------------------------------------------------*/
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
	@Path("/actualizarProgramaActivoSemestre")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response actualizarProgramaActivoSemestre(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		ProgramaActivoSemestreDTO programaActivoSemestreDTO = new ProgramaActivoSemestreDTO();

		try{


			programaActivoSemestreDTO=factoryServicio.getProgramaActivoSemestreServicio().actualizarProgramaActivoSemestreDTO(requestProductoDTO.getProgramaActivoSemestreDTO());

			if(programaActivoSemestreDTO!=null && programaActivoSemestreDTO.getIdProgramaActivoSemestre()>0){
				uchileArte.setProgramaActivoSemestreDTO(programaActivoSemestreDTO);
			}

		}catch(Exception e){

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
	@Path("/buscarProgramaActivoSemestre")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response buscarProgramaActivoSemestre(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		ProgramaActivoSemestreDTO programaActivoSemestreDTO = new ProgramaActivoSemestreDTO();
		/*-------------------------------------------------------------------------------------------------------------*/
		try {
			programaActivoSemestreDTO = factoryServicio.getProgramaActivoSemestreServicio().buscarProgramaActivoSemestrexIdDTO(requestProductoDTO.getProgramaActivoSemestreDTO());

			if(programaActivoSemestreDTO!=null && programaActivoSemestreDTO.getIdProgramaActivoSemestre()>0){
				uchileArte.setProgramaActivoSemestreDTO(programaActivoSemestreDTO);
			}

		} catch (ServicioImplException e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}

		/*-------------------------------------------------------------------------------------------------------------*/
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
	@Path("/listarProgramaActivoSemestre")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarProgramaActivoSemestre(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		List<ProgramaActivoSemestreDTO> listaProgramaActivoSemestreDTO = new ArrayList<ProgramaActivoSemestreDTO>();

		try{
			/*-------------------------------------------------------------------------------------------------------------*/
			listaProgramaActivoSemestreDTO = factoryServicio.getProgramaActivoSemestreServicio().listarProgramaActivoSemestreDTO();

			if(listaProgramaActivoSemestreDTO!=null && listaProgramaActivoSemestreDTO.size()>0){
				uchileArte.setListaProgramaActivoSemestreDTO(listaProgramaActivoSemestreDTO);
			}

		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}
		/*-------------------------------------------------------------------------------------------------------------*/
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
	@Path("/crearAlumnoProgramaActivoSemestre")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response crearAlumnoProgramaActivoSemestre(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		AlumnoProgramaActivoSemestreDTO alumnoProgramaActivoSemestreDTO = new AlumnoProgramaActivoSemestreDTO();
		try{
			/*-------------------------------------------------------------------------------------------------------------*/
			alumnoProgramaActivoSemestreDTO=factoryServicio.getAlumnoProgramaActivoSemestreServicio().crearAlumnoProgramaActivoSemestreDTO(requestProductoDTO.getAlumnoProgramaActivoSemestreDTO());

			if(alumnoProgramaActivoSemestreDTO!=null && alumnoProgramaActivoSemestreDTO.getIdAlumnoProgramaActivoSemestre()>0){
				uchileArte.setAlumnoProgramaActivoSemestreDTO(alumnoProgramaActivoSemestreDTO);
			}

		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}
		/*-------------------------------------------------------------------------------------------------------------*/
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
	@Path("/actualizarAlumnoProgramaActivoSemestre")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response actualizarAlumnoProgramaActivoSemestre(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		AlumnoProgramaActivoSemestreDTO alumnoProgramaActivoSemestreDTO = new AlumnoProgramaActivoSemestreDTO();

		try{
			alumnoProgramaActivoSemestreDTO=factoryServicio.getAlumnoProgramaActivoSemestreServicio().actualizarAlumnoProgramaActivoSemestreDTO(requestProductoDTO.getAlumnoProgramaActivoSemestreDTO());

			if(alumnoProgramaActivoSemestreDTO!=null && alumnoProgramaActivoSemestreDTO.getIdAlumnoProgramaActivoSemestre()>0){
				uchileArte.setAlumnoProgramaActivoSemestreDTO(alumnoProgramaActivoSemestreDTO);
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
	@Path("/buscarAlumnoProgramaActivoSemestre")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response buscarAlumnoProgramaActivoSemestre(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		AlumnoProgramaActivoSemestreDTO alumnoProgramaActivoSemestreDTO = new AlumnoProgramaActivoSemestreDTO();
		/*-------------------------------------------------------------------------------------------------------------*/
		try {
			alumnoProgramaActivoSemestreDTO=factoryServicio.getAlumnoProgramaActivoSemestreServicio().buscarAlumnoProgramaActivoSemestrexIdDTO(requestProductoDTO.getAlumnoProgramaActivoSemestreDTO());

			if(alumnoProgramaActivoSemestreDTO!=null && alumnoProgramaActivoSemestreDTO.getIdAlumnoProgramaActivoSemestre()>0){
				uchileArte.setAlumnoProgramaActivoSemestreDTO(alumnoProgramaActivoSemestreDTO);
			}

		} catch (ServicioImplException e) {
			
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}

		/*-------------------------------------------------------------------------------------------------------------*/
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
	@Path("/listarAlumnoProgramaActivoSemestre")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarAlumnoProgramaActivoSemestre(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();


		List<AlumnoProgramaActivoSemestreDTO> listaAlumnoProgramaActivoSemestreDTO = new ArrayList<AlumnoProgramaActivoSemestreDTO>();

		try{
			listaAlumnoProgramaActivoSemestreDTO = factoryServicio.getAlumnoProgramaActivoSemestreServicio().listarAlumnoProgramaActivoSemestreDTO();

			if(listaAlumnoProgramaActivoSemestreDTO!=null && listaAlumnoProgramaActivoSemestreDTO.size()>0){
				uchileArte.setListaAlumnoProgramaActivoSemestreDTO(listaAlumnoProgramaActivoSemestreDTO);
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
	@Path("/crearAsignaturaProgramaActivoSemestre")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response crearAsignaturaProgramaActivoSemestre(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();


		AsignaturaProgramaActivoSemestreDTO asignaturaProgramaActivoSemestreDTO = new AsignaturaProgramaActivoSemestreDTO();
		/*-------------------------------------------------------------------------------------------------------------*/

		try{
			asignaturaProgramaActivoSemestreDTO=factoryServicio.getAsignaturaProgramaActivoSemestreServicio().crearAsignaturaProgramaActivoSemestreDTO(requestProductoDTO.getAsignaturaProgramaActivoSemestreDTO());

			if(asignaturaProgramaActivoSemestreDTO!=null && asignaturaProgramaActivoSemestreDTO.getIdAsignaturaProgramaActivoSemestre()>0){
				uchileArte.setAsignaturaProgramaActivoSemestreDTO(asignaturaProgramaActivoSemestreDTO);
			}
		} catch (Exception e) {
			
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}

		/*-------------------------------------------------------------------------------------------------------------*/
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
	@Path("/actualizarAsignaturaProgramaActivoSemestre")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response actualizarAsignaturaProgramaActivoSemestre(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		AsignaturaProgramaActivoSemestreDTO asignaturaProgramaActivoSemestreDTO = new AsignaturaProgramaActivoSemestreDTO();
		/*-------------------------------------------------------------------------------------------------------------*/
		try{

			asignaturaProgramaActivoSemestreDTO = factoryServicio.getAsignaturaProgramaActivoSemestreServicio().actualizarAsignaturaProgramaActivoSemestreDTO(requestProductoDTO.getAsignaturaProgramaActivoSemestreDTO());

			if(asignaturaProgramaActivoSemestreDTO!=null && asignaturaProgramaActivoSemestreDTO.getIdAsignaturaProgramaActivoSemestre()>0){
				uchileArte.setAsignaturaProgramaActivoSemestreDTO(asignaturaProgramaActivoSemestreDTO);
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
	@Path("/buscarAsignaturaProgramaActivoSemestre")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response buscarAsignaturaProgramaActivoSemestre(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		AsignaturaProgramaActivoSemestreDTO asignaturaProgramaActivoSemestreDTO = new AsignaturaProgramaActivoSemestreDTO();
		try {
			asignaturaProgramaActivoSemestreDTO = factoryServicio.getAsignaturaProgramaActivoSemestreServicio().buscarAsignaturaProgramaActivoSemestrexIdDTO(requestProductoDTO.getAsignaturaProgramaActivoSemestreDTO());

			if(asignaturaProgramaActivoSemestreDTO!=null && asignaturaProgramaActivoSemestreDTO.getIdAsignaturaProgramaActivoSemestre()>0){
				uchileArte.setAsignaturaProgramaActivoSemestreDTO(asignaturaProgramaActivoSemestreDTO);
			}

		} catch (ServicioImplException e) {
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
	@Path("/listarAsignaturaProgramaActivoSemestre")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarAsignaturaProgramaActivoSemestre(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		List<AsignaturaProgramaActivoSemestreDTO> listaAsignaturaProgramaActivoSemestreDTO = new ArrayList<AsignaturaProgramaActivoSemestreDTO>();

		try {
			listaAsignaturaProgramaActivoSemestreDTO = factoryServicio.getAsignaturaProgramaActivoSemestreServicio().listarAsignaturaProgramaActivoSemestreDTO();

			if(listaAsignaturaProgramaActivoSemestreDTO!=null && listaAsignaturaProgramaActivoSemestreDTO.size()>0){
				uchileArte.setListaAsignaturaProgramaActivoSemestreDTO(listaAsignaturaProgramaActivoSemestreDTO);
			}


		} catch (Exception e) {
			error = new AbstractWrapperError();

			error.setMensaje(e.getMessage());

			error.setCodigo(1);
		}

		/*-------------------------------------------------------------------------------------------------------------*/
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
	@Path("/crearAsignaturaTomadaProgramaActivoSemestre")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response crearAsignaturaTomadaProgramaActivoSemestre(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		AsignaturaTomadaProgramaActivoSemestreDTO asignaturaTomadaProgramaActivoSemestreDTO = new AsignaturaTomadaProgramaActivoSemestreDTO();
		try{
			asignaturaTomadaProgramaActivoSemestreDTO=factoryServicio.getAsignaturaTomadaProgramaActivoSemestreServicio().crearAsignaturaTomadaProgramaActivoSemestreDTO(requestProductoDTO.getAsignaturaTomadaProgramaActivoSemestreDTO());

			if(asignaturaTomadaProgramaActivoSemestreDTO!=null && asignaturaTomadaProgramaActivoSemestreDTO.getIdAsignaturaTomadaProgramaActivoSemestre()>0){
				uchileArte.setAsignaturaTomadaProgramaActivoSemestreDTO(asignaturaTomadaProgramaActivoSemestreDTO);
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
	@Path("/actualizarAsignaturaTomadaProgramaActivoSemestre")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response actualizarAsignaturaTomadaProgramaActivoSemestre(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		AsignaturaTomadaProgramaActivoSemestreDTO asignaturaTomadaProgramaActivoSemestreDTO = new AsignaturaTomadaProgramaActivoSemestreDTO();

		try{
			asignaturaTomadaProgramaActivoSemestreDTO = factoryServicio.getAsignaturaTomadaProgramaActivoSemestreServicio().actualizarAsignaturaTomadaProgramaActivoSemestreDTO(requestProductoDTO.getAsignaturaTomadaProgramaActivoSemestreDTO());

			if(asignaturaTomadaProgramaActivoSemestreDTO!=null && asignaturaTomadaProgramaActivoSemestreDTO.getIdAsignaturaTomadaProgramaActivoSemestre()>0){
				uchileArte.setAsignaturaTomadaProgramaActivoSemestreDTO(asignaturaTomadaProgramaActivoSemestreDTO);
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
	@Path("/buscarAsignaturaTomadaProgramaActivoSemestre")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response buscarAsignaturaTomadaProgramaActivoSemestre(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		AsignaturaTomadaProgramaActivoSemestreDTO asignaturaTomadaProgramaActivoSemestreDTO = new AsignaturaTomadaProgramaActivoSemestreDTO();

		try {
			asignaturaTomadaProgramaActivoSemestreDTO = factoryServicio.getAsignaturaTomadaProgramaActivoSemestreServicio().buscarAsignaturaTomadaProgramaActivoSemestrexIdDTO(requestProductoDTO.getAsignaturaTomadaProgramaActivoSemestreDTO());

			if(asignaturaTomadaProgramaActivoSemestreDTO!=null && asignaturaTomadaProgramaActivoSemestreDTO.getIdAsignaturaTomadaProgramaActivoSemestre()>0){
				uchileArte.setAsignaturaTomadaProgramaActivoSemestreDTO(asignaturaTomadaProgramaActivoSemestreDTO);
			}

		} catch (ServicioImplException e) {
			
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
	@Path("/listarAsignaturaTomadaProgramaActivoSemestre")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarAsignaturaTomadaProgramaActivoSemestre(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		AbstractWrapperError error = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		List<AsignaturaTomadaProgramaActivoSemestreDTO> listaAsignaturaTomadaProgramaActivoSemestreDTO = new ArrayList<AsignaturaTomadaProgramaActivoSemestreDTO>();

		try{

			listaAsignaturaTomadaProgramaActivoSemestreDTO = factoryServicio.getAsignaturaTomadaProgramaActivoSemestreServicio().listarAsignaturaTomadaProgramaActivoSemestreDTO();

			if(listaAsignaturaTomadaProgramaActivoSemestreDTO!=null && listaAsignaturaTomadaProgramaActivoSemestreDTO.size()>0){
				uchileArte.setListaAsignaturaTomadaProgramaActivoSemestreDTO(listaAsignaturaTomadaProgramaActivoSemestreDTO);
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
