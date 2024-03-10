/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.replace_01;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Replace_01 {

    public static void main(String[] args) {
        //METODO REPLACE
    /*Devuelve un string al cual le ha aplicado el reemplazo de un String por otro
      No ignora mayusculas/minuculas, es decir que es case sensitive
        */    
        
        String str = "Verde es la Uva, la uva es Verde";
        
        System.out.println("Cadena original: " + str);
        
        //Reemplazar Verde por Roja sin alterar la cadena original
        
        System.out.println(str.replace("Verde", "Roja"));
        
        //str.replace(lo que buscamos, lo que queremos reemplazaar)
        //OJO esto solo devuelve pero no altera la variable
        
        System.out.println("Cadena original: " + str);
        
        //Reemplazar verde por roja pero sobreescribiendo la variable original
        str = str.replace("Verde","Roja");
        System.out.println("Cadena alterada: " + str);
        
        
        //Reemplazar uva por fresa
        str = str.replace("uva", "fresa");
        System.out.println("Cadena alterada fresa: " + str);
        //OJO es case sensitive asi que solo se altero "uva" y no "Uva"
        
        //Reemplazar Roja por Verde alterando la cadena original ignorando mayusculas y minusculas
        str = str.toUpperCase().replace("ROJA", "VERDE");
        //OJO esto afecta la capitalizacion (casing) del string
        System.out.println("Cadena ignorando mayusculas y minusculas: " + str);
        
        
        /* Ejercicio 1
        Leer cadena de texto y reemplazar dentro de ella todos los espacios en blanco 
        por guiones bajos alterando la cadena original
        , ejemplo:
        Digitar String: Gerardo Josue Portillo
        resultado: Gerardo_Josue_Portillo
        */
        
        Scanner in = new Scanner(System.in);
        String str1;
        System.out.println("Digite una cadena de texto: " );
        str1 = in.nextLine();
        
        str1 = str1.replace(' ', '_');
        
        System.out.println("Cadena nueva: " + str1 );
        
        
        /*Ejercicio 2
        Leer un String y reemplazar las A y a por 4, las e y E con 3 y las i e I por 1
        Reemplazar la original
        */
        
        String str2;
        System.out.println("Digite un string: " );
        str2 = in.nextLine();
        
        str2 = str2.replace("a", "4");
        str2 = str2.replace("A", "4");
        str2 = str2.replace("e", "3");
        str2 = str2.replace("E", "3");
        str2 = str2.replace("i", "1");
        str2 = str2.replace("I", "1");
        
        /*Otra forma
        str2 = str2.replace("a", "4").replace("A", "4").replace("e", "3"), etcc..
        Es lo mismo solo que te ahorras un poco de codigo
        */
        
        System.out.println("Cadena str2: " + str2);
        
        
        
        
        
        
    }
}
