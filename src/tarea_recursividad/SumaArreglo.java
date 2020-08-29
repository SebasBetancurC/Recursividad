package tarea_recursividad;

public class SumaArreglo {

	
	   static int sumar (int arreglo[], int indice)
	    {
	        if(indice<arreglo.length) {
	            return arreglo[indice]+sumar(arreglo,indice+1);
	        }
	        return 0;
	    }
	 
	    public static void main(String[] args) {
	        
	        int resultado[]={1,3,4};
	 
	        System.out.println("La suma del contenido del arreglo es: "+sumar(resultado,0));
	    }
}
