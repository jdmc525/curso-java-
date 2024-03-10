/*
 * 3) digitar N cantidad de numeros, hacer un programa que:
    a) Muestre cuántos números leídos fueron mayores o iguales que 70
    b) Muestre el promedio de todos los números. (Ignorar los negativos)
 * La digitación de numeros termina con algun valor negativo.  
 */

package com.mycompany.tarea4_inciso3;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Tarea4_Inciso3 {

    public static void main(String[] args) {
        
        System.out.println("JOSE DANIEL MEJIA CUELLAR \n20212030242\n");
        
        int contadorM =0, n=0, contadorP=-1, suma=0;
        Scanner in = new Scanner(System.in);
        
        while (n>=0) {
            
            System.out.println("Ingrese un numero: ");
            n = in.nextInt();
            
            if (n >=70) {
                contadorM++;
            }
            if (n>=0) {
                suma+=n;
            }
            
            contadorP++;
        }
        
        System.out.println("El promedio es: " + (suma/contadorP));
        System.out.println("La cantidad de numeros mayores o iguales a 70 es de: " + contadorM);
                
    }
}
