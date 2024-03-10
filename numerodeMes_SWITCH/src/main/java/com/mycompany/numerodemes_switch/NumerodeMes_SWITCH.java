
package com.mycompany.numerodemes_switch;


import java.util.Scanner;

/*
 * @author Daniel
 */

public class NumerodeMes_SWITCH {

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        
        int m , a;
        
        System.out.println("Ingrese el numero de mes (1-12): ");
        m = userIn.nextInt();
        
        System.out.println("Ingrese el año: ");
        a = userIn.nextInt();
        
        
        switch (m) {
            case 1,3,5,7,8,10,12: //Esto de separar con coma solo se puede en la version ultima, las anteriores no
       /*Se quita el break cuando los casos tienen conclusiones en comun*/         
                System.out.println("El mes tiene 31 dias");
                break;
     
            case 2 , 15 :
                if ((a % 4) == 0) {
                    System.out.println("El mes tiene 29 dias");
                }else{
                    System.out.println("El mes tiene 28 dias");
                }
                break;
            
            case 4: case 6: case 9: case 11: //En examen si mejor asi por cualquier cosa
                System.out.println("El mes tiene 30 dias");
                break;
            
            default:
                System.out.println("OPCION NO VALIDA, EL MES DEBE SER ENTRE 1-12");
        }
    }
}
