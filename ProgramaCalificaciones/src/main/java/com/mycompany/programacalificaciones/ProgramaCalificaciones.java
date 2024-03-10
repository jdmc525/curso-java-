/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacalificaciones;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ProgramaCalificaciones {

    public static void main(String[] args) {
        double scr1 , scr2 ,scr3, promedio ;
        
        Scanner scoreIn = new Scanner(System.in);
        
        System.out.println("Ingese la primera calificacion: ");
        scr1 = scoreIn.nextDouble();
        
        
        System.out.println("Ingese la segunda calificacion: ");
        scr2 = scoreIn.nextDouble();
        
        System.out.println("Ingese la tercera calificacion: ");
        scr3= scoreIn.nextDouble();
        
        promedio = Math.round( (scr1 + scr2 + scr3)/3 );
        
        System.out.println("El promedio es igual a: " + promedio);
        
        if (promedio < 65){
            System.out.println("REPROBADO");
        }else{
            System.out.println("APROBADO");
        }
    }
}
