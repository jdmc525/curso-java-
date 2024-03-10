/*
 * EJERCICIO 2 
 */

package com.mycompany.examen1_ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Examen1_Ejercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float precios, subtotal=0, recargo=0;
        
        do {
            System.out.println("Digite el precio del producto: ");
             precios = in.nextFloat();
             
             if (precios>0) {
                subtotal+=precios;
            }
        
        } while (precios >0);
   
        
        if (subtotal > 0 && subtotal<10000) {
            recargo = 0.10f;
        }
        if (subtotal >= 10000 && subtotal<25000) {
            recargo = 0.15f;
        }
        if (subtotal >= 25000 ) {
            recargo = 0.20f;
        }
        
        
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Valor del recargo: " + (subtotal*recargo));
        System.out.println("Valor que debe pagar el cliente: " + (subtotal + (subtotal*recargo)));
        
    }
}
