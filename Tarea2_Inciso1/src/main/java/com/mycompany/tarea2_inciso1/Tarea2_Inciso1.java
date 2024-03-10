
/*1) Escriba un programa que pida al usuario que escriba dos enteros, que obtenga los números del usuario y
muestre el número más grande, seguido de las palabras "es más grande". Si los números son iguales, imprima el
mensaje "Estos números son iguales".*/

package com.mycompany.tarea2_inciso1;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Tarea2_Inciso1 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR \n20212030242");
        
        int a,b;
        
        Scanner userIn = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero: ");
        a = userIn.nextInt();
        
        
        System.out.println("Ingrese un numero entero: ");
        b = userIn.nextInt();
        
        if (a < b) {
            System.out.println(b + " es más grande");
        }else if(a>b){
            System.out.println(a + " es más grande");
        }else{
            System.out.println("Estos números son iguales");
        }
        
    }
}
