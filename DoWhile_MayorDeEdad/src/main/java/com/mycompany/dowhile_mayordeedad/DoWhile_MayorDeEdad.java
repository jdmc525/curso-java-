/*
 * Hacer un programa que lea N cantidad de edades de personas.
        -> el programa terminará cuando la edad digitada por el usuario sea
           menor que cero.
        -> al terminar el programa mostrar cuantas edades se leyeron por cada
           grupo de edad segun la tabla siguiente:
           GRUPO DE EDAD	DESCRIPCION
           Menores de edad	De 0 a menos de 18 años
           Mayores de edad	De 18 a menos de 21 años
           Adultos		De 21 a menos de 60 años
           Tercera edad         De 60 en delante
 */

package com.mycompany.dowhile_mayordeedad;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DoWhile_MayorDeEdad {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edad = 0, ninio=0, joven=0, adulto=0, terceraEdad=0;
        
        while (edad>=0) {
            
            System.out.println("Ingrese la edad: ");
            edad = in.nextInt();
        
            if (edad >=0 && edad<18) {
                ninio++;
            }else if(edad >=18 && edad<21){
                joven++;
            }else if(edad >=21 && edad<60){
                adulto++;
            }else if(edad >=60){
                terceraEdad++;
            }
        }
        System.out.println("Niños: " + ninio);
        System.out.println("Jovenes: " + joven);
        System.out.println("Adultos: " + adulto);
        System.out.println("Tercera Edad: " + terceraEdad);
    }
}
