/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglos_detal;

/**
 
 * @author Daniel
 */
public class Arreglos_DeTal {

    public static void main(String[] args) {
        
        //INICIALIZAR ARREGLO SIN DATOS
        int arreglo1 [] = new int[5];
        
        //RECORRER ARREGLO E IMPRIMIR VALOR
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println(arreglo1[i]);
        }
        
        /*A diferencia de C++, aca si se inicializa solo, en C++ no se inicializa sino que se pone con valores basura.*/
        
        System.out.println("\n***********");
        
        //FORMA 1 DE ASIGNAR VALORES A POSICIONES DEL ARREGLO
        arreglo1[2] = 7 ;
        arreglo1[0] = 100;
        arreglo1[4] = 10;
        
         for (int i = 0; i < arreglo1.length; i++) {
            System.out.println(arreglo1[i]);
        }
         
         System.out.println("\n***********");
         
         //LEER POSICION SIN  TENER QUE RECORRER TODO EL ARREGLO
         System.out.println("Valor en posicion 3 de arreglo1 es: " + arreglo1[2]);
         System.out.println("Valor en posicion 2 de arreglo1 es: " + arreglo1[1]);
         System.out.println("Tamaño del arreglo1 es: " + arreglo1.length);
         System.out.println("valor en la ultima posicion es: " + arreglo1[arreglo1.length - 1]);
         
         
         //FORMA 2 DE METER VALORES, no se declara el tamaño sino que se pone en funcion de la cantidad de elementos que se pongan
         int arreglo2[] = {5,6,2,1,5,8};
         
         for (int i = 0; i < arreglo2.length; i++) {
            System.out.println(arreglo2[i]);
        }
         
            
         
         
    }
}
