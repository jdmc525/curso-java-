/*
 *4) Hacer un programa que capture una cadena de texto y que muestre cuantas palabras tiene dicha cadena de texto.
 */

package com.mycompany.tarea2doparcial_inciso4;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Tarea2doParcial_Inciso4 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR 20212030242\n");
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese texto: ");
        String str = in.nextLine();
        
        
        String arr1[] = str.split(" ");        
        System.out.println("Numero de palabras: " + arr1.length);
        
        
    }
}
