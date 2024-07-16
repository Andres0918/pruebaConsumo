package ec.edu.ups.ppw.pruebaConsumoDeudas.dao;

import java.util.List;

import ec.edu.ups.ppw.pruebaConsumoDeudas.model.Consumo;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class ConsumoDao {

	@PersistenceContext
	private EntityManager em;
	
	public void insert(Consumo consumo) {
		em.persist(consumo);
	}
	
	public void update(Consumo consumo) {
		em.merge(consumo);
	}
	public void delete(int id) {
		Consumo consumo = this.read(id);
		em.remove(consumo);
	}
	
	public Consumo read(int id) {
		Consumo consumo = em.find(Consumo.class, id);
		return consumo;
	}
	
	public List<Consumo> getAll() {
		String jpl = "SELECT f FROM Consumo c";
		Query query = em.createQuery(jpl, Consumo.class);
		return query.getResultList();
	}
}
