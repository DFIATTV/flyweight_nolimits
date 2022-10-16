package clasico.objetos;

import java.util.Date;

public class PersonaC {

	public String cedula;
	public String nombre;
	public String primerApellido;
	public String segundoApellido;
	public String pais;
	public String ciudad;
	public String canton;
	public String genero;

	public PersonaC(String cedula, String nombre, String primerApellido, String segundoApellido, String pais, String ciudad, String canton, String genero) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.pais = pais;
		this.ciudad = ciudad;
		this.canton = canton;
		this.genero = genero;
	}

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

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCanton() {
		return canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String mostrarData() {
		return "PersonaC{" +
				"cedula='" + cedula + '\'' +
				", nombre='" + nombre + '\'' +
				", primerApellido='" + primerApellido + '\'' +
				", segundoApellido='" + segundoApellido + '\'' +
				", pais='" + pais + '\'' +
				", ciudad='" + ciudad + '\'' +
				", canton='" + canton + '\'' +
				", genero='" + genero + '\'' +
				'}';
	}
}
