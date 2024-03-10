/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.captura_de_datos_01;

/**
 *
 * @author Daniel
 */



        
        /*----------CAPTURA DE DATOS--------
        Scanner - este usaremos
        Streambuffer - este es otro que se puede usar
        */

//Aca se importan las clases dentro de libreria o una libreria entera

import java.util.Scanner;  // Aca se manda a llamar el scanner

//Cada vez que se instancia esta clase se crea un ibjeto

public class Captura_de_datos_01 {

    public static void main(String[] args) {
       
        //Instanciar objeto de clase SCANNER:
        
        Scanner leer = new Scanner(System.in);  //System.in para meter datospor consola
        
     /*Variable tipo "SCANNER" se llama "leer" y es igual a un nuevo objeto Scanner() 
        dentro de ese parentesis si le das ctrl + space salen todos los comanods que pueden haber
        */
     int a,b;  
        System.out.print("Digitar el valor de a: ");
        a = leer.nextInt() ; //nextInt para agarrar enteros, luego nextLine para strings y lo demas si es lo obvio
        
        System.out.print("Digitar el valor de b: ");
        b = leer.nextInt() ; //se puede reutilizar el objeto leer las veces que se quiera en el codigo
  
        System.out.println("La suma es igual a: " +(a+b));
    }
}
