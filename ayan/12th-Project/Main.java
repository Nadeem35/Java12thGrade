// package guessnumber;
import java.util.*;
/**
 *
 * @author ankit
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int attempt = 1;
        int guessedNumberByUser;
        int expectedNumber = (int) (Math.random() * 99 + 1);
        
        // System.out.println(expectedNumber);
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Number guessing Game \nYou Will Be Asked To Guess A Number To Win The Game \nYou have Maximum 5 Attemp Limit");
        do {
            System.out.print("Enter a guess number between 1 to 100\n");
            if(userInput.hasNextInt()) {
                guessedNumberByUser = userInput.nextInt();
                if (guessedNumberByUser == expectedNumber)
                {
                    System.out.println("Your Number is right. You Win the Game!");
                    break;
                }
                else if (guessedNumberByUser < expectedNumber)
                    System.out.println("Your Guess Number is Smaller.");
                else if (guessedNumberByUser > expectedNumber)
                    System.out.println("Your Guess Number is Greater.");
                if(attempt == 5) {
                    System.out.println("You have exceeded the maximum. \nThe correct number was:" +expectedNumber );
                    break;
                }
                attempt++;
            }   else {
                System.out.println("Guessed number is not valid integer");
                break;
            }
        } while (guessedNumberByUser != expectedNumber);
    }
}
 
    
    