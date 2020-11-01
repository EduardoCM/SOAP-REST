package com.spacemoney.tarjetas;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.spacemoney.tarjetas.model.Tarjeta;
import com.spacemoney.tarjetas.service.TarjetaService;
import com.spacemoney.tarjetas.service.TarjetaServiceImpl;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("tarjeta")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	
	private TarjetaService service = new TarjetaServiceImpl();
	
    @GET
    public List<Tarjeta> getIt() {
        return service.obtenerTarjetas();
    }
    
    @POST
    public Tarjeta crearTarjeta(Tarjeta tarjeta) {
    	service.creartarjeta(tarjeta);
    	return tarjeta;
    }
    
    @PUT
    public Tarjeta actualizartarjeta() {
    	return null;
    }
    
    @DELETE
    public void elimarTarjeta(String numeroTarjeta) {
    	service.eliminarTarjeta(numeroTarjeta);
    }
    
}
