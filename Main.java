import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("I have chosen a number between " + minRange + " and " + maxRange + ".");
        System.out.println("Try to guess it in " + maxAttempts + " attempts or fewer.");

        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt #" + attempt + ": Enter your guess: ");
            int userGuess = sc.nextInt();

            if (userGuess < targetNumber) {
                System.out.println("Higher Number!");
            } else if (userGuess > targetNumber) {
                System.out.println("Lower number!");
            } else {
                System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempt + " attempts.");
                score = maxAttempts - attempt + 1;
                break;
            }
        }

        if (score > 0) {
            System.out.println("Your score: " + score);
        } else {
            System.out.println("Sorry, you couldn't guess the number. The correct number was " + targetNumber + ".");
        }

        sc.close();
    }
}
