/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicexercisepart3;

import java.util.Scanner;



/**
 *
 * @author User
 */
public class Problem3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Input the number of minutes: ");
        long minutes = scanner.nextLong();

        // Constants
        int minutesPerDay = 24 * 60;
        int minutesPerYear = 365 * minutesPerDay;

        // Calculations
        long years = minutes / minutesPerYear;
        long remainingMinutes = minutes % minutesPerYear;
        long days = remainingMinutes / minutesPerDay;

        // Output
        System.out.printf("%d minutes is approximately %d years and %d days%n", minutes, years, days);
    }
}

    
