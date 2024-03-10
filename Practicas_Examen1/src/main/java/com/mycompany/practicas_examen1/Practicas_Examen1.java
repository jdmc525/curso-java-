/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicas_examen1;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Daniel
 */
public class Practicas_Examen1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //PEDIR NUMEROS DE FORMA INDEFINIDA Y MOSTRAR EN PANTALLA CUAL ES EL MAYOR  Y MENOR sacar factorial de ambos
        float num, mayor = Float.MIN_VALUE, menor = Float.MAX_VALUE, fact =1;
        
        do {
        System.out.println("Ingrese un numero");
        num = in.nextFloat();
            if (num >mayor)  mayor = num;
            
            if (num <menor && num>0)  menor = num;
        } while (num>0);
        
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        
        for (int i = 1; i <= mayor; i++) {
            fact*=i;
        }
        System.out.println("El factorial de " + mayor + " es: " + fact);
        
        fact = 1;
        for (int i = 1; i <= menor; i++) {
            fact*=i;
        }
        System.out.println("El factorial de " + menor + " es: " + fact);
        
        
        System.out.println("\n***********************\n");
        
        //CON NUMEROS RANDOM MOSTRAR EN PANTALLA CUANTOS SON MULTIPLOS DE 3, DEBEN SER 10 NUMEROS DEL -5 AL  53 y sacar factoriald e esos numeros
        
        int contRand=0;
        Random r = new Random();
        
        for (int i = 0; i < 10; i++) {
            int numRand = r.nextInt(53-(-5)+1)-5;
            System.out.println(numRand);
            if (numRand%3==0) {
                contRand++;
                
                
            }
        }
        
        System.out.println("La cantidad de numeros divisibles entre 3 es: " + contRand);
        
        
                System.out.println("\n***********************\n");

        //Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello.
        
        System.out.println("Ingrese el numero de dia de la semana");
        int dia = in.nextInt();
        
        switch (dia) {
            case 1: case 2: case 3: case 4: case 5: 
                System.out.println("Dia de chambear");
                
                break;
            case 6,7:
                System.out.println("Dia de chill");
            default:
                System.out.println("Eso no es un dia");
        }
        
               System.out.println("\n***********************\n");
               
               
          //FACTORIALES
          
          
          
        
    }
}
