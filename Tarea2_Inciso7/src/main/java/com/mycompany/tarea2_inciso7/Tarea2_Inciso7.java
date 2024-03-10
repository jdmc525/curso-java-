/*
 * 7) Un negocio de banquetes tiene la siguiente politica para definir el cobro por sus servicios:
Cantidad de platillos	valor
1 a 30 platillos	L. 150 c/u
31 a 50 platillos	L. 125 c/u
51 a 200 platillos	L. 100 c/u
Mas de 200 platillos	L. 75 c/u - //sin incluir 200
Hacer un programa que muestre cuanto debe pagar un cliente dependiendo del numero de platillos que este desea ordenar.

 */

package com.mycompany.tarea2_inciso7;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Tarea2_Inciso7 {

    public static void main(String[] args) {
        System.out.println("JOSE DANIEL MEJIA CUELLAR \n20212030242");

        
        int cant;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de platillos que desee ordernar: ");
        cant = in.nextInt();
        
        if (cant>=1 && cant <=30) {
            System.out.println("El total a pagar es: L.150 c/u"  );
        }else if (cant>=31 && cant<=50) {
            System.out.println("El total a pagar es: L.125 c/u");
        }else if (cant>=51 && cant<=200) {
            System.out.println("El total a pagar es: L.100 c/u");
        }else if (cant>200) {
            System.out.println("El total a pagar es: L.75 c/u");
        }else{
            System.out.println("Esa no es una opcion valida");
        }
    }
}
