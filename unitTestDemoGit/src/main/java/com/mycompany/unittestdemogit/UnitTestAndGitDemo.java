/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unittestdemogit;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class UnitTestAndGitDemo {

    public int addEm;

    public UnitTestAndGitDemo() {
    }


    
    //We create the above arrays to implement Encapsulation
    /*
    Encapsulation is an OOP principle that basically means we bundle things in a neat way.
    This is often the case with classes, we bundle data/attributes and methods in a class to keep 
    from readding data and reimplementing functionality everytime we need to.
    In this case we use the names of our cities and types of vehicles many times in our source code
    so we encapsulate this data in a collection (in our case array)
    
    This approach ensures data integrity and consistency, as direct modification of the code 
    is prevented in other words
    (We don't have to change code everywhere we hard coded cities if we add another city or vehicle type),
    and changes can only occur through defined interfaces 
    (in the above case we add a new element to the arrays above ).
    Encapsulation also promotes modularity and maintainability by clearly separating the internal 
    implementation details from the external interface of the class.
    */
    
    public static void main(String[] args) {
        
        //Array used to store the Cities we are collecting data for
        String[] Cities = {"Cape Town", "Johannesburg", "Post Elizabeth"};

        //Array used to store the Vehicle types we are collecting data for
        String[] Vehicle_Types = {"Car", "Motorbike"};
        
       Scanner sc = new Scanner(System.in);
       
       int [][] accidents = populateCity(Cities, Vehicle_Types, sc);
       
//        System.out.println("Please enter non-negative vehicle incident numbers");
        
       int [] cityTotals = calculateCityTotals(Cities, Vehicle_Types, accidents);
        
       
        String highCity = getHighCity(Cities, cityTotals);
       
        
        printReport(accidents, cityTotals, highCity, Cities);
        
    }
    
    public static int[][] populateCity(String[] Cities, String [] Vehicle_Types, Scanner sc) {
        //Populating the 2D array using helper function readNonNegativeInt
        int [][] accidents = new int[Cities.length][Vehicle_Types.length];
        for (int city = 0; city < Cities.length; city ++) {
            
            for (int v = 0; v < Vehicle_Types.length; v++) {
                
                accidents[city][v] = readNonNegativeInt(
                        sc,
                        "  Enter number of " + Vehicle_Types[v] + " accidents in " + Cities[city] + ": "
                );
                
            }
            
        }
        return accidents;
    }
    
    public static int[] calculateCityTotals (String[] Cities, String [] Vehicle_Types, int[][] accidents){
         //An array for holding the total incidents per city
         int[] cityTotals = new int[Cities.length];
         
         //Calculate the totals per row (per city)
          for (int city = 0; city < Cities.length; city++) {
            int sumForCity = 0; //Every time we move to the next row we want to calculate a new total
            for (int v = 0; v < Vehicle_Types.length; v++) {
                
                sumForCity += accidents[city][v]; // adding each column in a row
            }
            cityTotals[city] = sumForCity; // after we add all columns in a row we store that row (city's) total
        }
        return cityTotals; 
    }
    
    public static String getHighCity (String [] Cities, int [] cityTotals){
                // Find city with the highest total accidents
        int maxCityIndex = 0;
        for (int i = 1; i < cityTotals.length; i++) {
            if (cityTotals[i] > cityTotals[maxCityIndex]) {
                maxCityIndex = i;
            }
        }
        
        //Based on the highest total from cityTotals we get the city name with the highest total
        String highCity = Cities[maxCityIndex];
        
        return highCity;
    }
    
    
    /*
    Accepts a scanner object (to accept input from the console) 
    and accepts a string prompt (Telling the user what to enter)
    and returns the value that the user entered
    */
    private static int readNonNegativeInt(Scanner sc, String prompt) {
        System.out.println(prompt);
        int val = 0;
        if ( sc.hasNext() ) {
            val = sc.nextInt();
            return val;
        } else {
            System.out.println("Please enter a number");
            sc.next();
        }
        return 0;
    }
    
    private static void printReport (int [][] accidents, int[] cityTotals, String highCity, String [] Cities) {
        
        System.out.println("------------------------------------------------------");
        System.out.println("Road Accident Report");
        System.out.println("------------------------------------------------------");
        
        System.out.printf("%-15s %10s %12s %10s%n", " ", "Car", "Motorbike", "Total");

        // Rows per city
        for (int city = 0; city < Cities.length; city++) {
            int car = accidents[city][0];
            int bike = accidents[city][1];
            int total = cityTotals[city];

            System.out.printf("%-15s %10d %12d %10d%n", Cities[city], car, bike, total);
        }
        
        System.out.println("------------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTAL FOR EACH CITY");
        System.out.println("------------------------------------------------------");
        
        for ( int city = 0; city < Cities.length; city ++ ) {
            System.out.println(Cities[city] +" : " + cityTotals[city] );
        }
        
        System.out.println("CITY WITH THE MOST ACCIDENTS : " + highCity);
        
        
    }

    public int addEm(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}    