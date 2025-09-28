/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estate;



public class Estate {
    public static void main(String[] args) {
        // Step 1: Declare arrays
        String[] agents = {"Joe Bloggs", "Jane Doe"};
        String[] months = {"JAN", "FEB", "MAR"};

        // 2D Array for property sales (R values)
        int[][] sales = {
            {800000, 1500000, 2000000},  // Joe Bloggs
            {700000, 1200000, 1600000}   // Jane Doe
        };

        // Step 2: Print the sales table header
        System.out.printf("%-15s", "ESTATE AGENT");
        for (String m : months) {
            System.out.printf("%-15s", m);
        }
        System.out.println();
        System.out.println("-----------------------------------------------------");

        // Step 3: Process & display sales
        int[] totals = new int[agents.length];
        double[] commissions = new double[agents.length];

        double highestSales = 0;
        String topAgent = "";

        for (int i = 0; i < agents.length; i++) {
            System.out.printf("%-15s", agents[i]);
            int total = 0;

            for (int j = 0; j < months.length; j++) {
                System.out.printf("R %-13d", sales[i][j]);
                total += sales[i][j];
            }

            totals[i] = total;
            commissions[i] = total * 0.02;

            if (total > highestSales) {
                highestSales = total;
                topAgent = agents[i];
            }
            System.out.println();
        }

        // Step 4: Totals and commissions
        System.out.println("\nTOTAL SALES AND COMMISSION REPORT");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < agents.length; i++) {
            System.out.println(agents[i] + " -> Total Sales: R " + totals[i] +
                               ", Commission: R " + commissions[i]);
        }

        // Step 5: Top-Selling Agent
        System.out.println("\nTop-Selling Estate Agent: " + topAgent +
                           " (R " + highestSales + ")");
    }
}

