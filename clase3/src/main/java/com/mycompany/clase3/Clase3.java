/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase3;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Clase3 {

    public static void main(String[] args) {
         Scanner leer= new Scanner(System.in);
        double a,b,c,d; 
        System.out.println("Digitar el valor de a: ");
        a=leer.nextDouble();
        System.out.println("Digitar el valor de b: ");
        b=leer.nextDouble();
        System.out.println("Digitar el valor de c: ");
        c=leer.nextDouble();
        System.out.println("Digitar el valor de d: ");
        d=leer.nextDouble();
        double num,dem,res;
        num= Math.pow(a-b,5);
        dem= Math.sqrt(c+d);
        res= Math.PI+(num/dem)-5;
        System.out.println("El resultado final es: " + res);

    }
}
