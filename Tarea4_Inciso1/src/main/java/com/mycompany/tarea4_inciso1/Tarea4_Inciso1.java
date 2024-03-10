/*
1) Utilizando una estructura FOR y la menor cantidad de instrucciones posible escriba un programa que muestre un patrón de 8x8 asteriscos como se muestra a continuación:
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *

*/
package com.mycompany.tarea4_inciso1;

/**
 *
 * @author Daniel
 */
public class Tarea4_Inciso1 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR \n20212030242\n");
        
        for (int i = 0; i < 8; i++){ 
            
            for (int j = 0; j < 8; j++){
                System.out.print("* ");
            }
             
            System.out.println();
        
        }
        
    }
}
