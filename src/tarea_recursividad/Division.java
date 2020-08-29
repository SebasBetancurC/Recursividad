package tarea_recursividad;

import java.util.Scanner;

public class Division {

		
		static Scanner entrada = new Scanner(System.in);
	     
	    public static void main(String[] args) {
	        int a, b;
	        System.out.print("Introduce el dividendo: ");
	        a = entrada.nextInt();
	        System.out.print("Introduce el divisor: ");
	        b = entrada.nextInt();
	        System.out.printf("%nLa división entre los dos números es: %d", division(a, b));
	    }
	     
	    private static int division(int a, int b){
	        if(b>a){
	            return 0;
	        } else {
	            return 1 + division(a-b, b);
	        }
	    }
	 
	}
	
