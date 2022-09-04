package number_guessing;

import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
    // Welcome prompt!
        System.out.println("Welcome! Can you guess the number?");
    // Variables        
        Random computerGenerated = new Random();
        int target = computerGenerated.nextInt(100);
    
        System.out.println("Please input your guess (1-100): ");
        Scanner guess = new Scanner(System.in);

        while (!guess.hasNextInt()){
            // Check the user is parsing a proper integer!
            System.out.println("Please insert a proper integer!");
            System.out.println("Please input your guess (1-100): ");
            guess = new Scanner(System.in);
        }

        int playerGuess = guess.nextInt();
        
        // Core logic
        while (playerGuess != target) {
            
            if (playerGuess < target) {
                System.out.println("Too low!");
            }

            if (playerGuess > target) {
                System.out.println("Too high!");
            }

            // Cold/Hot logic
            if (playerGuess >= target-5) {
                System.out.println("You're getting close!");
            }

            if (playerGuess + 20  < target) {
                System.out.println("You're way below!");
            }
            if (playerGuess - 20  > target) {
                System.out.println("You're way too far ahead!");
            }



            System.out.print("Input your guess: ");
            playerGuess = guess.nextInt();
        }

        if (playerGuess == target) {
            System.out.println("Congratulations! You won!");
            System.out.println("The correct number was: " + target);
        }

        
        guess.close();
    }
}
