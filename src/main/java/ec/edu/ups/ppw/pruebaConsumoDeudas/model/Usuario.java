package ec.edu.ups.ppw.pruebaConsumoDeudas.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name="TBL_Usuario")
public class Usuario {
	@Id
	@Column(name="usu_cedula")
	private String cedula;
	@Column(name="usu_nombre")
	private String nombre;
	@Column(name="usu_correo")
	private String correo;
	@Column(name="usu_direccion")
	private String direccion;
	@Column(name="usu_telefono")
	private String telefono;
	
	@OneToMany(mappedBy="usuario")
	private List<Consumo> consumo;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public List<Consumo> getConsumo() {
		return consumo;
	}

	public void setConsumo(List<Consumo> consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return "Usuario [cedula=" + cedula + ", nombre=" + nombre + ", correo=" + correo + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", consumo=" + consumo + "]";
	}
	
	
}
