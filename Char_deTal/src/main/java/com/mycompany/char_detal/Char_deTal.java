/*
 * STRINGS
 */

package com.mycompany.char_detal;

/**
 *
 * @author Daniel
 */
public class Char_deTal {

    public static void main(String[] args) {
        String cadena1;
        String cadena2 = "UNAH VS 2024";
        String c1, c2 = "", c3 = "Brrrr con tílde";
        
        System.out.println("cadena2: " + cadena2);
        System.out.println(c3);
        
        System.out.println("********************\n");
        
        //Concatenar: unir varios elementos en una cadena de texto
        String str1 = "Febrero";
        String str2 = "Ing. en Sistemas";
        String str3 = "Mes de " + str1 + " en la carrera de " + str2;
        System.out.println(str3);

        System.out.println("********************\n");
        
        //Metodo length que sirve para saber la cantidad de caracteres en un String, devuelve un int.
        System.out.println("Numero de caracteres de str3: " + str3.length());
    
        System.out.println("********************\n");

        String fruta1 = "uva";
        int t1 = fruta1.length();
        System.out.println(t1);
        
        System.out.println("********************\n");
        //Tener acceso a cada caracter dentro de un string
        String fruta2 = "Melocotón";
        //metodo char: permite obtener un char de un string en x posicion
        System.out.println(fruta2.charAt(0));
       
        System.out.println("*********************\n");
        
        
        //Imprimir cada caracter de fruta2 en cada renglon
        for (int i = 0; i < fruta2.length(); i++) {
            System.out.println(fruta2.charAt(i));
        }
        
        System.out.println("El primer caracter de fruta 2 es: " + fruta2.charAt(0));
        System.out.println("El ultimo caracter de fruta 2 es: " + fruta2.charAt(fruta2.length()-1));
     
        
        
        /***************************************************/
        System.out.println("\n********************\n");
        

        
        //OBTENER LAS VERSIONES MAYUSCULAS/MINUSCULAS DE UN STRING
        
        String fruta3 = "Manzana Verde";
        System.out.println("fruta3 en mayusculas: " + fruta3.toUpperCase());
        System.out.println("fruta3 en mayusculas: " + fruta3.toLowerCase());
        System.out.println(fruta3);  //se mantiene intacta la variable btw
        
        //si se desea sobreescribir a la version en mayusculas:
        fruta3 = fruta3.toUpperCase();
        System.out.println(fruta3);  //aca ya quedo en mayusculas por siempre
        
        System.out.println("\n************************\n");
        
        //trim() devuelveuna version del string sin relleno de espacios
        String fruta4=  "           MANZANA ROJA             ";
        
        System.out.println("fruta 4 es: "+ fruta4 + "@");
        System.out.println("Longitud de fruta4 : " + fruta4.length());
        System.out.println("");
        
        //Imprimir una version de fruta4 sin relleno
        System.out.println("fruta 4 con trim: " + fruta4.trim()); //OJO esto solo corta los espacios por fuera no por dentro
        /*Osea el espacio de en medio queda siempre.*/
        
        System.out.println("Longitud de fruta4 : " + fruta4.trim().length());
        //Esto no puede ser alreves poque el length devuelve int pero trim ocupa un String para funcionar
        
        //Sobreescribir fruta4 sin espacios
        fruta4 = fruta4.trim();
        
        System.out.println("fruta4:" + fruta4);
        
        
        System.out.println("\n*********************\n");
        
        //Arreglar vegetal para que se imprima todo en lowercase y sin espacios
        String vegetal1 = "     ZanaHORIa PeQUEña   "; 
        
        System.out.println("vegetal1 arreglada: " +  vegetal1.toLowerCase().trim());
        
        System.out.println(vegetal1);
     
        
        System.out.println("\n****************\n");
        
        //Concatenar char
        
        String nombre = "Pitbull";
         nombre = nombre + 'x'; //char 'x' con comillas simples solo acepta 1
        System.out.println(nombre);
        
        
        System.out.println("\n****************\n");
        
        
        String ciudad = "San Pedro Sula en el departamento de Cortes";
        char asterisc = '*';
       // String ciudad2 = "San"+ asterisc + "Pedro" + asterisc + "Sula"+ asterisc + "en" + asterisc + "el" + asterisc + "departamento" + asterisc + "de" + asterisc + "Cortes";
        String ciudad3= "";
        for (int i = 0; i < ciudad.length(); i++) {
            if (ciudad.charAt(i) == ' ') {
                ciudad3+= '*';
            }else  {
                ciudad3 += ciudad.charAt(i);
            }
        }
        
        System.out.println(ciudad3);
        
        
    }
}
