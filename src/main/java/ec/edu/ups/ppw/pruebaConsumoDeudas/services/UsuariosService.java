package ec.edu.ups.ppw.pruebaConsumoDeudas.services;

import java.util.List;


import ec.edu.ups.ppw.pruebaConsumoDeudas.bussines.GestionUsuario;
import ec.edu.ups.ppw.pruebaConsumoDeudas.model.Usuario;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/usuarios")
/***
 * Solicitudes de ejemplo
 * PUT demojakarta/rs/clientes/
 * POST demojakarta/rs/clientes/
 * DELETE demojakarta/rs/clientes/?id=012456
 * GET demojakarta/rs/clientes/
 * GET demojakarta/rs/clientes/0106121221
 * */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuariosService {

	@Inject
	private GestionUsuario gUsuarios;

	
	@GET
	@Path("/{cedula}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(String cedula) {
		Usuario usuario;
		try {
			usuario = gUsuarios.getUsuario(cedula);
			return Response.ok(usuario).build();
		}catch(Exception e){
			e.printStackTrace();
			return Response.status(404).entity(e.getMessage()).build();
		}
	}
	
}
