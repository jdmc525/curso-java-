/*
 4. Escriba un programa que lea cinco enteros y que determine e imprima los enteros mayor y menor. 

 */

package com.mycompany.tarea2_inciso4;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Tarea2_Inciso4 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR\n 20212030242");
        
        int a, mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        
        Scanner userIn = new Scanner(System.in);
        
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero: ");
            a = userIn.nextInt();
            
            if (a >mayor) {
                mayor = a;
            }
            
            if(a < menor){
                menor = a;
            }            
        }
        
        System.out.println("Mayor numero: " + mayor);
        System.out.println("Menor numero: " + menor);
        
    }
}
