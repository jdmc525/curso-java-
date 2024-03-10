/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.split_001;

/**
 *
 * @author Daniel
 */
public class Split_001 {

    public static void main(String[] args) {
        
        /*  
        METODO SPLIT 
        
        Convierte un String en un arreglo de String dividiendolo en elementos delimitados por un token o separador
        */
        
        String str = "Daniel,SPS,Honduras,20";
        //declarar arreglo sin inicializar y anotarlo al resultado del metodo split de la cadena deseada
        String arr[] = str.split(",");
        
        //Imprimir los elementos del arreglo
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        /* 
        Se puede usar casi cualquier caracter para separar, algunos no son permitidos como el "\"
        */
        
        System.out.println("**********");
        
        //EJERCICIO, suponiendo que nos den la informacion de esta forma:
        str = "14565_100024_Daniel Mejia_10:33_17:59_03/06/2024";
        
        //Dividir e imprimir la informacion tomando como token el "_"        
        String arr2[] = str.split("_");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        
        
        System.out.println("*************");
        
        //El token pueden ser tambien varios caracteres ya que es un string y se puede reutilizar el arreglo
        
        str = "ToyotaSEPARARCorollaSEPARAR2012SEPARARAzulSEPARARCarro Importado";
        
        arr2 = str.split("SEPARAR"); 
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        
        System.out.println("**************");
        
        //Que pasaria si laadena lleva un caracter no aceptado por el motodo split en JAVA?
        
        str = "5|Coca Cola  3L|50.00|250.00"; 
        arr2 = str.replace("|", "_").split("_");
        
        
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
         
        }
        
        
        
        
        
        
        
        
    }
}
