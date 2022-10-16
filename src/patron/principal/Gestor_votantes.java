package patron.principal;

import patron.objetos.extrinseco.Persona;

import java.util.ArrayList;

public class Gestor_votantes {

	
	public String map_Main() {


		ArrayList<Persona> arrPersonas = new ArrayList<Persona>();

		int totalPersonas = 2;

		Persona tempPersona = null;
		String resultado = "";
			
		for (int i=1; i<=totalPersonas ; i++) {
			tempPersona = generarInfoPersona(i);
			arrPersonas.add(tempPersona);
		}
	
		for (Persona persona:arrPersonas)
			resultado += persona.getDatosPersona() +"\n";
		
		return resultado;
	}


	private static Persona generarInfoPersona(int i) {
		ArrayList<String> mDatos = new ArrayList<String>();

		switch(i) {
		  case 1:
			  mDatos.add("Cedula");
			  mDatos.add("Nombre");
			  mDatos.add("Primer Ap");
			  mDatos.add("Segundo Ap");
			  mDatos.add("Pais");
			  mDatos.add("Ciudad");
			  mDatos.add("Canton");
			  mDatos.add("Genero");
		    break;
		    
		  case 2:
			  mDatos.add("Cedula");
			  mDatos.add("Nombre");
			  mDatos.add("Primer Ap");
			  mDatos.add("Segundo Ap");
			  mDatos.add("Pais");
			  mDatos.add("Ciudad");
			  mDatos.add("Canton");
			  mDatos.add("Genero");
		    break;
		}
		
		return new Persona(mDatos.get(0),mDatos.get(1),mDatos.get(2),mDatos.get(3),mDatos.get(4),mDatos.get(5), mDatos.get(6), mDatos.get(7));
	}
}
