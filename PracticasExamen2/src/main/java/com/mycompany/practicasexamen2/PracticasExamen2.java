/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicasexamen2;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class PracticasExamen2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String frase = "Es de noche y esta haciendo frio";
        String frase1 = frase;
        int arr1[] = new int[5];
        String arr2[] = {"Manzana", "Banana", "Kiwi", "Pera", "Sandia"};
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println("Ingrese un numero: ");
//            arr1[i] = in.nextInt();
//        }
//        

        for (int i = 0; i < arr1.length; i++) {
           // System.out.println(arr1[i]);
            System.out.println(arr2[i].toUpperCase());
        }
        
        
        //Sin usar replace 
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                System.out.print("*");
            }else {
                System.out.print(frase.charAt(i));
            }
        }
        
        System.out.println("**************\n");
        
        //Usando replace
        frase1 = frase1.replace(" ", "*");
        System.out.println(frase1);
     
        
                in.nextLine(); //Antes de leer el string forzamos el vaciado del buffer

                
                  //Convertir de String a Double 
        String str3 = "5.16516216846";
        double dbl = Double.parseDouble(str3);
        
        System.out.println(dbl + 5);


	//De cualquier tipo a String 
	
	        int ent2 = 69;
	        String str4 = String.valueOf(ent2);
        System.out.println(str4 + " nice");
               
        
          String x = "hola", y = "hola";
        
          
         if (x.equals(y) == true ) {
            System.out.println("Son iguales con equals");
        }else {
            System.out.println("NO son iguales usando equals");
        }

                
    }
}
