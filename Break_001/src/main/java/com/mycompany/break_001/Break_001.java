
package com.mycompany.break_001;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Break_001 {

    public static void main(String[] args) {
        /*Programa q lea 100 numeros positivos y que al final muestre la suma, si durante lalectura se lee 
        uno que sea menor que cero tons no continuar la lectura de numeros
        hacerlo con FOR.
        */
        
        Scanner in = new Scanner(System.in);
        double numero, suma=0;
        
        for (int i = 0; i < 100; i++) {
            System.out.println("Digitar numero positivo: ");
            numero = in.nextDouble();
            
            if (numero<0) {
                break; //Si se mete un 0 pues termina por completo el For
            }
        
            suma+=numero;
        }
        System.out.println("Suma: " + suma);
        
        
        
    }
}
