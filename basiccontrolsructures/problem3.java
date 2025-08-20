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
public class problem3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Input the 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = sc.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = sc.nextInt();

        // Finding the greatest number
        int greatest = num1;

        if (num2 > greatest) {
            greatest = num2;
        }

        if (num3 > greatest) {
            greatest = num3;
        }

        // Displaying the result
        System.out.println("The greatest: " + greatest);
    }
}

    

