/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estate;



public class RunEstate {
    public static void main(String[] args) {
        // -----------------------------
        // Q.1.1 Sales data in 2D array
        // -----------------------------
        String[] agents = {"Joe Bloggs", "Jane Doe"};
        double[][] salesData = {
            {800000, 1500000, 2000000}, // Joe
            {700000, 1200000, 1600000}  // Jane
        };

        // Create EstateAgent objects
        EstateAgent agent1 = new EstateAgent(agents[0], salesData[0]);
        EstateAgent agent2 = new EstateAgent(agents[1], salesData[1]);

        EstateAgent[] estateAgents = {agent1, agent2};

        // -----------------------------
        // Q.1.2 + Q.1.3 Totals + Commission
        // -----------------------------
        double[] totalSales = new double[estateAgents.length];
        double[] commissions = new double[estateAgents.length];

        for (int i = 0; i < estateAgents.length; i++) {
            totalSales[i] = estateAgents[i].EstateAgentSales(estateAgents[i].getSales());
            commissions[i] = estateAgents[i].EstateAgentCommission(totalSales[i]);
        }

        // -----------------------------
        // Display Report
        // -----------------------------
        System.out.println("ESTATE AGENT SALES REPORT");
        System.out.println("------------------------------------------");
        System.out.printf("%-12s %-12s %-12s %-12s%n", "Agent", "Jan", "Feb", "Mar");
        System.out.println("------------------------------------------");

        for (int i = 0; i < estateAgents.length; i++) {
            double[] s = estateAgents[i].getSales();
            System.out.printf("%-12s R%-11.0f R%-11.0f R%-11.0f%n",
                    estateAgents[i].getName(), s[0], s[1], s[2]);
        }

        System.out.println("------------------------------------------");
        for (int i = 0; i < estateAgents.length; i++) {
            System.out.println(estateAgents[i].getName() +
                    " Total Sales: R" + totalSales[i] +
                    " | Commission: R" + commissions[i]);
        }

        // -----------------------------
        // Q.1.4 Top performer
        // -----------------------------
        int top = agent1.TopEstateAgent(totalSales);
        System.out.println("\nTop Performing Agent: " +
                estateAgents[top].getName() + " (R" + totalSales[top] + ")");
    }
}
