package hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class hman {
    public static void main(String[] args) throws FileNotFoundException{
        /*  It complained to handle it as a FileNotFoundException,
         but instead I declared in the function signature that it may 
         throw that error. It's nothing the script can do anyways
         if it can't find the words.txt */
        

         // 1 or 2 PLAYERS LOGIC
         Scanner keyboard = new Scanner(System.in);
         System.out.println("1 or 2 players?");
         String players = keyboard.nextLine();

         String selectedWord;

         if (players.equals("1")) {

         
            // SINGLE PLAYER WORD FROM FILE LOGIC 

            Scanner scanner = new Scanner(new File("/home/proxyl/Documents/java_basics/hangman/words.txt"));
            
            // This is how you declare a list
            List<String> words = new ArrayList<>();
            


            while (scanner.hasNext()) {
                // This is how you append items to a list
                words.add(scanner.nextLine());
            }

            Random rand = new Random();

            selectedWord = words.get(rand.nextInt(words.size()));
    }

    else {
        System.out.println("Player 1, please enter your word:");
        selectedWord = keyboard.nextLine();
        // There is no way found for how to conceal the content
        // Instead we prind a bunch of new lines 
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Player 2 is ready to guess. Good luck!");
    }
       
    
        // STORE THE WORD AS HYPHENS LOGIC 

        // This is how you declare a list of characters !NOT strings
        List<Character> playerGueses = new ArrayList<>();
    

        
        int wrongCount = 0;

        while(true) {

            printHangedMan(wrongCount);

            // There are 6 moves until a player loses
            if(wrongCount >= 6) {
                System.out.println("The word was: "+ selectedWord);
                System.out.println("Your lose!");
                break;
            }

            // Also print the current state of the game each iteration
            printWordState(selectedWord, playerGueses);
            
            // Make it loop until the player loses or wins
            // But also increment the wrongcount in case player is wrong
            if (!getPlayerGuess(keyboard, selectedWord, playerGueses)){
                wrongCount++;
            }
        

            if (printWordState(selectedWord, playerGueses)) {
                System.out.println("You won!");
                break;
            }

            System.out.println("Please enter your guess for the entire word: ");
            if (keyboard.nextLine().equals(selectedWord)){
                System.out.println("You won!");
                break;
            } 
            else {
                System.out.println("That is not the correct word! Try again!");
            }
        }
        
    }

    private static void printHangedMan(int wrongCount) {
        System.out.println(" ------");
        System.out.println(" |    |");

        if (wrongCount >= 1) {
            System.out.println(" O");
        }
        if (wrongCount >= 2) {
            System.out.print("\\ ");
            if (wrongCount >= 3) {
                System.out.print("/");
            }
            else {
                System.out.println("");
            }
        }

        if (wrongCount >= 4) {
            System.out.println("");
            System.out.println(" |");
            
        }
        if (wrongCount >= 5) {
            System.out.print("/ ");
            if (wrongCount >= 6) {
                System.out.print("\\");
            }
            else {
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("");
    }

    private static boolean getPlayerGuess(Scanner keyboard, String selectedWord, List<Character> playerGueses) {
        System.out.println("Please enter a letter: ");
        String letterGuess = keyboard.nextLine();
        // Take only the first letter of whatever the user inputs
        // In order to prevent cheats or error.

        playerGueses.add(letterGuess.charAt(0));   

        return selectedWord.contains(letterGuess);
    }

    private static boolean printWordState(String selectedWord, List<Character> playerGueses) {
        // CTRL + . will export any chunk of code to a separate method
        // And also inserts the import in the method above. 
        int correctCount =0;

        for(int i = 0; i < selectedWord.length (); i++) {
            if(playerGueses.contains(selectedWord.charAt(i))) {
                // This is how you check item at index in Array.
                System.out.print(selectedWord.charAt(i));
                correctCount++;
            }
            else {
                
                System.out.print("_ ");
            }
        }
        System.out.println();

        return(selectedWord.length() == correctCount);
    }
}
