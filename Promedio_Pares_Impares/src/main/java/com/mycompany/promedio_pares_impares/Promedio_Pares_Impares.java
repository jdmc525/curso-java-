/*
 * 10) Hacer un programa que pida 10 numeros, al finalizar mostrar el promedio de los numeros, 
 * asi como el conteo de cuantos numeros pares fueron leidos y cuantos numeros impares fueron leidos 
 *  ademas de imprimir cual fue el numero mayor y el numero menor leido.
 */

package com.mycompany.promedio_pares_impares;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Promedio_Pares_Impares {

    public static void main(String[] args) {
          Scanner userIn = new Scanner(System.in);
          
        //Aca es lo mismo pero optimizado y con el menor
        
        int num, mayor= Integer.MIN_VALUE ,menor = Integer.MAX_VALUE, suma=0, contadorP = 0, contadorI = 0;  

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            num = userIn.nextInt();
            
            //ENCONTRAR NUMERO MAYOR
            if (num >mayor) {
                mayor = num;    
            }
            
            if (num < menor) {
                menor = num;
            }
            
            //CONTADOR DE PARES E IMPARES
            if ((num%2 == 0)) {
                contadorP++;
            }else{
                contadorI++;
            }
            
            //SUMA DE ENTRADAS
            suma += num;
            
        }
        
        System.out.println("El promedio es: " + (suma/10));
        System.out.println("El numero de numeros pares es: " + contadorP);
        System.out.println("El numero de numeros impares es: " + contadorI);
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        
    }
}
