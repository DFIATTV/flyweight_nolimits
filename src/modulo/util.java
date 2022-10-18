/* ********************************************************************** *
 * Clase que brinda funciones reutilizables.
 * 
 * @by Erick Brenes
 * ********************************************************************** */
package modulo;

import patron.objetos.intrinseco.DataCiudadano;

public class util {

	public static String imprimirIntegranteMapa(String pKey, DataCiudadano dataC, String datosExtra) {
		return (pKey+" "+ dataC.mostrarData(datosExtra));
	}
	
	public static String generarKey(String pais, String ciudad, String canton, String genero) {
		return pais+"-"+ciudad+"-"+canton+"-"+genero;
	}
}
