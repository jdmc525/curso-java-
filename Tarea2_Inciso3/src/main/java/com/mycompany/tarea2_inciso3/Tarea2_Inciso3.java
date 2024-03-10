
/*
3) Escriba un programa que reciba tres enteros del usuario y muestre la suma, promedio, producto, menor y
mayor de esos números.
 */

package com.mycompany.tarea2_inciso3;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Tarea2_Inciso3 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR \n20212030242");
        
        int a, suma = 0, producto= 1, mayor = Integer.MIN_VALUE , menor = Integer.MAX_VALUE;
        
        Scanner userIn = new Scanner(System.in);
        
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un numero: ");
            a = userIn.nextInt();

            if (a>mayor) {
                mayor =a;
            } 
            
            if (a<menor) {
                menor =a;
            }
            
            //SUMA
            suma +=a;
            
            //PRODUCTO
            producto = producto*a;
            
        }
        
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " +  ((suma)/3));
        System.out.println("Producto: " + producto);
        
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
}
