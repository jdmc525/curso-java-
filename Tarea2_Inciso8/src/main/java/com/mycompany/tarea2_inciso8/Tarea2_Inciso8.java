/*
 * 8) Calcular e imprimir la ganancia que un trabajador recibe en el reparto anual de utilidades si este se le 
asigna como un porcentaje de su salario mensual que depende de su antigüedad en la empresa de acuerdo con la siguiente tabla:
Tiempo					Utilidad
Menos de 1 año				5 % del salario
1 año o más y menos de 2 años		7% del salario
2 años o más y menos de 5 años		10% del salario
5 años o más y menos de 10 años		15% del salario
10 años o más				20% del salario
Preguntar el salario mensual y los años de antigüedad al usuario.

 */

package com.mycompany.tarea2_inciso8;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Tarea2_Inciso8 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR \n20212030242");
        
        int antiguedad ;
        float salario, porcentaje = 0, total;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese la antiguedad del empleado: ");
        antiguedad = in.nextInt();
        
        System.out.println("Ingrese el salario mensual del empleado: ");
        salario = in.nextFloat(); 
         
        if (antiguedad < 1) 
            porcentaje = 0.05f;
        
        if (antiguedad >= 1 && antiguedad < 2 ) 
            porcentaje = 0.07f;
        
        if (antiguedad >= 2 && antiguedad < 5 ) 
            porcentaje = 0.10f;
        
        if (antiguedad >= 5 && antiguedad < 10 ) 
            porcentaje = 0.15f;
        
        if (antiguedad >= 10)
            porcentaje = 0.20f;

        total = salario * porcentaje;
        System.out.println("El bono anual del empleado es: " + "L. " + (total) );
        
    }
}
