/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 

package com.mycompany.test2024;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Test2024 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1D Array for City names
        String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};

        // 2D Array for accidents [row=city][col=vehicle type: 0=Car, 1=Motorbike]
        int[][] accidents = new int[3][2];

        // Input accidents from user
        for (int i = 0; i < cities.length; i++) {
            System.out.println("Enter accidents for " + cities[i] + ": ");
            System.out.print("Cars: ");
            accidents[i][0] = sc.nextInt();
            System.out.print("Motorbikes: ");
            accidents[i][1] = sc.nextInt();
        }

        // Print report header
        System.out.printf("%-15s %-10s %-10s %-10s%n", "City", "Cars", "Bikes", "Total");
        System.out.println("--------------------------------------------------");

        int highestAccidents = 0;
        String cityWithMost = "";

        // Process and display each city
        for (int i = 0; i < cities.length; i++) {
            int total = accidents[i][0] + accidents[i][1];
            System.out.printf("%-15s %-10d %-10d %-10d%n",
                    cities[i], accidents[i][0], accidents[i][1], total);

            // Determine city with highest accidents
            if (total > highestAccidents) {
                highestAccidents = total;
                cityWithMost = cities[i];
            }
        }

        // Display city with most accidents
        System.out.println("\nCity with the highest accidents: " +
                cityWithMost + " (" + highestAccidents + " accidents)");
    }
}
