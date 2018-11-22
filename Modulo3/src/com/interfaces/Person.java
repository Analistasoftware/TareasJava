package com.interfaces;

public class Person implements Cantante{
//Atributos
  private int edad;
  private String nombre;
  
  //Metodos
  public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}


//Metodo
public void Cantar() {
	System.out.println("Lalalalala la ala rere");
}
  
  
  
}
