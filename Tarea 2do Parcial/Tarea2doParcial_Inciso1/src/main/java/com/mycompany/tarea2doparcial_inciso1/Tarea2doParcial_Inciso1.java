
/*
1) Hacer un programa que genere numeros enteros al azar comprendidos entre 1 y 6 los cuales debe almacenar 
en un arreglo unidimensional de tamaño 20 (puede haber numeros repetidos); Luego de llenar el arreglo con 
los numeros al azar debe imprimir el contenido de dicho arreglo usando la estructura de repetición a su gusto 
mostrando la posicion en el arreglo y el valor que contiene dicho elemento.

*/

package com.mycompany.tarea2doparcial_inciso1;
import java.util.Random;
/**
 *
 * @author Daniel
 */
public class Tarea2doParcial_Inciso1 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR 20212030242\n");
        
        Random r = new Random();
        int arr1[] = new int [20];
        
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] =r.nextInt(6-1+1)+1;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Posicion: " + i );
            System.out.println("Numero aleatorio: " + arr1[i]);
        }
        
        
        
    }
}
