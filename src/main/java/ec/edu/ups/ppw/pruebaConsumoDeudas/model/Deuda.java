package ec.edu.ups.ppw.pruebaConsumoDeudas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="TBL_DEUDA")
public class Deuda {
	
	@Id
	@Column(name="deu_id")
	private String id;
	@Column(name="deu_id")
	private int valor;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Deuda [id=" + id + ", valor=" + valor + "]";
	}
	
	
	
	
}
