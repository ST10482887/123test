/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estate;


public class EstateAgent implements IEstateAgent {
    private String name;
    private double[] sales; // Jan, Feb, Mar

    // Constructor
    public EstateAgent(String name, double[] sales) {
        this.name = name;
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public double[] getSales() {
        return sales;
    }

    // ---------------- Implement interface methods ----------------

    // Calculate total sales for one agent
    @Override
    public double EstateAgentSales(double[] propertySales) {
        double total = 0;
        for (double s : propertySales) {
            total += s;
        }
        return total;
    }

    // Calculate 2% commission
    @Override
    public double EstateAgentCommission(double propertySales) {
        return propertySales * 0.02;
    }

    // Find top estate agent (index of highest seller)
    @Override
    public int TopEstateAgent(double[] totalSales) {
        int topIndex = 0;
        double max = totalSales[0];
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > max) {
                max = totalSales[i];
                topIndex = i;
            }
        }
        return topIndex;
    }
}
