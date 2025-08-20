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
public class problem10 {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Prompt user for the number of rows
        System.out.println("Input the number: ");
        int rows = scanner.nextInt();
        
        //Generate the triangle
        for (int i = 0; i < rows; i++){
            //Print leading spaces
            for (int j = 0; j < i;j++){
                System.out.print(" ");
            }
            //Print stars
            for (int k = 0; k < rows - i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
