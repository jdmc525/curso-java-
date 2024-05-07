/*
5) Hacer un programa que pida digitar el nombre completo de una persona en una sola cadena de texto 
y que muestre cuales son las letras iniciales del nombre de dicha persona, ejemplo:
Su nombre: Gerardo Josue Portillo
Sus iniciales son: GJP
 */

package com.mycompany.tarea2doparcial_inciso5;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Tarea2doParcial_Inciso5 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR 20212030242");
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String strUser = in.nextLine();
        
        String arr1[] = strUser.split(" ");
        
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i].substring(0,1));
        }
        
    }   
}
