package ec.edu.ups.ppw.pruebaConsumoDeudas.dao;

import java.util.List;

import ec.edu.ups.ppw.pruebaConsumoDeudas.model.Deuda;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class DeudaDao {
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Deuda deuda) {
		em.persist(deuda);
	}
	
	public void update(Deuda deuda) {
		em.merge(deuda);
	}
	public void delete(int id) {
		Deuda deuda = this.read(id);
		em.remove(deuda);
	}
	
	public Deuda read(int id) {
		Deuda deuda = em.find(Deuda.class, id);
		return deuda;
	}
	
	public List<Deuda> getAll() {
		String jpl = "SELECT f FROM Deuda d";
		Query query = em.createQuery(jpl, Deuda.class);
		return query.getResultList();
	}
}
