package com.manashiki.uchilearte.seguridad.securitate;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import vijnana.wsrest.client.exception.VijnanaClientException;

public interface WSSecuritate {
	
	
	public boolean security(HttpServletRequest httpServletRequest)  throws Exception;
	
}
