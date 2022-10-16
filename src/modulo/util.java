/* ********************************************************************** *
 * Clase que brinda funciones reutilizables.
 * 
 * @by Erick Brenes
 * ********************************************************************** */
package modulo;

import clasico.objetos.PersonaC;
import patron.objetos.intrinseco.DataCiudadano;
import java.util.Map;

public class util {

	public static String imprimirMapaCiudadano(Map<String,PersonaC> map) {
		PersonaC persona;
		String resultado = "";
		for(Map.Entry m:map.entrySet()){
			persona = (PersonaC) m.getValue();
		  	resultado += (m.getKey()+" "+persona.mostrarData()) + "\n";
		}  
		return resultado;
	}
	
	public static String imprimirIntegranteMapa(String pKey, DataCiudadano dataC) {
		return (pKey+" "+ dataC.mostrarData(""));
	}

	public static String imprimirIntegranteMapa(String pKey, DataCiudadano dataC, String datosExtra) {
		return (pKey+" "+ dataC.mostrarData(datosExtra));
	}
	
	public static String generarKey(String pais, String ciudad, String canton, String genero) {
		return pais+"-"+ciudad+"-"+canton+"-"+genero;
	}
 
	public static String imprimirMapaDataCiudadano(Map<String, DataCiudadano> dataCiudadano) {
		String caracteristicas="";
		for(Map.Entry m:dataCiudadano.entrySet())
		  caracteristicas += imprimirIntegranteMapa (m.getKey().toString(),(DataCiudadano) m.getValue()) +"\n";
		
		return caracteristicas;
	}


}
