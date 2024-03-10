/*
 * 11) pedir al usuario un numero entero, luego imprimir una linea horizontal de asteriscos 
 *   que tenga tantos asteriscos como el numero digitado por el usuario.
 */

package com.mycompany.numeroenteroimprimirasteriscos;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class NumeroEnteroImprimirAsteriscos {

    public static void main(String[] args) {
        
        int a, ancho , alto;
        Scanner userIn = new Scanner(System.in);
        
        
        System.out.println("Ingrese un numero entero: ");
        a = userIn.nextInt();
    
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        
        System.out.println("\n\n");
        
        System.out.println("Ingrese un alto: ");
        alto = userIn.nextInt();
        
        
        System.out.println("Ingrese un ancho: ");
        ancho = userIn.nextInt();
        
        
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("*");
            }
            System.out.println("");
            
        }
        
        
    }
}
