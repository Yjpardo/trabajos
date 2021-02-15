/*
Leer una matriz 4x6 entera y determinar en 
que posiciones estan los menores por fila.
 */
package proyectofinal;
import java.util.Scanner;
/**
 *
 * @author Yherman Pardo
 */
public class ProyectoFinal_2 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Matriz 4x6 y la posicion de lo menores de cada fila");
        int [][] A = new int [4][6];
        int [] numMenor = new int [4];
        int menor;
        int num = 0;
        System.out.println("Ingrese los valores de la Matriz");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 6; j++){                
                System.out.println("A["+i+"]["+j+"]= "); 
                A [i][j]= leer.nextInt();
            }
        }
        System.out.println("**Matriz escrita**");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(A[i][j]+"  ");            
            }
            System.out.println();
        }
        
        for(int i = 0; i<4; i++){
            menor = 4;
            for(int j = 0; j<6; j++){
                if (menor >  A[i][j]){
                    menor = A[i][j]; 
                }
            }
            System.out.println("");
            System.out.println("El menor de la fila " +i+" es "+menor);
        }        
    }
}
