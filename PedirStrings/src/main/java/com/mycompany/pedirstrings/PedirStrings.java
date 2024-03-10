/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pedirstrings;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class PedirStrings {

    public static void main(String[] args) {
        //Captura de Strings desde la consola 

        Scanner in = new Scanner(System.in);
        String str1;
        
        System.out.println("Digitar un string: ");
        str1 = in.nextLine();
        
        //Tambien se puede usar como str1 = in.next();  pero eso trunca el insert del usuario tipo si pones "Hola Mundo" solo devuelve "Hola"
        
        System.out.println("El string es: " + str1);
        
        /*DEL STRING LEIDO: IMPRIMIR EL TAMAÑO, SU VERSION EN 
        MAYUSCULAS Y MINUSCULAS, VERSION APLICANDO TRIM , TAMAÑO DEL STRING APLICANDO TRIM
       
        */
        
        System.out.println("Tamaño: " + str1.length());
        System.out.println("Mayusculas: " + str1.toUpperCase());
        System.out.println("Minusculas: " + str1.toLowerCase());
        System.out.println("Version aplicando trim: " + str1.trim());
        System.out.println("Tamaño aplicando trim: " + str1.trim().length() );
        
        
        /* Finalmente  unacopia del string pero reemplazando caracteres A por numeros 4 ignorando 
        mayusuclas/minusculas sin usar replace*/
        
        String str1_1 = "";
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i)== 'a' || str1.charAt(i)== 'A') {
                str1_1 += '4';
            }else{
                str1_1 += str1.charAt(i);
            }   
        }
        
        System.out.println("Copia de str1: " + str1_1);
        
        
        
        
    }
}
