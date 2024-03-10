

package com.mycompany.arreglo_ejercicio_001;
import java.util.Random;
/**
 *
 * @author Daniel
 */
public class Arreglo_Ejercicio_001 {

    public static void main(String[] args) {

/*
 * Programa que tenga arreglo unidimensional de numeros enteros de tamaño 
   25 llenar cada uno de sus elementos con un numero al azar entre 5 y 97, no importa que se repitan.

    Por ultimo imprimir el arreglo.
 */
        float arreglo1[] = new float[25];
        Random r = new Random();
        
        
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = r.nextInt(97-5+1)+5;
            System.out.println(arreglo1[i]);
        }

        System.out.println("************************\n\n");
        
        
 /*
        
 Programa 2     
        Hacer un programa que tenga dos arreglos unidimensionales
        de 25 numeros enteros cada uno:
            * llenar el primer arreglo con numeros al azar
              entre 1 y 10 (puede haber numeros repetidos)
            * el segundo arreglo solo inicializarlo sin valores
            * El programa copiará todos los numeros del primer arreglo
              hacia el segundo arreglo pero elevados al cubo.
          -> al final del programa imprimir el contenido de ambos arreglo
 */        
        
        int arreglo2[] = new int[25];
        int arreglo3[] = new int[25];
        
        Random r1 = new Random();
    
        System.out.println("Arreglo 2 " + " Arreglo 3");
        for (int i = 0; i < arreglo2.length; i++) {
            arreglo2[i] = r1.nextInt(10-1+1)+1;

            arreglo3[i] = (int)Math.pow(arreglo2[i], 3);  
//Como no sirve mathpow con enteros, se le dice que obligadamente lo ponga como entero con la etiqueta (int), sin eso da error
            
            System.out.println(arreglo2[i] + "\t\t" + arreglo3[i]);
            
        }
        
    }
}
