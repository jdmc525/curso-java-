/*
 * 6) Escriba un programa que lea dos enteros, imprima si el primero es un múltiplo del segundo. 
 */

package com.mycompany.tarea2_inciso6;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Tarea2_Inciso6 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR \n20212030242");

        
        int a, b;
        Scanner in = new Scanner(System.in);
        
            System.out.println("Ingrese un numero entero");
            a = in.nextInt();
            
            System.out.println("Ingrese un numero entero");
            b = in.nextInt();
        
            if (a%b == 0) {
                System.out.println(a + " es multiplo de " + b);
            }else{
                System.out.println(a + " no es multiplo de " + b);
            }
                
        
    }
}
