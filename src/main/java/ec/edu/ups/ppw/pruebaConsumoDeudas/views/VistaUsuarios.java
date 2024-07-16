package ec.edu.ups.ppw.pruebaConsumoDeudas.views;

import java.util.List;

import ec.edu.ups.ppw.pruebaConsumoDeudas.bussines.GestionUsuario;
import ec.edu.ups.ppw.pruebaConsumoDeudas.model.Usuario;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("usuario")
public class VistaUsuarios {
	
	@Inject
	private GestionUsuario gUsuario;
	private Usuario persona = new Usuario();
	private List<Usuario> listado;
	
	@PostConstruct
	public void init() {
		listado = gUsuario.getUsuario();
	}
	
	public String consultar() {
		System.out.println(this.persona);
		
		try {
			gUsuario.getUsuario("0106121221");
			return "Detalle?faces-redirect=true";
		}catch(Exception e){
			e.printStackTrace();
			return "error";
		}
	}
	
	public String volver(){
		return "Ingreso.xhtml?faces-redirect=true";
	}

	public GestionUsuario getgUsuario() {
		return gUsuario;
	}

	public void setgUsuario(GestionUsuario gUsuario) {
		this.gUsuario = gUsuario;
	}

	public Usuario getPersona() {
		return persona;
	}

	public void setPersona(Usuario persona) {
		this.persona = persona;
	}

	public List<Usuario> getListado() {
		return listado;
	}

	public void setListado(List<Usuario> listado) {
		this.listado = listado;
	}
	
	
	
	
	
}
