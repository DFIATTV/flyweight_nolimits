package patron.objetos.extrinseco;

import patron.objetos.PersonaFactory;
import patron.objetos.intrinseco.DataCiudadano;

public class Persona {
	// Datos INTRINSICOS  encapsulados en la clase objetos.MarcaModelo
	private DataCiudadano _DatosIntrinsecos;


    //Datos EXTRINSECA
	public String cedula;
    public String nombre;
	public String primerApellido;
	public String segundoApellido;


	public Persona(String cedula, String nombre, String primerApellido, String segundoApellido, String pais, String ciudad, String canton, String genero) {

		_DatosIntrinsecos = PersonaFactory.obtenerCiudano(pais, ciudad, canton, genero);
		setDatosExtrinsecos(cedula, nombre, primerApellido, segundoApellido);
	}

	public String MostrarCaracteristicas(){
        return  _DatosIntrinsecos.mostrarData(getPersonaKey());
    }
	
	public String getPersonaKey() {
		return   _DatosIntrinsecos.pais + "-"
				+ _DatosIntrinsecos.ciudad + "-"
				+ _DatosIntrinsecos.canton + "-"
				+ _DatosIntrinsecos.genero;
	}

/* ********************************************************************** *	
 * Sección de funciones publicas del área EXTRINSECA. Estas funciones 
 * ayudan para mostrar los datos EXTRINSESCOS del objeto, osea los que 
 * no deberian de variar. Por eso solo muestran datos.
 * ********************************************************************** */

	public String getCedula() {
		return cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public String getDatosPersona() {
		return  "EXTRINSECOS:\n"
				+ " Cedula:" + getCedula() + " \n"
				+ " Nombre:" + getNombre() + " \n"
	       	 	+ " Primer Apellido:" + getPrimerApellido() + " \n"
				+ " Segundo Apellido:" + getSegundoApellido() + " \n"
	       	 	+ "--\n"
	       	 	+ "INTRINSECOS\n"
	       	 	+ MostrarCaracteristicas()+"\n";
	}



/* ********************************************************************** *	
 * Sección de funciones privadas. Sirven para modificar datos. 
 * Estos datos no deberían variar con el tiempo (son comunes a todas las 
 * instancias). Estas funciones son para manejar los datos EXTRINSECOS
 * ********************************************************************** */
	private void setDatosExtrinsecos(String cedula, String nombre, String primerApellido, String segundoApellido) {
		setCedula(cedula);
		setNombre(nombre);
		setPrimerApellido(primerApellido);
		setSegundoApellido(segundoApellido);
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
}
