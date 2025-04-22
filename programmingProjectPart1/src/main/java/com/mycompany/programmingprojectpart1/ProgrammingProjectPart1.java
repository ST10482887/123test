/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programmingprojectpart1;
import javax.swing.JOptionPane;
/**
 *
 * @author lab_services_student
 */
public class ProgrammingProjectPart1 {

  
    public static boolean isValidSAphone(String number) {
        return number.matches("\\+27\\d{9}") && number.length() == 12;
    }

    public static boolean isValidUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public static boolean isValidPassword(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[!@#$%^&*()_+\\-=].*");
    }

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Registration for an account");

        // Username
        String username = JOptionPane.showInputDialog("Create a username (max 5 chars, must contain _ ):");
        if (!isValidUsername(username)) {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted. Please ensure that "
                    + "your username contains an underscore and is no more than five characters in length.");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Username successfully captured.");
        }

        // Password
        String password = JOptionPane.showInputDialog("Create a password (min 8 chars, use uppercase, number, special char):");
        if (!isValidPassword(password)) {
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted; please ensure that "
                    + "the password contains at least eight characters, a capital letter, a number, and a special character.");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Password successfully captured!");
        }

        // Phone Number
        String number = JOptionPane.showInputDialog("Enter SA phone number (+27XXXXXXXXX):");
        if (!isValidSAphone(number)) {
            JOptionPane.showMessageDialog(null, "Cell number is incorrectly formatted or does not contain the international code.");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Cell phone number successfully added.");
        }

        // User Details
        String userFirstName = JOptionPane.showInputDialog("Enter user First Name:");
        String userLastName = JOptionPane.showInputDialog("Enter user Last Name:");

        // Login
        String userLogin = JOptionPane.showInputDialog("Login: Enter your username:");
        String passLogin = JOptionPane.showInputDialog("Login: Enter your password:");

        if (userLogin.equals(username) && passLogin.equals(password)) {
            JOptionPane.showMessageDialog(null, "Login successful! Welcome, " + userFirstName + " " + userLastName + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username or password.");
        }
    }
}
   