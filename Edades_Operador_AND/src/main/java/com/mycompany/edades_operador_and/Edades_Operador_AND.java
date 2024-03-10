/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.edades_operador_and;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Edades_Operador_AND {

    public static void main(String[] args) {
                //ACA SE APLICA "AND" Y TAMBIEN EL HECHO DE QUE NO OCUPAS CORCHETES EN JAVA

        
        Scanner userIn = new Scanner(System.in);
        
        int edad;
        
        System.out.println("Ingrese una edad:  ");
        edad = userIn.nextInt();
        
        if (edad >= 0 && edad <= 17) 
            System.out.println("MENOR DE EDAD");
        
        if (edad >= 18 && edad <=20)
            System.out.println("MAYOR DE EDAD");
        
        if (edad >= 21 && edad <=59)
            System.out.println("ADULTO");
        
        if (edad >= 60)
            System.out.println("TERCERA EDAD");
        
    }
}
