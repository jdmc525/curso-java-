
/*
2) Escriba un programa que pida al usuario que escriba dos números, que obtenga los números del usuario e
imprima la suma, producto, diferencia y cociente (división) de los números.
*/

package com.mycompany.tarea2_inciso2;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Tarea2_Inciso2 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR \n20212030242");
        
        float a , b;
        
        Scanner userIn = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        a = userIn.nextFloat();
        
        System.out.println("Ingrese un numero: ");
        b = userIn.nextFloat();
        
        System.out.println("Suma: " + (a+b));
        System.out.println("Producto: " + (a*b));
        System.out.println("Diferencia: " + (a-b));
        System.out.println("Cociente: " + (a/b));
        
        
    }
}
