package patron.principal;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import modulo.util;
import patron.objetos.VehiculoFactory;
import patron.objetos.extrinseco.vehiculo;

public class Gestor_taller_mecanico {

	
	public String map_Main() {
		ArrayList<vehiculo> arrVehiculo = new ArrayList<vehiculo>();
		int totalVehiculo = 3;
		vehiculo tempCar = null;
		String resultado = "";
			
		for (int i=1; i<totalVehiculo ; i++) {
			tempCar = generarInfoVehiculo(i);
			arrVehiculo.add(tempCar);
		}
	
		for (vehiculo v:arrVehiculo)
			resultado += v.getDatosVehiculo() +"\n";
		
		return resultado;
	}
	
	
	@SuppressWarnings("deprecation")
	private static vehiculo generarInfoVehiculo(int i) {
		ArrayList<String> mDatos = new ArrayList<String>();
		Date mFecMatric = null;
		switch(i) {
		  case 1:
			  mDatos.add("Mercury");
			  mDatos.add("Bobcat");
			  mDatos.add("Verde");
			  mDatos.add("ABC-123");
			  mDatos.add("1-0123-0456");
			  mFecMatric = new Date(2019, 07, 14);
		    break;
		    
		  case 2:
			  mDatos.add("Mercury");
			  mDatos.add("Bobcat");
			  mDatos.add("Azul");
			  mDatos.add("CAB-123");
			  mDatos.add("1-0456-0123");
			  mFecMatric = new Date(2010, 01, 01);
		    break;
		    
		  case 3:
			  mDatos.add("Pontiac");
			  mDatos.add("GXP");
			  mDatos.add("Rojo");
			  mDatos.add("PKA-002");
			  mDatos.add("1-0444-0555");
			  mFecMatric = new Date(2018, 04, 23);
			break;
			
		  case 4:
			  mDatos.add("Pontiac");
			  mDatos.add("GXP");
			  mDatos.add("Rojo");
			  mDatos.add("CCC-123");
			  mDatos.add("1-0123-0456");
			  mFecMatric = new Date(2019, 07, 14);
			  break;
			  
		  case 5:
			  mDatos.add("Mercury");
			  mDatos.add("Bobcat");
			  mDatos.add("Verde");
			  mDatos.add("PPP-123");
			  mDatos.add("1-9876-5432");
			  mFecMatric = new Date(2019, 12, 14);
			  break;
		  default:
		   
		}
		
		return new vehiculo(mDatos.get(0),mDatos.get(1),mDatos.get(2),mDatos.get(3),mFecMatric,mDatos.get(4));
	}
	
	

	
	public static String obtenerValorIntrinsecos() {
		return util.imprimirMapaMarcaModelo(VehiculoFactory.getValoresIntrinsecos());
	}
}
