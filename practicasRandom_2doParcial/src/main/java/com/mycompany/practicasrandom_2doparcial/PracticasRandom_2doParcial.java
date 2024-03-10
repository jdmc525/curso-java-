/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicasrandom_2doparcial;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class PracticasRandom_2doParcial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dame una frase masisona: ");
        String frase = in.nextLine();
        
        int nVocales = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.toLowerCase().charAt(i) == 'a' || frase.toLowerCase().charAt(i) == 'e' || frase.toLowerCase().charAt(i) == 'i' || frase.toLowerCase().charAt(i) == 'o' || frase.toLowerCase().charAt(i) == 'u' ) {
                nVocales++;
            }
        }
        
        System.out.println("Vocales en total: " + nVocales);
        
//Reemplazar a por e sin replace        
        String frase2 = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.toLowerCase().charAt(i) == 'a') {
                frase2 += 'e';
            }else{
            frase2+=frase.charAt(i);
            }
        }
        System.out.println(frase2);

//Reemplazar a por e con replace
        System.out.println(frase.replace('a', 'e'));

//Eliminar espacios de la frase anterior 
        
        frase2 = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
            
            }else{
               frase2 += frase.charAt(i);
            }
        }
        
        System.out.println(frase2);
        
        
        //Crear un array con los dias de la semana e indicar si es laboral o no 
        
        
        String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        
        System.out.println("Dame un dia de la semana: ");
        String diaU = in.nextLine();
        
        for (int i = 0; i < dias.length; i++) {
            if (dias[i].equalsIgnoreCase(diaU.trim())) {
                switch (dias[i].toLowerCase()) {
                    case "lunes":
                        System.out.println("Este es un dia laboral");
                        break;
                    case "martes":
                        System.out.println("Este es un dia laboral");
                        break;
                    case "miercoles":
                        System.out.println("Este es un dia laboral");
                        break;
                    case "jueves":
                        System.out.println("Este es un dia laboral");
                        break;
                    case "viernes":
                        System.out.println("Este es un dia laboral");
                        break;                        
                     case "sabado":
                        System.out.println("Este es un dia laboral");
                        break;  
                    case "domingo":
                        System.out.println("Este es un dia laboral");
                        break;  
                    default:
                        System.out.println("Este no es un dia valido.");
                }
                
            }
        }
        
        
 //Pedir numeros y convertirlos a string para aniadirlos a una frase
        System.out.println("Dame un numero entero: ");
        int a = in.nextInt();
        
        in.nextLine();
        System.out.println("Dame una frase malandrosa: ");
        String fraseM = in.nextLine();
        
        System.out.println(fraseM + String.valueOf(a));
  
 //Pedir numeros pero como string y ponerlos como numeros de verdad
 
        System.out.println("Dame un numero con decimales: ");
        String flt1 = in.nextLine();
        
        System.out.println("Dame un numero muy grande con decimales:");
        String dble1 = in.nextLine();
        
        System.out.println("Ahora dame un entero asi normi: ");
        String ent1 = in.nextLine();
        
        
        System.out.println("El producto de los numeros anteriores es : " + 
                (Float.parseFloat(flt1) * Integer.parseInt(ent1) * Double.parseDouble(dble1))        );
        
        
        
    }
}
