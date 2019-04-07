package seguridad.aaa;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

public interface WSSeguridadSeguridad {
	
	public Response pruebaJson(@PathParam("cadena") String variable);
	
}
