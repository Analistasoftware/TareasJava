package negocio;

public class Persona {
  //Atributos
	private String nombre;
	private int edad;
	private boolean sexo;
	private String nacionalidad;
	
	
	/**
	 * @return 
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre
	 * @return 
	 */
	public String setNombre(String nombre) {
		return this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
}
