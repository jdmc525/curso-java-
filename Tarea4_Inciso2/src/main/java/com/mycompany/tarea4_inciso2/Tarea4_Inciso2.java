/*
 * 2) Haga un programa que muestre todos los numeros pares hasta llegar al numero X.
* El numero X sera digitado por el usuario al iniciar el programa, realice el programa utilizando una estructura WHILE.
 */

package com.mycompany.tarea4_inciso2;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Tarea4_Inciso2 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR \n20212030242\n");
        
        int x , ref =0;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        x = in.nextInt();
        
        while (ref<x) {
            System.out.println(ref);
            ref+=2;
        }
    }
}
