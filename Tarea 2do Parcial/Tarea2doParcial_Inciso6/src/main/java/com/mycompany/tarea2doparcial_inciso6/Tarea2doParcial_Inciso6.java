/*
6) Leer una cadena de texto y luego mostrarla al revés, caracter por caracter. Ejemplo:
Ingresar texto: Texto de Ejemplo
Texto al reves:
olpmejE ed otxeT

 */

package com.mycompany.tarea2doparcial_inciso6;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Tarea2doParcial_Inciso6 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR 20212030242");
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        String str1 = in.nextLine();
        
        String str2 = "";
        
        for (int i = str1.length(); i > 0 ; i--) {
            str2 += str1.charAt(i-1);
        }
        
        System.out.println("Cadena de texto al reves: " + str2);
        
    }
}
