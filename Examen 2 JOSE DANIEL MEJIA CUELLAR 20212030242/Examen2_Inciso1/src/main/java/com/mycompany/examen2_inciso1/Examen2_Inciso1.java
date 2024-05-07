/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen2_inciso1;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Examen2_Inciso1 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR 20212030242");
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena de texto: ");
        String str1 = in.nextLine();
        
        if (str1.equals(str1.toUpperCase())) {
            System.out.println("La cadena de texto fue escrita en Mayusculas");
        }else{
            System.out.println("La cadena de texto NO fue escrita en Mayusculas");
        }
        
    }
}
