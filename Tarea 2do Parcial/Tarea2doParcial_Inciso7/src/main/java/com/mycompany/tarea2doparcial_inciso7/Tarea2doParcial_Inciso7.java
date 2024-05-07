/*
 7) Leer una cadena de texto de varias palabras y mostrarla de forma invertida, palabra por palabra, Ejemplo:
Ingresar texto: Texto de Ejemplo
Texto invertido:
Ejemplo de Texto
    
 */

package com.mycompany.tarea2doparcial_inciso7;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Tarea2doParcial_Inciso7 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR 20212030242");

        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite una frase: ");
        String str1 = in.nextLine();
        
        String arr1[] = str1.split(" ");
        
        System.out.println(arr1.length);
        for (int i = arr1.length; i > 0; i--) {
            System.out.print(arr1[i-1] + " " ) ;
        }
        
        
    }
}
