/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.and_y_or;

import java.util.Scanner;

/**
 *
 * @author Daniel
 * 
 * Una tienda da un descuento del 10% a personas
cuya edad este entre 18 y 21 o entre 35 y 59.
Preguntar al usuario la edad y el monto de la venta.
Imprimir lo que tiene que pagar y el monto del
descuento otorgado.
Obligatorio realizarlo utilizando los operadores AND OR
 */
public class AND_y_OR {

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        int edad;
        float monto, descuento = 0;
        System.out.println("Ingrese la edad del cliente: ");
        edad = userIn.nextInt();
        
        System.out.println("Ingrese el monto de la venta: ");
        monto = userIn.nextFloat();
        
        /*Aca no es tan necesario parentesis porque los AND se ejecutan antes que el OR pero no afecta*/
        if ((edad >= 18 && edad <=21) || edad >= 35 && edad<=59) 
            descuento = monto * 0.1f;
        
        System.out.println("El monto del descuento otorgado es: " + "L. " + descuento);
        System.out.println("El total a pagar es: " + "L. "+ (monto - descuento) );
        
        
    }
}

