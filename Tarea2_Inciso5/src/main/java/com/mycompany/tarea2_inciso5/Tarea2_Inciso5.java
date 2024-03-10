/*
Escriba un programa que lea un entero e imprima si es impar o par. 
 */

package com.mycompany.tarea2_inciso5;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Tarea2_Inciso5 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR \n20212030242");
       
        int a;
        Scanner userIn = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero: ");
        a = userIn.nextInt();

        if (a%2 == 0) {
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
        
    }
}
