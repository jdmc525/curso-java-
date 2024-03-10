
package com.mycompany.substring_001;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class SubString_001 {

    public static void main(String[] args) {
        /*METODO SUBSTRING
        En otros lenguajes llamado "substr"
        Metodo que devuelve un String que esta dentro de otro String por medio de una posicion de inicio y fin
        
        En JAVA devuelve desde laposicion de inicio hasta la posicion de fin -1
        
        */ 
        String str = "Ingenierias UNAH 2024";
        
        System.out.println(str);
        System.out.println("La subcadena desde 0 hasta 5 es: " + str.substring(0, 5));
        //  Ingen  => 01234 | 5 lo podriamos ver como que no incluye el 5 es decir no incluye el valor de fin.
        
        
        System.out.println("La subcadena desde  8 hasta 14 es: " + str.substring(8,14));
        //   ias UN  => 8 9 10 11 12 13 | 14  no incluye el 14 que seria A
        
        //Substring devuelve un String o se que podemos guardarlo en otra variable String
        String subcadena1 = str.substring(9, 18);
        
        System.out.println("La subcadena desde 9 a 18 es: " + subcadena1);
        
        
        System.out.println("\n\n");
        
        
        /*Ejercicio 1
        Leer un numero de cedula de Honduras, el programa
        unicamente debe validar que este numero tenga 13 digitos.
        * el programa deberá eliminar los espacios de relleno, güiones,
          güiones bajos, espacios en blanco de la cadena.
        
        *Luego de leer la cedula mostrar la informacion siguiente:
        1) numero de departamento
        2) numero de municipio
        3) año de asentamiento
        4) correlativo en que fue asentado
        
        ejemplo:
        Digitar cedula: 1401-1982-01055
        Resultado:
        Departamento: 14
        Municipio: 01
        Año de asentamiento: 1982
        Correlativo: 01055
        
        */
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese su numero de cedula: ");
        String dni = in.nextLine();
        
        dni = dni.trim().replace(" ", "").replace("-", "").replace("_", "");
        
        if (dni.length() == 13) {
            System.out.println("Departamento: " + dni.substring(0 , 2));
            System.out.println("Municipio: " + dni.substring(2 , 4));
            System.out.println("Año de asentamiento: " + dni.substring(4 , 8));
            System.out.println("Correlativo: " + dni.substring(8 , 13));
        }else{
            System.out.println("DNI debe ser de 13 digitos");
        }
        
        
        
        
        
        
        } 
    }

