package ec.edu.ups.ppw.pruebaConsumoDeudas.bussines;

import ec.edu.ups.ppw.pruebaConsumoDeudas.dao.UsuarioDao;
import ec.edu.ups.ppw.pruebaConsumoDeudas.model.Usuario;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionUsuario {
	
	@Inject
	private UsuarioDao daoUsuario;
	
	public Usuario getUsuario(String cedula)throws Exception{
		if(cedula.length() != 10){
			throw new Exception("Cedula incorrecta");
		}
		
		Usuario usuario = daoUsuario.read(cedula);
		if(usuario == null)
			throw new Exception("El usuario no existe");
			return usuario;
	}
}
