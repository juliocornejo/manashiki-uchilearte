package seguridad.sucuritate.impl;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.seguridad.securitate.WSSecuritate;

import vijnana.utilidades.component.utilidades.excriptar.SimpleDecodificacion;
import vijnana.wsrest.seguridad.SeguridadModelo;

@Component
public class Securitate implements WSSecuritate{
	
	public boolean security(HttpServletRequest httpServletRequest) throws Exception{
		
		try {
			
			String[] usuarioPassword = SimpleDecodificacion.desencriptarUsuarioPassword(httpServletRequest.getHeader("authorization"));
			
			String [] splitArray = httpServletRequest.getRequestURL().toString().split("/"); 
			
			SeguridadModelo seguridadModelo = new SeguridadModelo(usuarioPassword[0], usuarioPassword[1], 
					httpServletRequest.getMethod(), 
					splitArray);
			
			return seguridadModelo.isSecuritate();
//			ResponseSeguridad responseSeguridad= clienteRestAplicacion.post(consultaSeguridad, vijnanaSeguridadProperties.getVijnanaServidor(), vijnanaSeguridadProperties.getLocalObtenerSeguridadContext());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("Error en la Obtencion de autorizacion del servicio en el producto en la aplicacion");
		}
	}


}
