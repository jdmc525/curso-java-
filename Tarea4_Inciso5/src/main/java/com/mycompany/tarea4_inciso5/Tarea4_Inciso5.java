/*
 * 5) Utilizando una estructura FOR: hacer un programa que escriba la tabla de multiplicar del 1 al 10 
      para cualquier numero entero que se captura, por ejemplo si captura el numero 4 que muestre:
    4 x 1 = 4
    4 x 2 = 8
    4 x 3 = 12
    4 x 4 = 16
    4 x 5 = 20
    4 x 6 = 24
    4 x 7 = 28
    4 x 8 = 32
    4 x 9 = 36
    4 x 10 = 40

 */

package com.mycompany.tarea4_inciso5;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Tarea4_Inciso5 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR \n20212030242\n");
        
        int n;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        n = in.nextInt();
        
        System.out.println("TABLA DE MULTIPLICAR DE " + n);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n*i) );
        }
        
    }
}
