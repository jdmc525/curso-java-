/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bucles_y_tal;

/**
 *
 * @author Daniel
 */
public class Bucles_y_tal {

    public static void main(String[] args) {
        
        //Imprimir del 1 -10 
        
        System.out.println("\n-------Imprimir del 1-10-----------\n");
        
        for(int i=1; i<=10 ; i++){
            System.out.println(i);
        }
        
        
        //Imprimir del 0-50 de 2 en 2
        
        System.out.println("\n-----Imprimir del 0-50 de 2 en 2-------\n");
  
        for (int i = 0; i <= 50; i+=2) { //    ++, += operadores de incremento
            System.out.println(i);
        }
        
        
        //TIP! Si sale el error "can't find symbol" es pq no esta declarada la variables

        
        //Imprimir del 0-50 de 5 en 5

        System.out.println("\n-----Imprimir del 0-50 de 5 en 5-------\n");

        for (int i = 0; i <= 50; i+=5) {
            System.out.println(i);
        
        }
        
        //Recorrer numeros de 0-50 e imprimir numeros impares (51 iteraciones)
        
        System.out.println("\n---Recorrer numeros de 0-50 e imprimir numeros impares---\n");
        
        for (int i = 0; i <= 50; i++) {
            if (i%2 == 1) {
                System.out.println(i);
            }
        }
        
        //Otra forma con menos iteraciones (25 iteraciones)
        
        System.out.println("\n---Otra forma---\n");
        
        for (int i = 1; i <=49; i+=2) {
            System.out.println(i);
        }
        
        /*Imprimir numeros del 1-100 
        imprimir in asterisco a la derecha de aquellos numeros que son multiplo de 10*/
        
        System.out.println("\n--Numeros del 1-100, asterisco en multiplo de 10--\n");
        
        for (int i = 1; i <= 100; i++) {
            if (i %10 == 0) {
                System.out.println(i + "*");
            }else{
                System.out.println(i);
            }   
        }
        
        //Imprimir numeros del 10 al 1 de forma descendente de uno en uno
        
        System.out.println("\n--Imprimir numeros del 10 al 1 de forma descendente de uno en uno--\n");
        
        for (int i = 10; i >= 1; i--) {  //OPERADOR DE DECREMENTO i-- , i-= algo
            System.out.println(i);
        }
        
        
        //Numeros del 10-0 pero de 2 en 2
        System.out.println("\n--Numeros del 10-0 pero de 2 en 2--\n");
        for (int i = 10; i >= 0; i-=2) {
            System.out.println(i);
        }
        
        
        //Numeros del 100 al 0 de 10 en 10
        
        System.out.println("\n--Numeros del 100-0 pero de 10 en 10--\n");
        for (int i = 100; i >= 0; i-=10) {
            System.out.println(i);
        }
        
        
        //TIP: For tambien puede hacer incrementos/decrementos en decimales
        
        
    }
}
