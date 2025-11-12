import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("🎮 Welcome to Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        
        // Generate random number between 1-100
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 7;
        
        System.out.println("You have " + maxAttempts + " attempts to guess it!");
        
        while (attempts < maxAttempts) {
            System.out.print("\nEnter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess == secretNumber) {
                System.out.println("🎉 CONGRATULATIONS! You guessed it in " + attempts + " attempts!");
                break;
            } else if (userGuess < secretNumber) {
                System.out.println("📈 Too low! Try higher.");
            } else {
                System.out.println("📉 Too high! Try lower.");
            }
            
            // Show remaining attempts
            int remaining = maxAttempts - attempts;
            System.out.println("Attempts left: " + remaining);
        }
        
        // If player runs out of attempts
        if (attempts == maxAttempts) {
            System.out.println("\n💔 Game Over! The number was: " + secretNumber);
        }
        
        scanner.close();
        System.out.println("\nThanks for playing! 👋");
    }
}