/*
 * 3) Hacer un programa que tenga dos arreglos de 10 numeros enteros:
* llenar el primer arreglo con numeros al azar entre 2 y 8 (puede haber numeros repetidos)
* el segundo arreglo declararlo sin valores iniciales.
El programa copiará todos los numeros del primer arreglo hacia el segundo arreglo pero elevados al cuadrado.
-> al final del programa imprimir el contenido del primer arreglo y luego el contenido del segundo arreglo.

 */

package com.mycompany.tarea2doparcial_inciso3;
import java.util.Random;
/**
 *
 * @author Daniel
 */
public class Tarea2doParcial_Inciso3 {

    public static void main(String[] args) {
       System.out.println("JOSE DANIEL MEJIA CUELLAR 20212030242\n");
        
       Random r = new Random();
       
       int arr1[] = new int[10];
       int arr2[] = new int[10];
       
       for (int i = 0; i < arr1.length; i++) {
            arr1[i] =r.nextInt(8-2+1)+2;
            arr2[i] = (arr1[i]* arr1[i]);
       }    
       
        System.out.println("Arreglo 1: ");
        for (int i = 0; i <arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        
        System.out.println("Arreglo 2");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    
        
    }
}
