/*
 * PRACTICAS WHILE / DO-WHILE
 */

package com.mycompany.ciclo_while_dowhile;
import java.util.Scanner;
/*
 * @author Daniel
 */

public class Ciclo_While_DoWhile {

    public static void main(String[] args) {
        
        // 1)Imprimir del 1-10 de 1 en 1 WHILE
        int a=1;
        while (a<=10 ) {
            System.out.println(a);
            a++;
        }
   
        System.out.println("\n**********\n");
        
        // 1)Imprimir del 1-10 de 1 en 1 DO-WHILE
        
        int b=1;
        do{   
            System.out.println(b);
            b++;
        }while (b<=10);
        
        System.out.println("\n**********\n");
        
        
        // 1)Imprimir del 1-20 de 2 en 2 WHILE
        int c=0;

        while (c<=20 ) {
            System.out.println(c);
            c+=2;
        }
   
        
        System.out.println("\n**********\n");
        
        //Preguntar valores de forma indefenida e imprimir el resultado de la suma de esos numeros
        //El programa termina si ingresan un numero negativo.
        
        Scanner in = new Scanner(System.in);
        int d=0 ,total=0;
        
        while(d >=0){
            total+=d;
            
            System.out.println("Ingrese un numero");
            d = in.nextInt();
        }   
        
        System.out.println("La suma de los numeros ingresados anteriormente es: " + total);
        
        
        
    }
}
