/*
Construir una función que reciba una matriz 5x5 y retome el valor de su moda
*/
package proyectofinal;
import java.util.Scanner;
/**
 *
 * @author Yherman Pardo
 */
public class ProyectoFinal_3 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Construir una función que reciba una matriz 5x5 y retorne el valor de su moda. La moda de un conjunto de datos es el dato que más se repite");
        
        int [][] A = new int[5][5];
        System.out.println("Ingrese los valores de la matriz 5x5");
        for (int i = 0; i < 5; i++){
            for (int j= 0; j < 5; j++){
                System.out.println("A["+i+"]["+j+"]=");
                A[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i<5; i++){
            for (int j= 0; j<5; j++){
                System.out.print(A[i][j]+"    ");           
            }
            System.out.println();
        }
        MODA(A);
        
    }
    public static void MODA (int A[][]) {

    int repeticiones= 0;
    int moda= 0;

    for(int i=0; i<5; i++){
        int numerorepeteciones= 0;
        for(int j=0; j<5; j++){
            for(int l=0; l<5; l++){
                if(A[i][j]==A[i][l]){
                    numerorepeteciones++;
                }   
                if(numerorepeteciones>repeticiones){
                    moda= A[i][j];
                    repeticiones= numerorepeteciones;
                }  
            }
        }
    }   
    System.out.println("La moda es: "+moda);

    }
}
