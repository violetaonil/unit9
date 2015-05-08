package unit9.unit9;

import java.util.Scanner;

/**
 * Ejercicio Cadenas - Primera parte
 * Strings
 * @author Violeta Feliciano
 * @version 1, 24/02/2015
 */
public class CadenasAlumno{
	
	//Diferentes métodos con cadenas Strings
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cad1 = "VIOLETA FELICIANO";
		String cad2 = "violeta";
		String expresion = "En un lugar de la Mancha, había un lugar...";
		String regla1 = "lugar";
		String cambio1 = "sitio";
		String expresionsinEsp = "    Hola qué tal estás?    ";
		String colores = "amarillo, rojo, verde, azul";
		String regla2 = ",";
		String ejemplo;
		char [] letras = {'v','i','o','l','e','t','a'};
		String prefix = "VIO";
		String sufix = "ITA";
		int posicion = 4;
		String ejemploLetras = "IO";
		int posicionFin = 10;
		int ejemploNum = 6;
		String numEntero = "5";
		
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
		ejemplo = convierteCharToString(letras);
		System.out.println(ejemplo);
		System.out.println(longitudCadena(cad1));
		System.out.println(empiezaCon(cad1, prefix));
		System.out.println(acabaEn(cad1, sufix));
		System.out.println(caracterPosicion(cad1, posicion));
		System.out.println(posicionPrimeraCadena(cad1, ejemploLetras));
		System.out.println(extraerSubstring(expresion, posicion));
		System.out.println(extraerSubstring(expresion, posicion, posicionFin));
		System.out.println(convertirEnteroString(ejemploNum));
		System.out.println(convertirStringEntero(numEntero));
		System.out.println(convertirStringDouble(numEntero));
		System.out.println(concatenaCadenasConcat(cad1, cad2));
		System.out.println(concatenaCadenas(cad1, cad2));
	}
	
	//Método que compara dos cadenas y te dice si son iguales
	public static boolean sonIguales(String cadena1, String cadena2)
	{
		boolean iguales = false;
		
		if(cadena1.equals(cadena2))
			iguales = true;
		
		return iguales;
	}
	
	//Método  que compara dos cadenas y te indica si la primera de ellas es mayor o no
	public static boolean esMayor(String cadena1, String cadena2)
	{
		boolean mayor = false;
		
		if(cadena2.compareTo(cadena1)>0)
			mayor = true;
		
		return mayor;
	}
	
	//Método que comparados cadenas y te indica si la primera de ellas es menor o no
	public static boolean esMenor(String cadena1, String cadena2)
	{
		boolean menor = false;
		
		if(cadena1.compareTo(cadena2)>0)
			menor = true;
		
		return menor;
	}
	
	//Método que compara dos cadenas y te dice si son iguales ignorando las mayúsculas que pueda haber
	public static boolean comparaIgnorandoMayusculas(String cadena1, String cadena2)
	{
		boolean ignoraMay = false;
		
		if(cadena1.equalsIgnoreCase(cadena2))
			ignoraMay = true;
		
		return ignoraMay;
	}
	
	//Método que reemplaza de la cadena: cadena todos los regla/expresión que hay por cambio
	public static String reemplazaTodos(String cadena, String regla, String cambio)
	{
		cadena = cadena.replaceAll(regla, cambio);
		
		return cadena;
	}
	
	//Método que reemplaza en la cadena: cadena la primera regla/expresión que hay por cambio
	public static String reemplazaPrimero(String cadena, String regla, String cambio)
	{	
		cadena = cadena.replaceFirst(regla, cambio);
		
		return cadena;
	}
	
	//Método que nos divide una cadena en base a una regla/expresión y un límite que será el número total de cadenas que queremos que nos muestre
	public static void muestraSplitLimite(String cadena, String regla, int limite)
	{
		String[] ConjuntoCadenas = cadena.split(regla, limite);
		
		for(int i=0; i<ConjuntoCadenas.length; i++)
			System.out.print(ConjuntoCadenas[i]);
			System.out.println();
	}
	
	//Método que nos divide una cadena en base a una regla/expresión
	public static void muestraSplit(String cadena, String regla)
	{
		String[] ConjuntoCadenas = cadena.split(regla);
		
		for(int i=0; i<ConjuntoCadenas.length; i++)
			System.out.print(ConjuntoCadenas[i]);
			System.out.println();
	}
	
	//Método que devuelve un String sin espacios previos/posteriores
	public static String quitaEspacios(String cadena)
	{
		String cadSinEspacios = cadena.trim();
		
		return cadSinEspacios;
	}
	
	//Método que dado un String te devuelve ese mismo pero en mayúsculas
	public static String convertirMayusculas(String cadena)
	{
		String cadMay = cadena.toUpperCase();
		
		return cadMay;
	}
	
	//Método que te convierteun string todo a minúsculas
	public static String convertirMinusculas(String cadena)
	{
		String cadMin = cadena.toLowerCase();
		
		return cadMin;
	}
	
	//Método que dada una cadena de caracteres te devuelve su contenido en un string
	public static String convierteCharToString(char [] cadena1)
	{
		String cadena = String.valueOf(cadena1);
		
		return cadena;
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
		
		if(cadena.startsWith(prefijo))
			empieza = true;
		
		return empieza;
	}
	
	//Método que te indica si la cadena acaba con el sufijo dado
	public static boolean acabaEn(String cadena, String sufijo)
	{
		boolean acaba = false;
		
		if(cadena.endsWith(sufijo))
			acaba = true;
		
		return acaba;
	}
	
	//Método que te devuelve el carácter que hay en una cadena en una determinada posición
	public static char caracterPosicion(String cadena, int indice)
	{
		char caracter = cadena.charAt(indice);
		
		return caracter;
	}
	
	//Método que te devuelve la posición en la que se encuentra una letra/conjunto de letras en un string
	public static long posicionPrimeraCadena(String cadena, String letra)
	{
		long posicionLetra = cadena.indexOf(letra);
		
		return posicionLetra;
	}
	
	//Método que te devuelve una parte del string, para ello deberás de indicarle desde donde quieres que te devuelva
	public static String extraerSubstring(String cadena, int posicionInicio)
	{
		String subcadena = cadena.substring(posicionInicio);
		
		return subcadena;
	}
	
	//Método que te devuelve una parte del string, para ello deberás de indicarle desde dónde quieres que te devuelva y hasta dónde
	public static String extraerSubstring(String cadena, int posicionInicio, int posicionFinal)
	{
		String subcadena = cadena.substring(posicionInicio, posicionFinal);
		
		return subcadena;
	}
	
	//Método que convierte un entero a string
	public static String convertirEnteroString(int numero)
	{
		String intCadena = Integer.toString(numero);
		
		return intCadena;
	}
	
	//Método que te convierte un string a entero
	public static int convertirStringEntero(String cadena)
	{
		int entero = Integer.parseInt(cadena);
	
		return entero;
	}
	
	//Método que te convierte una cadena a double
	public static double convertirStringDouble(String cadena)
	{
		double cadDouble = Double.parseDouble(cadena);
		
		return cadDouble;
	}
	
	//Método que te permite concatenar dos cadenas con el método concat
	public static String concatenaCadenasConcat(String cadena1, String cadena2)
	{
		cadena1 = cadena1.concat(cadena2);
		
		return cadena1;
	}
	
	//Método e cual te concatena dos cadenas usando el operando +
	public static String concatenaCadenas(String cadena1, String cadena2)
	{
		String CadenaConcatenada = cadena1 + " " + cadena2;
		
		return CadenaConcatenada;
	}

}