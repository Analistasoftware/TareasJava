package com.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		List<String> miLista = new ArrayList<>(); 
		//List<String> miListas = new ArrayList<>(); 
        miLista.add("CASA");
        miLista.add("PERRO");
        miLista.add("CASA");
        
        //Iterador
     Iterator<String> it = miLista.iterator();
     while(it.hasNext()) {
    	 
    	 if (miLista.equals("CASA")) {
			it.remove();
		}
    	 System.out.println("--Iterador--");
    	 System.out.println(it.next());
    	 System.out.println("--Iterador--");
     }
        
        //For tradicional
        for (int i = 0; i < miLista.size(); i++) {
			System.out.println(miLista.get(i));
		}
     
        
        //Foreach
        for (String str : miLista) {
        	//System.out.println("for each");
        	System.out.println(str);
		}
       
	}

}
