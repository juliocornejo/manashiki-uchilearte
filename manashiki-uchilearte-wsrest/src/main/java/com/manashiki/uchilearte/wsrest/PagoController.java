package com.manashiki.uchilearte.wsrest;

import java.time.Duration;
import java.time.Instant;

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

import com.manashiki.uchilearte.servdto.request.RequestProductoDTO;
import com.manashiki.uchilearte.servdto.transaccion.LogReservaDTO;
import com.manashiki.uchilearte.servdto.wrapper.UchileArte;
import com.manashiki.uchilearte.servicio.FactoryServicio;
import com.manashiki.uchilearte.wrapper.WrapperUchileArte;
//import com.manashiki.webmail.dto.ResponseWrapper;

import vijnana.utilidades.component.utilidades.AppDate;

@Component
@Path("/pago")
public class PagoController {


	@Context
	private HttpServletRequest request;

	@Autowired
	FactoryServicio factoryServicio;

	@GET
	@Path("/prueba/{cadena}")
	@Produces({ "application/json" })
	public Response pruebaJson(@PathParam("cadena") String variable) {

		String responseGG = ".. servicio rest pago uchilearte";

		return Response.status(201).entity(responseGG).build();
	}
	
	@POST
	@Path("/crearLogReserva")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response crearLogReserva(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		vijnana.respuesta.wrapper.response.AbstractWrapperError error = null;
		
		UchileArte uchileArte = new UchileArte();
		
		Instant start = Instant.now();

		LogReservaDTO logReservaDTO = factoryServicio.getLogReservaServicio().crearLogReservaDTO(requestProductoDTO.getLogReservaDTO());

		uchileArte.setLogReservaDTO(logReservaDTO);
		/*-------------------------------------------------------------------------------------------------------------*/
		wrapperUchileArte = new WrapperUchileArte( error,  AppDate.generarTiempoDuracion(Duration.between(start, Instant.now())), this.request.getRequestURL().toString(),
				this.request.getMethod(), uchileArte);

		return Response.status(201).entity(wrapperUchileArte).build();
	}

}
