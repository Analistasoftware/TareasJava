import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*1)	Declara dos variables num�ricas (con el valor que desees), muestra por consola la suma, resta, multiplicaci�n, divisi�n y m�dulo 
 * (resto de la divisi�n).
 */
public class Ejercicio1 {
  private static final  Double  IVA =0.19;
  private static final  String  VALOR ="/0-9/";
	public static void main(String[] args) {
		
		System.out.println(IVA);
		Pattern pattern = Pattern.compile(VALOR);
		Matcher matcher = pattern.matcher(VALOR);
		boolean c = VALOR==VALOR;
		boolean b = c;
		if (b) {
			System.out.println("iguales");
		}
		else {
			System.out.println("no");
			
		
		}
	
	   
	}
	}


