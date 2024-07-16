package ec.edu.ups.ppw.pruebaConsumoDeudas.bussines;

import java.util.Date;
import java.util.List;

import ec.edu.ups.ppw.pruebaConsumoDeudas.dao.ConsumoDao;
import ec.edu.ups.ppw.pruebaConsumoDeudas.dao.DeudaDao;
import ec.edu.ups.ppw.pruebaConsumoDeudas.dao.UsuarioDao;
import ec.edu.ups.ppw.pruebaConsumoDeudas.model.Consumo;
import ec.edu.ups.ppw.pruebaConsumoDeudas.model.Deuda;
import ec.edu.ups.ppw.pruebaConsumoDeudas.model.Usuario;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class Inicio {
	
	@Inject
	private UsuarioDao daoUsuario;
	@Inject
	private ConsumoDao daoConsumo;
	@Inject
	private DeudaDao daoDeuda;
	
	@PostConstruct
	public void init() {
		Deuda deuda = new Deuda();
		deuda.setId("0123");
		deuda.setValor(25);
		
		daoDeuda.insert(deuda);
		
		List<Deuda> listadoDeuda = daoDeuda.getAll();
		
	
		
		Date date = new Date();
		Consumo consumo = new Consumo();
		consumo.setId("0456");
		consumo.setConsumo("500v");
		consumo.setDescripcion("Tiene una deduda por lo servicios consumidos");
		consumo.setFechaDesde(date);
		consumo.setFechaHasta(date);
		consumo.setMedidor("025874693");
		consumo.setPrecio(10);
		consumo.setDeuda(deuda);
		
		daoConsumo.insert(consumo);
		List<Consumo> listadoConsumo = daoConsumo.getAll();		
		
		
		
		
		Usuario usuario = new Usuario();
		usuario.setCedula("0106121221");
		usuario.setNombre("Andres Chabla");
		usuario.setDireccion("Melchor de Aymerich");
		usuario.setTelefono("0987204415");
		usuario.setConsumo(listadoConsumo);
		
		daoUsuario.insert(usuario);
		
		List<Usuario> listadoUsuario = daoUsuario.getAll();
		
		
		
	}
	
}
