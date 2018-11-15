package negocio;

public class Jugador extends Persona{
  int codigoJugador;
  
  Persona p1 = new Persona();
  
 public String asignarNombre(String nombres) {
	 nombres=p1.setNombre("JUAN"); 
	 
	 return nombres;
 }
  
}
