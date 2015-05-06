package unit9.unit9;

import java.util.Scanner;

/**
 * Practica 1 - Tema 9 
 * Diseño y realización de pruebas
 * @author Violeta Feliciano
 * @version 1, 06/05/2015
 */
public class CadenaAlumno{
	
	//Diferentes métodos con cadenas Strings
	public static void main(String[] args) {
		
		String cad1 = "VIOLETA FELICIANO";
		String cad2 = "violeta";
		String expresion = "En un lugar de la Mancha, había un lugar...";
		String regla1 = "lugar";
		String cambio1 = "sitio";
		String colores = "amarillo, rojo, verde, azul";
		String regla2 = ",";
		String expresionsinEsp = "    Hola qué tal estás?    ";
		String ejemplo;
		String prefix = "VIO";
		String sufix = "ITA";
		int posicion = 4;
		String ejemploLetras = "IO";
		int posicionFin = 10;
		
		System.out.println(sonIguales(cad1, cad2));
		System.out.println(esMayor(cad1, cad2));
		System.out.println(esMenor(cad1, cad2));
		System.out.println(comparaIgnorandoMayusculas(cad1, cad2));
		expresion = reemplazaTodos(expresion, regla1, cambio1);
		System.out.println(expresion);
		expresion = reemplazaPrimero(expresion, regla1, cambio1);
		System.out.println(expresion);
		muestraSplitLimite(colores, regla2, 3);
		muestraSplit(colores, regla2);
		expresionsinEsp = quitaEspacios(expresionsinEsp);
		System.out.println(expresionsinEsp);
		ejemplo = convertirMayusculas(cad2);
		System.out.println(ejemplo);
		ejemplo = convertirMinusculas(cad1);
		System.out.println(ejemplo);
		System.out.println(longitudCadena(cad1));
		System.out.println(empiezaCon(cad1, prefix));
		System.out.println(acabaEn(cad1, sufix));
		System.out.println(posicionPrimeraCadena(cad1, ejemploLetras));
		System.out.println(extraerSubstring(expresion, posicion));
		System.out.println(extraerSubstring(expresion, posicion, posicionFin));
		System.out.println(concatenaCadenas(cad1, cad2));
	}
	
	//Método que compara dos cadenas y te dice si son iguales
	public static boolean sonIguales(String cadena1, String cadena2)
	{
		boolean iguales = false;
		
		if(cadena1 == cadena2)
			iguales = true;
		
		return iguales;
	}
	
	//Método  que compara dos cadenas y te indica si la primera de ellas es mayor o no
	public static boolean esMayor(String cadena1, String cadena2)
	{
		boolean mayor = false;
			
		if(cadena1.length() > cadena2.length())
			mayor = true;
			
		return mayor;
	}
	
	//Método que comparados cadenas y te indica si la primera de ellas es menor o no
	public static boolean esMenor(String cadena1, String cadena2)
	{
		boolean menor = false;
			
		if(cadena1.length() < cadena2.length())
			menor = true;
			
		return menor;
	}
	
	//Método que compara dos cadenas y te dice si son iguales ignorando las mayúsculas que pueda haber
	public static boolean comparaIgnorandoMayusculas(String cadena1, String cadena2)
	{
		boolean ignoraMay = false;
		
		char [] frase1 = cadena1.toCharArray();
		char [] frase2 = cadena2.toCharArray();
			
		if(frase1.length == frase2.length)
		{
			for(int i=0; i<frase1.length; i++)
			{
				if(frase1[i] >= 'a' && frase1[i] <= 'z')
				{
					int k = (int) frase1[i];
					k = k-32;
					frase1[i] = (char) k;
				}
			
				if(frase2[i] >= 'a' && frase2[i] <= 'z')
				{
					int k = (int) frase1[i];
					k = k-32;
					frase2[i] = (char) k; 
				}
				
				if(frase1[i] == frase2[i])
				{
					ignoraMay = false;
					break;
				}
				else
					ignoraMay = true;
			}
			
		}
		
		return ignoraMay;
	}
	
	//Método que reemplaza de la cadena: cadena todos los regla/expresión que hay por cambio
	public static String reemplazaTodos(String cadena, String regla, String cambio)
	{
		char [] frase = cadena.toCharArray();
		char [] letrasAcambiar = regla.toCharArray();
		char [] letrasCambiadas = cambio.toCharArray();
		
		for(int i=0; i<frase.length; i++)
		{
			for(int k=0; k<letrasAcambiar.length; k++)
			{
				if(letrasAcambiar[k] == frase[i])
				{
					for(int j=0; j<frase.length; j++)
					{
						if(frase[j] == letrasAcambiar[k])
						{
							frase[i] = letrasCambiadas[k];
						}
					}
				}
			}
		}
		String frase1 = new String(frase);
		
		return frase1;
	}
	
	//Método que reemplaza en la cadena: cadena la primera regla/expresión que hay por cambio
	public static String reemplazaPrimero(String cadena, String regla, String cambio)
	{	
		char [] frase = cadena.toCharArray();
		char [] letrasAcambiar = regla.toCharArray();
		char [] letrasCambiadas = cambio.toCharArray();
		
		for(int i=0; i<frase.length; i++)
		{
			for(int k=0; k<letrasAcambiar.length; k++)
			{
				if(letrasAcambiar[k] == frase[i])
				{
					frase[i] = letrasCambiadas[i];
				}
			}
		}
		String frase1 = new String(frase);
		
		return frase1;
	}
	
