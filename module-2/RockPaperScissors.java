/*
	* Author: Sheridan Dela Cruz
	* Date: June 12, 2026
	* Module 2.2
	* Description: This program plays a simple Rock-Paper-Scissors game between user and computer.
*/

 import java.util.Scanner;

public class RockPaperScissors {
    // Main method: program execution starts here
    public static void main(String[] args) {
	
	        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Generate a random number between 1 and 3 for the computer's choice
        int computerChoice = (int)(Math.random() * 3) + 1;
		// 1 = Rock, 2 = Paper, 3 = Scissors
		
        // Prompt the user to enter their choice
        System.out.println("Enter your choice: 1 = Rock, 2 = Paper, 3 = Scissors");
        int userChoice = input.nextInt();
        // userChoice should be 1, 2, or 3
		
        // Convert numeric choices to words for clearer output
        String computerMove;
        String userMove;
		
        // Determine the computer's move as a word
        if (computerChoice == 1) {
            computerMove = "Rock";
        } else if (computerChoice == 2) {
            computerMove = "Paper";
        } else {
            computerMove = "Scissors";
        }
		
        // Determine the user's move as a word
        if (userChoice == 1) {
            userMove = "Rock";
        } else if (userChoice == 2) {
            userMove = "Paper";
        } else {
            userMove = "Scissors";
        }
		
        // Display both selections
        System.out.println("Computer chose: " + computerMove);
        System.out.println("You chose: " + userMove);

        // Determine the result of the game
        if (computerChoice == userChoice) {
            System.out.println("It's a tie!");
        } else if (computerChoice == 1 && userChoice == 3) {
            // Computer: Rock, User: Scissors
            System.out.println("Computer wins! Rock crushes Scissors.");
        } else if (computerChoice == 2 && userChoice == 1) {
            // Computer: Paper, User: Rock
            System.out.println("Computer wins! Paper covers Rock.");
        } else if (computerChoice == 3 && userChoice == 2) {
            // Computer: Scissors, User: Paper
            System.out.println("Computer wins! Scissors cut Paper.");
        } else {
            // All other non-tie cases mean the user wins
            System.out.println("You win!");
        }

} // closes main

} // closes class