/**
 * 
 */
package org.iesvegademijas.model;

import java.util.Objects;

/**
 * @author Antonio Martin
 *
 */
public class Usuario {
	
	private int id;
	private String nombre;
	private String contrasenia;
	private String rol;
	
	// Primer constructor
	public Usuario(int id, String nombre, String contrasenia, String rol) {
		
		this.id = id;
		this.nombre = nombre;
		this.contrasenia = contrasenia;
		this.rol = rol;
		
	}
	
	// Segundo constructor
	public Usuario() {
		
		
		
	}
	
	// Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	// Metodos de la clase
	@Override
	public String toString() {
		
		return "Usuario [id=" + id + ", nombre=" + nombre + ", contrasenia=" + contrasenia + ", rol=" + rol + "]";
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(contrasenia, id, nombre, rol);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(contrasenia, other.contrasenia) && id == other.id && Objects.equals(nombre, other.nombre)
				&& Objects.equals(rol, other.rol);
	}
	
	

	

}
