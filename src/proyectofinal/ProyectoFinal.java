/*
Leer n números enteros, almacenarlos en un vector y determinar a cuantos 
es igual el cuadrado de cada uno de los números leídos.
 */
package proyectofinal;
import java.util.Scanner;
/**
 *
 * @author Yherman Pardo
 */
public class ProyectoFinal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("*** Vector y el cuadrado de cada valor que posee ***");
        
        System.out.println("Ingrese el limite de los numeros a ingresar");
        int n;
        n = leer.nextInt();
        int [] A = new int [n];
        System.out.println("Ingrese algún número");
        for (int i = 0 ; i<n; i++){
            System.out.println("A["+i+"] =>");
            A[i] = leer.nextInt();
        }
        //Enseñar el vector con los numeros que ingreso
        System.out.println("Los numeros que ingreso fueron...");
        for(int i = 0; i < n; i++){
            System.out.println(A[i]+"   ");
        }
        
        //Proceso para desarrollar el cuadrado de cada número
        int [] B = new int [n];
        for(int i = 0; i<n; i++){
            B[i]= (int) Math.pow(A[i], 2);
        }
        //Enseñar la matriz resultante
        System.out.println("Vector resultante con su potencia respectiva");
        for(int i= 0; i<n; i++){
            System.out.println(B[i]+"  ");
        }
    }
    
}
