

package com.mycompany.comparacion_ejercicio;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Comparacion_Ejercicio {

    public static void main(String[] args) {
        
//        /* 1) leer un String y luego imprimirlo dejando tres espacios
//        en blanco entre cada caracter, luego imprimir dicho String
//        de forma invertida caracter por caracter. ejemplo:
//        Digitar String: Gerardo
//        G   e   r   a   r   d   o   
//        odrareG
// */
        
        Scanner in = new Scanner(System.in);
        String str1;
        
        System.out.println("Digite un string: ");
        str1 = in.nextLine();
        
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i) + "   ");;
        }
        System.out.println("");
        for (int i = (str1.length()-1) ; i >= 0 ; i--) {
             System.out.print(str1.charAt(i));
        }
        System.out.println("");
        
        
        
        /* 2) Leer una cadena de texto y mostrar cuantas
            veces sale la letra n dentro de ella,
            ignorando mayusculas y minusculas
        */
        
        System.out.println("Digite un string");
        String str2 = in.nextLine();
        
        int contN = 0;
        
        //Primeraforma de hacerlo
//        for (int i = 0; i < str2.length(); i++) {
//            if (str2.charAt(i)== 'n'  || str2.charAt(i)== 'N') {
//                contN++;
//            }
//        }
//        

    //Segunda forma de hacerlo
        for (int i = 0; i < str2.length(); i++) {
            if (str2.toLowerCase().charAt(i)== 'n') {
                contN++;
            }
        }
        
        System.out.print("La cantidad de veces que aparece n es: " + contN);
        
        
        
    }
}
