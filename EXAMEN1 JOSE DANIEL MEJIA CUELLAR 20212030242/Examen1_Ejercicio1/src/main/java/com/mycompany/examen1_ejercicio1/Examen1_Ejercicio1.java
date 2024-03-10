/*
 * EJERCICIO 1
 */

package com.mycompany.examen1_ejercicio1;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Examen1_Ejercicio1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, ans=1;
        
        System.out.println("Digite un numero entero: ");
        num = in.nextInt();
        
        
        for (int i = 1; i <= num; i++) {
            ans*=i;
        }
        
        System.out.println("La factorial de " + num + " es: " + ans );
        
    }
}
