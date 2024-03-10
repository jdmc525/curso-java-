/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_clase3;

import java.util.Scanner;

/**
 * 
 * @author Daniel
 * 
 */

public class Ejercicio_Clase3 {
    
    public static void main(String[] args) {
        Scanner montoIn = new Scanner(System.in);
        double monto,discount,total;
        System.out.print("Ingrese el valor del monto vendido: ");
        monto = montoIn.nextDouble();
        
        if (monto > 10000) {  //En Java no es tan necesario lo de loscorchetes asi que no deberia dar error sin eso
            discount = monto * 0.2;
            total = monto - discount;
        }else{
            discount = 0;
            total = monto;
        }
        
        System.out.println("\n\nMonto Vendido: " + monto);
        System.out.println("Descuento: " + discount);
        System.out.println("Valor a pagar: " + total);
        
        /*Recordar que para lo de float, se pone numerof para que no de error*/
        
    }
}