	//Método que nos divide una cadena en base a una regla/expresión y un límite que será el número total de cadenas que queremos que nos muestre
	public static void muestraSplitLimite(String cadena, String regla, int limite)
	{
		char [] frase = cadena.toCharArray();
		char [] Reglafrase = regla.toCharArray();
		String frase1 = "";
			
		for(int i=0; i<frase.length; i++)
		{
			if(frase[i] == Reglafrase[0])
				frase[i] = ' ';
		}
		
		for(int k=0; k<frase.length; k++)
			frase1 += frase[k];
			System.out.print(frase1);
			System.out.println();
	}
	
	//Método que nos divide una cadena en base a una regla/expresión
	public static void muestraSplit(String cadena, String regla)
	{
		char [] frase = cadena.toCharArray();
		char [] Reglafrase = regla.toCharArray();
		String frase1 = "";
			
		for(int i=0; i<frase.length; i++)
		{
			if(frase[i] == Reglafrase[0])
				frase[i] = ' ';
		}
		
		for(int k=0; k<frase.length; k++)
			frase1 += frase[k];
			System.out.print(frase1);
			System.out.println();
	}
	
	//Método que devuelve un String sin espacios previos/posteriores
	public static String quitaEspacios(String cadena)
	{
		String cadSinEspacios = "";
		
		for(int i=0; i<cadena.length(); i++)
		{
			if(cadena.charAt(i) != ' ')
			{
				cadSinEspacios += cadena.charAt(i);
			}
		}
		
		return cadSinEspacios;
	}

	//Método que dado un String te devuelve ese mismo pero en mayúsculas
	public static String convertirMayusculas(String cadena)
	{
		String cadMay = "";
		char [] frase = cadena.toCharArray();
		
		for(int i=0; i<frase.length; i++)
		{
			if(frase[i] >= 'a' && frase[i] <='z')
			{
				int k = (int) frase[i];
				k = k-32;
				frase[i] = (char) k;
			}
		}
		
		for(int j=0; j<frase.length; j++)
			cadMay += frase[j];
		
		return cadMay;
	}
	
	//Método que te convierteun string todo a minúsculas
	public static String convertirMinusculas(String cadena)
	{
		String cadMin = "";
		char [] frase = cadena.toCharArray();
		
		for(int i=0; i<frase.length; i++)
		{
			if(frase[i] >= 'A' && frase[i] <='Z')
			{
				int k = (int) frase[i];
				k = k+32;
				frase[i] = (char) k;
			}
		}
		
		for(int j=0; j<frase.length; j++)
			cadMin += frase[j];
		
		return cadMin;
	}
	
	//Método que te devuelve la longitud de una cadena
	public static long longitudCadena(String cadena)
	{
		long longCadena = cadena.length();
			
		return longCadena;
	}
	
	//Método que te indica si la cadena comienza con el prefijo dado
	public static boolean empiezaCon(String cadena, String prefijo)
	{
		boolean empieza = false;
		
		char [] frase = cadena.toCharArray();
		char [] pref = prefijo.toCharArray();
		
		for(int i=0; i<pref.length; i++)
		{
			if(frase[i] == pref[i])
			{
				empieza = true;
			}
		}
		
		return empieza;
	}
	
	//Método que te indica si la cadena acaba con el sufijo dado
	public static boolean acabaEn(String cadena, String sufijo)
	{
		boolean acaba = false;
		
		char [] frase = cadena.toCharArray();
		char [] suf = sufijo.toCharArray();
		
		for(int i=0; i>suf.length; i--)
		{
			if(frase[i] == suf[i])
			{
				acaba = true;
			}
		}
		
		return acaba;
	}
	
	//Método que te devuelve la posición en la que se encuentra una letra/conjunto de letras en un string
	public static long posicionPrimeraCadena(String cadena, String letra)
	{
		char [] frase = cadena.toCharArray();
		char [] letra1 = letra.toCharArray();
		long posicionLetra = 0;
		
		for(int i=0; i<frase.length; i++)
		{
			if(frase[i] == letra1[0])
			{
				posicionLetra = i+2;
			}
		}
			
		return posicionLetra;
	}
	
	//Método que te devuelve una parte del string, para ello deberás de indicarle desde donde quieres que te devuelva
	public static String extraerSubstring(String cadena, int posicionInicio)
	{
		String subcadena = "";
		char [] frase = cadena.toCharArray();
		
		for(int i=posicionInicio; i<frase.length; i++)
		{
			subcadena += frase[i];
		}
			
		return subcadena;
	}
		
	//Método que te devuelve una parte del string, para ello deberás de indicarle desde dónde quieres que te devuelva y hasta dónde
	public static String extraerSubstring(String cadena, int posicionInicio, int posicionFinal)
	{
		String subcadena = "";
		char [] frase = cadena.toCharArray();
		
		for(int i=posicionInicio; i<=posicionFinal; i++)
		{
			subcadena += frase[i];
		}
			
		return subcadena;
	}
	
	//Método e cual te concatena dos cadenas usando el operando +
	public static String concatenaCadenas(String cadena1, String cadena2)
	{
		String CadenaConcatenada = cadena1 + " " + cadena2;
			
		return CadenaConcatenada;
	}
	
	
}
