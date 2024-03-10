/*
 * 10) Hacer un programa que lea 3 números y muestre un mensaje indicando si fueron 
ingresados en orden ASCENDENTE (de menor a mayor), ejemplo:
 */

package com.mycompany.tarea2_inciso10;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Tarea2_Inciso10 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR \n20212030242");

        int a, b ,c;
        
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Ingrese un numero ");
        a = in.nextInt();
        
        System.out.println("Ingrese un numero ");
        b = in.nextInt();
        
        System.out.println("Ingrese un numero ");
        c = in.nextInt();
        
        if (a<b && b<c) {
            System.out.println("Los numeros fueron ingresados de forma ASCENDENTE");
        }else{
            System.out.println("Los numeros NO fueron ingresados de forma ASCENDENTE");
        }
        
    }
}
