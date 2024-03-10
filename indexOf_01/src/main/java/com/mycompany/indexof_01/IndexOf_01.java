/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.indexof_01;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class IndexOf_01 {

    public static void main(String[] args) {
        //Metodo indexOF
        /*
        Devuelve la posicion de laprimera coincidencia encontrada para un string dentro de otro
        Si se encuentra entonces devuelve un valor >= 0
        de lo contrario devuelve -1
        */
        
        String str = "la casa es verde con rosa";
        
        //la posicion tira un valor entero so se puede almacenar en una variable int
        //buscar verde desde la posicion 0
        int posicion =  str.indexOf("verde", 0);
        System.out.println(posicion);
        
        //buscar verde desde la posicion 13
        System.out.println(str.indexOf("verde", 13)); 
        
        //buscar la desde la posicion 0
        System.out.println(str.indexOf("la", 0)); 
        
        //buscar ro desde 13
        System.out.println(str.indexOf("ro", 13)); 
        
        
        //indexOf es case sensitive
        
        //buscar VERDE desde 0
        System.out.println(str.indexOf("VERDE", 0)); 
        
        //buscar VERDE desde 0 ignorando mayusculas
        System.out.println(str.toUpperCase().indexOf("VERDE", 0));
        
        
        System.out.println("");
        
         /*Hacer programa donde se le pregunte al usuario que color desea buscar en colores
        El programa imprimira cuantas veces fue encontrado dicho color. */
        
        String colores = " rojo amarillo rojo verde azUl ROJO aMaRillO Verde azul rosa";
        System.out.println("colores: " + colores);
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese el color que quiere encontrar: ");
        String srch = in.nextLine();
        
        int contC = 0;
        int i = 0;
        
      while (colores.toLowerCase().indexOf(srch.toLowerCase() , i) != -1) {
            i+=colores.toLowerCase().indexOf(srch.toLowerCase() , i) + 1;
            contC++;
       }
      
        System.out.println("El color " + srch + " fue encontrado " + contC + " veces");
        
        
    }
}
