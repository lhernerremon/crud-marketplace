package pe.edu.unsch.entities;
// Generated 04/11/2020 04:25:44 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cliente generated by hbm2java
 */
@Entity
@Table(name = "cliente", catalog = "demo")
public class Cliente implements java.io.Serializable {

	private int id;
	private String nombre;
	private String apellidos;
	private Byte estado;

	public Cliente() {
	}

	public Cliente(int id) {
		this.id = id;
	}

	public Cliente(int id, String nombre, String apellidos, Byte estado) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.estado = estado;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "nombre", length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "apellidos", length = 45)
	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Column(name = "estado")
	public Byte getEstado() {
		return this.estado;
	}

	public void setEstado(Byte estado) {
		this.estado = estado;
	}

}
