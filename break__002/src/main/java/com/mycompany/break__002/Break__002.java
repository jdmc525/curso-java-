
package com.mycompany.break__002;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Daniel
 */
public class Break__002 {

    public static void main(String[] args) {
        int numI, numR;
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        
        while (true) {
            System.out.println("Adivine el numero entre 1 y 5: ");
            numI = in.nextInt();
            
            numR= r.nextInt(5-1+1)+1;
        
            if (numR == numI) {
                break;
            }
        }
        
        System.out.println("VICTORY IS YOURS");


    }
}
