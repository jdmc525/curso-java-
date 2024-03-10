/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salariomensual;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class SalarioMensual {

    public static void main(String[] args) {
        float salario, bono = 0, antiguedad;
        
        Scanner userIn = new Scanner(System.in);
        
        System.out.println("Introduzca el salario mensual del empleado: ");
        salario = userIn.nextFloat();
        
        System.out.println("Introduzca la antiguedad del empleado: ");
        antiguedad = userIn.nextFloat();
        
        
        if (antiguedad < 5) 
            bono = salario * 0.1f;
        
        if (antiguedad >= 5 && antiguedad < 10 ) 
            bono = salario * 0.15f;
        
        if (antiguedad >= 10 && antiguedad < 20 ) 
            bono = salario * 0.20f;
        
        if (antiguedad >= 20) 
            bono = salario * 0.25f;
        
        
        System.out.println("El bono anual del empleado es: " + "L. " + bono  );
        
        
        /*---OTRA FORMA---*/
        //Hacer que lo que varie sea el porcentaje para hacer un solo calculo
        float porcentaje = 0;
        
        if (antiguedad < 5) 
            porcentaje = 0.10f;
         if (antiguedad >= 5 && antiguedad < 10 ) 
            porcentaje = 0.15f;
        
        if (antiguedad >= 10 && antiguedad < 20 ) 
            porcentaje = 0.20f;
        
        if (antiguedad >= 20)
            porcentaje = 0.25f;

        System.out.println("El bono anual del empleado es: " + "L. " + (salario * porcentaje) );
        
    }
}
