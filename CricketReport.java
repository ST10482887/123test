/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cricketreport;

import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */





public class CricketReport {

    public static void main(String[] args) {
        
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};

        String[] stadiums = {"Kingsmead", "St Georges", "Wanderers"};

        
        int[][] runs = {
            {5000, 3800, 4200},  // Kingsmead
            {3500, 3700, 3900},  // St Georges
            {6200, 5000, 5200}   // Wanderers
        };

        
        System.out.printf("%-12s %-15s %-15s %-15s%n",
                "STADIUM", batsmen[0], batsmen[1], batsmen[2]);

        
        for (int i = 0; i < stadiums.length; i++) {
            System.out.printf("%-12s", stadiums[i]);
            for (int j = 0; j < batsmen.length; j++) {
                System.out.printf("%-15d", runs[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        // Highest scorer per stadium
        System.out.println("--- Highest Scorer per Stadium ---");
        for (int i = 0; i < stadiums.length; i++) {
            int maxRuns = runs[i][0];
            int maxIndex = 0;
            for (int j = 1; j < batsmen.length; j++) {
                if (runs[i][j] > maxRuns) {
                    maxRuns = runs[i][j];
                    maxIndex = j;
                }
            }
            System.out.println(stadiums[i] + ": " + batsmen[maxIndex] +
                               " (" + maxRuns + " runs)");
        }

        System.out.println();

        // Total runs per batsman
        System.out.println("--- Total Runs per Batsman ---");
        int[] totalBatsmanRuns = new int[batsmen.length];
        for (int j = 0; j < batsmen.length; j++) {
            int total = 0;
            for (int i = 0; i < stadiums.length; i++) {
                total += runs[i][j];
            }
            totalBatsmanRuns[j] = total;
            System.out.println(batsmen[j] + " -> " + total + " runs");
        }

        System.out.println();

       
        System.out.println("--- Stadium with Most Runs ---");
        int highestStadiumRuns = 0;
        String topStadium = "";
        for (int i = 0; i < stadiums.length; i++) {
            int stadiumTotal = 0;
            for (int j = 0; j < batsmen.length; j++) {
                stadiumTotal += runs[i][j];
            }
            if (stadiumTotal > highestStadiumRuns) {
                highestStadiumRuns = stadiumTotal;
                topStadium = stadiums[i];
            }
        }
        System.out.println(topStadium + " -> " + highestStadiumRuns + " runs");

        
        System.out.println("\nNow enter your own data for a batsman:");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Batsman's Name: ");
        String batsman = sc.nextLine();

        System.out.print("Enter Stadium Name: ");
        String stadium = sc.nextLine();

        System.out.print("Enter Runs Scored: ");
        int runsScored = sc.nextInt();

        System.out.println("\n--- Cricket Report (User Input) ---");
        System.out.println("Batsman: " + batsman);
        System.out.println("Stadium: " + stadium);
        System.out.println("Runs Scored: " + runsScored);
    }
}
