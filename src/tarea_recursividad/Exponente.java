package tarea_recursividad;

public class Exponente {

	public static void main(String[] args) {
		
		
		int a = 2;
		int b = 3;
		
		System.out.println(potencia(a,b));
		
		
		
		

	}
	
	public static int potencia(int a, int b) {
		if(b==0) {
			return 1;
		}else if(b==1) {
			return a;
		}else {
			return a * potencia(a, b-1)	;	
			
		}
	}

}
