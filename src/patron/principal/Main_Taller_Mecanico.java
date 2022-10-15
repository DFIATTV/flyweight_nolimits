package patron.principal;


public class Main_Taller_Mecanico {
	private static Gestor_taller_mecanico _Gestor = new Gestor_taller_mecanico();
	
	public static void main(String[] args) {
		//Funcion inicial donde crea los intrinsecos y extrinsecos
		System.out.println("-----------------------------");
		System.out.println("Sistema del taller mecanico. ");
		System.out.println("-----------------------------\n");
		System.err.println("Toda la informacion extrinseca sera eliminada tras salir de la funcion.\n");
		System.out.println(_Gestor.map_Main());
		
		System.out.println("-----------------------------");
		System.out.println("Imprimimos los Intrinsecos. ");
		System.out.println("-----------------------------\n");
		System.out.println(_Gestor.obtenerValorIntrinsecos());
		
	}
	
}
