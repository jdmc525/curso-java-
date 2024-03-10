/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primerpractica; /*Esto es para indicarle donde esta la fuente del codigo*/


/**
 *
 * @author Daniel
 */
public class PrimerPractica {

    /*Las clases tienen atributos y metodos, osea son plantillas para crear objetos; las clases siempre van en mayusculas*/

    
    
    public static void main(String[] args) {  //Aca esto es un metodo dentro de una clase
        
        /*
        PUBLIC, porque es publico y todo el proyecto tiene acceso a eso
        STATIC, porque solo puede existir una vez (https://es.wikipedia.org/wiki/Singleton)
        VOID, porque no retorna nada (de lo contrario diria abajo "return algo")
        
        STRING[], por ahi se van los comandos o algo asi la coa es que debe ir, es un argumento de linea de comando
        */
        
        /*
        A diferencia de en C++ esta movida no es entera entonces por eso no es necesario que retorne algo
        */
    
        System.out.println("Hola UNAH!");
        System.out.println("Ingenieria en Sistemas");
        System.out.print("Me llamo Daniel, ");
        System.out.print("vivo en SPS \nMe gustan las baleadas");
        System.out.println("\n\n\n\n\n\n");
        System.out.println("Pera\tManzana\tUva\t\tSandia");
        /*
        SYSTEM, hace referencia al SO
        OUT, referencia la consola (cmd)
        println, lo de imprimir linea con salto de linea
        
        atajos: 
        para la linea anterior: sout + tecla Tab
        sw para switch
        wh para bucle while
        for para for 
        if para if
        y asi
        */
        
        
                System.out.println("\n\n\n\n");

        /*Datos primitivos*/
        int a;
        
        int entero1 = 8, entero2, entero3 = 33;  //Se pueden declarar asi en un solo renglon
        
        float fl1 = 4.9f, fl2 = 18.18f, fl3 = 1; //HAY QUE PONER "f" despues del float cuando es decimal para que sirva
                                        //Si es entero no importa
        boolean c;
        double d1 = 3.14159265, d2 = 9.8;
        char e;
        
        
        System.out.println("El valor del primer entero es: " + entero1);
        System.out.println("El valor del fl1 es: " + fl1);
        
//System.out.println("El valor del entero2 es: " + entero2);  NO SE PUEDE IMPRIMIR UNA VARIABLE NO INICIALIZADA (entero2)

        System.out.println("La suma de d1 y d2 es: " + (d1 + d2)); 
        System.out.println("La suma de "+ fl1+ " mas " + fl2 + " es: " + (fl1 + fl2)); 

        
        //Cosas de Mate
        
        //----PI----
        System.out.println("El valor de Pi es: " + (Math.PI));  //Math. algo es para cosas de mate  
    
        //---Potencias---
        double dx = 8;
        System.out.println( dx + " elevado a la quinta potencia es: " + Math.pow(dx, 5));
    
        
        //---REDONDEAR---
        
        double dd1 = 3.234, dd2 = 2.5678, dd3 = 4.5;
        
        System.out.println("Redondear "+ dd1 + " es " + Math.round(dd1));
        System.out.println("Redondear "+ dd2 + " es " + Math.round(dd2));
        System.out.println("Redondear "+ dd3 + " es " + Math.round(dd3));
        
        //---RAIZ CUADRADA---
        double dd4 = 25;
        System.out.println("La raiz cuadrada de " + dd4 + " es " + Math.sqrt(dd4));
        
        //---RAIZ CUBICA---
        double dd5= 125;
        System.out.println("La raiz cubica de " + dd5 + " es " + Math.round(Math.pow(dd5,(1.0/3.0))));
    
    
        
    
    
    
    
    
    
    }

}


/*Un objeto es una instancia de una clase, al crearse tiene una direccion en la memoria RAM*/

/*Todo (menos js) lo basado en c++ es fuertemente tipado(no podes usar una variable no declarada) y 
explicito(lo de las mayusculas y minisculas)*/



/*\r\nreplace with , en alguna movida de notepad es como que te lo pasa de columnas a lineas*/