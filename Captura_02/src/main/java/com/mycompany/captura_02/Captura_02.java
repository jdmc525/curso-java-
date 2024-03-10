/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.captura_02;

/**
 *
 * @author Daniel
 */

import java.util.Scanner;

public class Captura_02 {

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        
        double a,b,c,d, num, den, result;
        
        System.out.println("Ingrese un valor para a: ");
        a = captura.nextDouble();
        
        System.out.println("Ingrese un valor para b: ");
        b = captura.nextDouble();
        
        System.out.println("Ingrese un valor para c: ");
        c = captura.nextDouble();
        
        System.out.println("Ingrese un valor para d: ");
        d = captura.nextDouble();
        
        num = Math.pow((a-b), 5);
        den = Math.sqrt((c+d));
        
        result = ( Math.PI + (num/den)-5) ;
        
        System.out.println("El resultado es igual a: " + result);
        
        
    }
}


