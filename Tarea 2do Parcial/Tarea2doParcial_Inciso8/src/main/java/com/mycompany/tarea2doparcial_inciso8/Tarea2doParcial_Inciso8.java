/*
 8) Hacer un programa que permita incrustar una cadena de texto dentro de otra en la posicion deseada generando una nueva cadena de texto y luego mostrarla al usuario; por ejemplo:

Ingresar cadena de texto: Bienvenido a la UNAH-VS
Ingresar texto a incrustar: Estudiante
Ingresar posicion donde desea colocar el texto: 11
La nueva cadena es:
Bienvenido Estudiantea la UNAH-VS

 */

package com.mycompany.tarea2doparcial_inciso8;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Tarea2doParcial_Inciso8 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR 20212030242");
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingresar cadena de texto: ");
        String strUser= in.nextLine();
        
        System.out.println("Ingresar texto a incrustar: ");
        String incrustar = in.nextLine();
        
        System.out.println("Ingresar posicion donde desea colocar el texto: ");
        int posicion = in.nextInt();
        
        String strNuevo = "";
        
        System.out.println(strUser.length());
        
        for (int i = 0; i < strUser.length(); i++) {
            if ( i == posicion) {
                strNuevo += incrustar + " ";
                strNuevo += strUser.charAt(i);
            } else {    
                strNuevo += strUser.charAt(i);
            }            
        }
        
        System.out.println(strNuevo);

    }
}
