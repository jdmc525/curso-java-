/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resolverbugcapturadedatos;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class ResolverBugCapturaDeDatos {

    public static void main(String[] args) {
        /* BUG RELACIONADO CON LA CAPTURA DE STRING
        Cuando leemos un numero mediante un input stream el buffer de entrada se llena y si queremos leer 
        un string entonces este no tiene suficiente memoria para completar la accion por lo que crashea el 
        programa para resolverlo usaremos lo siguiente:
        
        Solo sucede cuando viene de leer un numero y luego quiere leer un string
        */
        
        
        int a;
        String b;
        Scanner in = new Scanner(System.in);
        
        System.out.println("ingrese un numero ");
        a = in.nextInt();
        
        
        in.nextLine(); //Antes de leer el string forzamos el vaciado del buffer:
        System.out.println("ingrese un numero en letras ");
        b = in.nextLine();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println("FIN  DE PROGRAMA ");
        
        //Tambien se puede crear otro objeto Scanner solo para strings pero no es tan recomendable por el uso de memoria y tal
        
    }
}
