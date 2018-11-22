package com.interfaces;

public class ArranqueInterfaz {

	public static void main(String[] args) {
		Person p = new Person();
		Canario c = new Canario();
		
		
		HacerCantar(p, c);
			
		

	}
	
	public static void HacerCantar(Cantante p, Canario c) {
    c.Cantar();
    p.Cantar();
}
}
