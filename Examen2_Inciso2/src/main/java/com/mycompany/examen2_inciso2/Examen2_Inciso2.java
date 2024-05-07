/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen2_inciso2;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Examen2_Inciso2 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR 20212030242");
       
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena de texto: ");
        String str1 = in.nextLine();
        
        int contB=0,contC=0,contD=0, contF=0,contS=0;
        
        for (int i = 0; i < str1.length(); i++) {
            
            if (str1.toLowerCase().charAt(i)== 'b' ) {
                contB++;
            }
            if (str1.toLowerCase().charAt(i)== 'c' ) {
                contC++;
            }
            if (str1.toLowerCase().charAt(i)== 'd' ) {
                contD++;
            }
            if (str1.toLowerCase().charAt(i)== 'f' ) {
                contF++;
            }
            if (str1.toLowerCase().charAt(i)== 's' ) {
                contS++;
            }
        }
        
        System.out.println("Cantidad de veces que aparece b: " + contB);
        System.out.println("Cantidad de veces que aparece c: " + contC);
        System.out.println("Cantidad de veces que aparece d: " + contD);
        System.out.println("Cantidad de veces que aparece f: " + contF);
        System.out.println("Cantidad de veces que aparece s: " + contS);
    }
}
