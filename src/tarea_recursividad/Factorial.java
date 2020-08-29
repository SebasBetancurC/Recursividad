package tarea_recursividad;

public class Factorial {

	public static void main(String[] args) {
		
		int  num=5;
		int resultado = factorial(num);
		System.out.println(resultado);
		
		

	}
	
	public static int factorial(int numero) {
		
		int mult;
		
		if(numero==1) {
			return 1;
		}
		
		else {
			
			mult = numero * factorial(numero-1);
		}
		
		return mult;
		
	}

}
