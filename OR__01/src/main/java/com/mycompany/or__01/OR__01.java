/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.or__01;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class OR__01 {

    public static void main(String[] args) {
        int mes, anio;
        
        Scanner userIn = new Scanner(System.in);
        
        System.out.println("Ingrese numerode de mes (1-12): ");
        mes = userIn.nextInt();
        
        
        System.out.println("Ingrese el año: ");
        anio = userIn.nextInt();
        
        if (mes >=1 && mes <=12) {
            
            if (mes ==1 || mes ==3 || mes ==5 || mes ==7 || mes ==8 || mes ==10 || mes ==12 ) {
                System.out.println("El mes tiene 31 dias");
            
            }else if (anio%4 == 0 && mes == 2 ) {
                    System.out.println("El mes tiene 29 dias");
                }else if(mes == 2){
                    System.out.println("El mes tiene 28 dias");
                }
           
            
            
            else{
                System.out.println("El mes tiene 30 dias");
            }
                    
        }else{
            System.out.println("El mes no es valido");
        }
        
        

    }
}
