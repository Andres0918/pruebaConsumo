package ec.edu.ups.ppw.pruebaConsumoDeudas.model;

import java.rmi.server.UID;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_CONSUMO")
public class Consumo {
	@Id
	@Column(name="con_id")
	private String id;
	@Column(name="con_descripcion")
	private String descripcion;
	@Column(name="con_consumo")
	private String consumo;
	@Column(name="con_medidor")
	private String medidor;
	@Column(name="con_fechaDesde")
	private Date fechaDesde;
	@Column(name="con_fechaHasta")
	private Date fechaHasta;
	@Column(name="con_precio")
	private int precio;
	
	@OneToOne
	@JoinColumn(name="deu_id")
	private Deuda deuda;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getConsumo() {
		return consumo;
	}
	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}
	public String getMedidor() {
		return medidor;
	}
	public void setMedidor(String medidor) {
		this.medidor = medidor;
	}
	public Date getFechaDesde() {
		return fechaDesde;
	}
	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	public Date getFechaHasta() {
		return fechaHasta;
	}
	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	public Deuda getDeuda() {
		return deuda;
	}
	public void setDeuda(Deuda deuda) {
		this.deuda = deuda;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Consumo [id=" + id + ", descripcion=" + descripcion + ", consumo=" + consumo + ", medidor=" + medidor
				+ ", fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + ", precio=" + precio + ", deuda="
				+ deuda + "]";
	}
	
	
	
	
	
}
