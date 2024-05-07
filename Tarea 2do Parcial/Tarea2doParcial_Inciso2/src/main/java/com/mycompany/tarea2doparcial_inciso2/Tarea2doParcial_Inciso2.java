/*
 2) Hacer un programa que tenga dos arreglos de 15 numeros enteros:
* llenar el primer arreglo con numeros al azar entre 1 y 10 (puede haber numeros repetidos)
* el segundo arreglo declararlo sin valores iniciales.
El programa copiará todos los numeros del primer arreglo hacia el segundo arreglo.
-> al final del programa imprimir el contenido del segundo arreglo.

 */

package com.mycompany.tarea2doparcial_inciso2;
import java.util.Random;
/**
 *
 * @author Daniel
 */
public class Tarea2doParcial_Inciso2 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR 20212030242\n");
        
       Random r = new Random();
       
       int arr1[] = new int[15];
       int arr2[] = new int[15];
       
       for (int i = 0; i < arr1.length; i++) {
            arr1[i] =r.nextInt(10-1+1)+1;
            arr2[i] = arr1[i];
            System.out.println(arr2[i]);
       }
       
       
    }
}
