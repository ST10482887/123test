/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numbergussinggame;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author lab_services_student
 */
public class NumberGussingGame {

    public static void main(String[] args) {
       
        // create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // create a random object  to generate a random number 
        Random random = new Random();
        // generate a random num 1- 100 inclusion
        int numberToGuess = random.nextInt(100)+1;
        // counter to keep track of the number ogf guesses the user makes
        int numberOfTries = 0;
        boolean hasWon = false;
         System.out.println("Welcome to the Number guessing Game");
         System.out.println("i have selected  one number between 1 and 100. can you guess the number");
        
        
        while(!hasWon){
            // prompt the user to enter a guess
             System.out.println("Enter your guess:");
            int guess = scanner.nextInt();
            numberOfTries++;
            int numberToGess;
            if (guess<numberToGuess){
               System.out.println("Too low! try again."); 
            }
            else if (guess>numberToGuess){
                System.out.println("Too high! Try again.");
            }
            // check if the guess is higher than the target number
            else if (guess>numberToGuess){
            }else{
               hasWon = true;
                System.out.println("congratulations!"+ "you guessed the number in "+ numberOfTries +"tries");
            }
        }
        
        
        
        
        
        
        
       
    }
}
