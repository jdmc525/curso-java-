/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mayorde4numeros;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Mayorde4Numeros {

    public static void main(String[] args) {
        
        int a,b,c,d, res2 ;
        
        Scanner userIn = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        a = userIn.nextInt();
        
        System.out.println("Ingrese un numero: ");
        b = userIn.nextInt();
        
        System.out.println("Ingrese un numero: ");
        c = userIn.nextInt();
        
        System.out.println("Ingrese un numero: ");
        d = userIn.nextInt();
        
        
        if (a >= b && a>=c && a>=d) {
            System.out.println("El mayor numero es: " + a);
        }
        
        
        if (b >= a && b>=c && b>=d) {
            System.out.println("El mayor numero es: " + b);
        }
        
        
        if (c >= b && c>=a && c>=d) {
            System.out.println("El mayor numero es: " + c);
        }
        
        
        if (d >= b && d>=c && d>=a) {
            System.out.println("El mayor numero es: " + d);
        }
        
        if (a==b && b==c && c==d) {
            System.out.println("LOS NUMEROS SON IGUALES");
        }
        
        
        /*-----MATH.MAX-----*/
        /*Esto seria lo mas facil para obtener lo mismo ademas deja hacer que se repitan varios*/
         res2 =  Math.max(d, Math.max(c, Math.max(a, b)));  
         System.out.println("\n"+ res2);
    }
}
