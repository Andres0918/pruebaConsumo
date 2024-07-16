package ec.edu.ups.ppw.pruebaConsumoDeudas.dao;

import java.util.List;

import ec.edu.ups.ppw.pruebaConsumoDeudas.model.Usuario;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class UsuarioDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Usuario usuario) {
		em.persist(usuario);
	}
	public void update(Usuario usuario) {
		em.merge(usuario);
	}
	public void delete(String cedula) {
		Usuario usuario = this.read(cedula);
		if(usuario!= null) {
			em.remove(usuario);
		}
	}
	public Usuario read(String cedula) {
		Usuario usuario = em.find(Usuario.class, cedula);
		return usuario;
	}
	public List<Usuario> getAll(){
		String jpl = "SELECT c FROM Usuario u";
		Query query = em.createQuery(jpl, Usuario.class);
		return query.getResultList();
	}
	
	
}
