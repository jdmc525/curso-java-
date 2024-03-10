/*
 *9) En una fábrica de computadoras se planea ofrecer a los clientes un descuento que dependerá del número de computadoras que compre. 
Si las computadoras son menos de cinco se les dará un 10% de descuento sobre el total de la compra; si el número de computadoras es mayor 
o igual a cinco pero menos de diez se le otorga un 20% de descuento;
y si son 10 o más se les da un 40% de descuento. El precio de cada computadora es de $11,000.
Preguntar al usuario cuantas computadoras va a comprar e imprimir el valor a pagar.

 */

package com.mycompany.tarea2_inciso9;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Tarea2_Inciso9 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR \n20212030242");
        
        int cantidad ;
        float precio = 11000, porcentaje = 0, total;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de computadoras a comprar: ");
        cantidad = in.nextInt();
        
        if (cantidad < 5) 
            porcentaje = 0.10f;
        
        if (cantidad >= 5 && cantidad < 10 ) 
            porcentaje = 0.20f;
        
        if (cantidad >= 10  ) 
            porcentaje = 0.40f;
    
        total = cantidad *(precio - (precio * porcentaje));
        
        System.out.println("El total por la compra de " + cantidad + " computadoras es: " + "L. " + (total) );
        
    }
}
