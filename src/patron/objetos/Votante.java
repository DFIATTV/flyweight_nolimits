package patron.objetos;

import patron.objetos.intrinseco.DataCiudadano;

//Extrinseco
public class Votante extends DataCiudadano {
	public Votante(String pais, String ciudad, String canton, String genero) {
		super(pais, ciudad, canton, genero);
	}

	@Override
	public String mostrarData(String pDatosExtra) {
		return super.mostrarData(pDatosExtra);
	}
}
