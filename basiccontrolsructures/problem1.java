/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basiccontrolsructures;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class problem1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        // Get number from user
        System.out.println("Input number");
        int number = input.nextInt();
        
        //Determine if the number is positive or negative 
        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0 ) {
            System.out.println(number + "is negative");
        } else {
            System.out.println("The number is zero");
        }
        
        input.close();
        
    }
    
}
