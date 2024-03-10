/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dowhile_detal;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class DoWhile_Detal {

    public static void main(String[] args) {
   //MISMO EJERCICIO DE PEDIR NUMEROS INFINITOS HASTA INGRESAR UN NEGATIVO PERO CON DO-WHILE     
        int a, total=0;
        Scanner in = new Scanner(System.in);
        
        do {

            System.out.println("Digitar un numero positivo: ");
            a = in.nextInt();
                if (a<0) {
                    break;
                }else{
                   total+=a;
                }
        
        } while (a>=0);
        
        System.out.println(total);
    
    }
    
}
