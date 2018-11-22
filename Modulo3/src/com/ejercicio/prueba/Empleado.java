package com.ejercicio.prueba;

public class Empleado {
	 //Atributos
	  private String rut;
	  private String nombres;
	  private String apellidos;
	  private String domicilio;
	  private double sueldoBruto;
	  
	  //Constructor
	  public Empleado() {
			
	  }
	  
	  //Metodos
    public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Double getSueldoBruto() {
		return sueldoBruto;
	}
//
	public void setSueldoBruto(Double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

   public String getAtributos(String Atributo){
	  this.apellidos=apellidos;
	   Atributo= rut+nombres+apellidos+domicilio;
	   return Atributo;
   
   }
}
