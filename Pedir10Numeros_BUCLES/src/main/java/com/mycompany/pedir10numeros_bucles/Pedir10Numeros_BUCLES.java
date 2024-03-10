/*
 * Pedir 10 numeros e imprimir la suma de ellos ademas de cual es el mayor.
 */

package com.mycompany.pedir10numeros_bucles;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Pedir10Numeros_BUCLES {

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        
        int a = 0, b = 0 ,mayor= Integer.MIN_VALUE , suma=0;  

//MIN_VALUE se usa para poner el menor numero soportado por el lenguaje JAVA, para el mayor seria MAX_VALUE
//Tambien se puede poner Float.MIN_VALUE o Double.MIN_VALUE y asi para tipos de datos.
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            a = userIn.nextInt();
            
         
            if (a >mayor) {
                mayor = a;
            }
            
            if(b >mayor){
                mayor = b;
            }
            
            //DAR VALOR A "b"
            b = a;
            
            //SUMA DE ENTRADAS
            suma += a;
            
        }
        
           System.out.println("Suma: " + suma);
           System.out.println("Mayor numero: " + mayor);
           
    }
}
