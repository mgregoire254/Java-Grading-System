/**** A simple program to store user input grades, print them out and displays a letter grade.  
 * Project for CS115 Programming in Java course.
 * Written by Michael Gregoire */

import java.util.Scanner;
import java.util.ArrayList;

public class GradeSystem {
    
    public static void main(String[] args) {
        int exitGrade = 0;

        // Create arraylist to store grades that the user inputs.
        ArrayList<Integer> grades = new ArrayList<Integer>();
        Scanner userInput = new Scanner(System.in);  
        
        System.out.println("\n\n This is a program that allows a user to input upt to 10 grades. The program then calculates the average of the grades, prints them off and the prints a letter grade based on the average \n\n");
        System.out.println("Please enter 10 number grades or enter 999 to quit: \n"); 

        // Prompt user for 10 grades and stores the values in an arraylist.
        do {
            int userGrade = userInput.nextInt();
            System.out.println("Please enter the next number or enter 999 to quit: \n");
            if (userGrade >= 0 && userGrade <= 100) {
                grades.add(userGrade);}
                else {
                    System.out.println("please enter a grade between 0 and 100");
                }
            if (grades.size() == 10) {
                exitGrade = 999;
            }
            } while (exitGrade != 999);

        System.out.println("\n Here is a list of the grades you entered: \n");
        
        for (Integer grade : grades) {
            System.out.println(grade);
        }

        // Sums up the grades in the array list and stores the value in a variable.
        int sum = 0;
        for (Integer g : grades) {
            sum+= g;
            
        }

        // Averages the grades in the array list and stores the value in a variable.
        double average = sum / grades.size();
        System.out.println("\n The average of the grades you entered is: " + average + "\n\n");
        
        if (average <= 100 && average >= 90) {
            System.out.println("The letter grade for " + average + " is " + "A");
        } 
        else if (average >= 80 && average <= 89){
            System.out.println("The letter grade for " + average + " is " + "B");
        }
        else if (average >= 70 && average <= 79){
            System.out.println("The letter grade for " + average + " is " + "C");
        }
        else if (average >= 60 && average <= 69){
            System.out.println("The letter grade for " + average + " is " + "D");
            }
        else if (average >= 0 && average <= 59){
            System.out.println("The letter grade for " + average + " is " + "F");
        }
        System.out.println("\n\n");
        userInput.close();
        }
        
}
