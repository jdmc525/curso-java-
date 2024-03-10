/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchito_java;

import java.util.Random; //Clase para generar numeros random

/**
 *
 * @author Daniel
 */
public class Switchito_JAVA {

    public static void main(String[] args) {
        Random r = new Random(); // No ocupa parametros
        
        int nAzar = r.nextInt(5-2+1)+2;  //(maximo numero - minimo numero +1) + minimo numero
        
        System.out.println(nAzar);
        
        
        switch (nAzar) {
            case 2:
                System.out.println("Rojo");
                break;
            case 3:
                System.out.println("Verde");
                break;
            case 4:
                System.out.println("Azul");
                break;
            case 5:
                System.out.println("Amarillo");
                break;
            default:
                System.out.println("Numero desconocido");
        }
        
        
    }
}
