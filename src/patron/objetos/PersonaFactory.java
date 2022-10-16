package patron.objetos;

import modulo.util;
import patron.objetos.intrinseco.DataCiudadano;

import java.util.HashMap;
import java.util.Map;

public class PersonaFactory {

	private static Map<String, DataCiudadano> gPoolCiudadano = new HashMap<String,DataCiudadano>();

	public static DataCiudadano obtenerCiudano(String pais, String ciudad, String canton, String genero) {
		DataCiudadano data = null;
		String key = util.generarKey(pais, ciudad, canton, genero);
		if (gPoolCiudadano.containsKey(key)) {
			data = gPoolCiudadano.get(key);
			util.imprimirIntegranteMapa(key, data, "Vehiculo recuperado");
			System.out.println("----Data recuperada-----");

		}else {
			data = new Votante(pais, ciudad, canton, genero);
			gPoolCiudadano.put(key, data);
		}
		return data;
	}
}
