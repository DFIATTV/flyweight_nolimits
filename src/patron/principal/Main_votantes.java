package patron.principal;


public class Main_votantes {
	private static final Gestor_votantes _Gestor = new Gestor_votantes();
	
	public static void main(String[] args) {
		System.out.println("-----------------------------");
		System.out.println("Sistema del Votantes. ");
		System.out.println("-----------------------------\n");
		System.err.println("Toda la informacion extrinseca sera eliminada tras salir de la funcion.\n");
		System.out.println(_Gestor.map_Main());
	}
	
}
