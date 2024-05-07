/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen2_inciso3;
import java.util.Random;
/**
 *
 * @author Daniel
 */
public class Examen2_Inciso3 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR 20212030242");
        
        Random r = new Random();
        
        int arr1 [] = new int[15];
        
        //LLENAR ARR1 CON NUMEROS AL AZAR DE 7-82
        for (int i = 0; i < arr1.length; i++) {
             arr1[i] = r.nextInt(82-7+1)+7;
        }
        
        //INSTANCIAR ARR2 SIN VARIABLES
        int arr2 [] = new int[15];
                
        
        //LLENAR ARR2 TOMANDO EL CONTENIDO DE ARR1
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]%2 == 0) {
                arr2[i] = arr1[i]*10;
            }else{
                arr2[i] = arr1[i]*100;
            }
            
        }
        
        
        System.out.println("\nArreglo 1");
        
        for (int i = 0; i < arr1.length; i++) {
            //IMPRIMIR ARR1
            System.out.println(arr1[i]);
        }
        
        System.out.println("\nArreglo 2");
        
        for (int i = 0; i < arr2.length; i++) {
            //IMPRIMIR ARR2
            System.out.println(arr2[i]);
        }
        
        
    }
}
