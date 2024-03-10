/*
 * 4) Calcular el factorial de un numero X, usando una estructura while.
* El numero X sera digitado por el usuario al iniciar el programa
* Por ejemplo, el factorial de 5 es 120 (1*2*3*4*5)

 */

package com.mycompany.tarea4_inciso4;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Tarea4_Inciso4 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR \n20212030242\n");
        
        int x, cont = 1 ;
        double  ans=1;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        x = in.nextInt();
        
        do {
            ans*=(cont);
            cont++;
        } while (cont <= x);
   
        System.out.println("El factorial del numero ingresado es: " + ans);    
    }
}
