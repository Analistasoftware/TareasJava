package negocio;

import java.util.logging.Logger;

public class RetornoInfo {

	public static void main(String[] args) {
		Jugador p2= new Jugador();
		
		String nombres = null;
		String nombress=p2.asignarNombre(nombres);
		
		
		
		System.out.println(nombres);
		

	}

}
