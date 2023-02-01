import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ConditionalGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        System.out.println("Welcome to  the Guessing Game!, Please enter a number");
        int guess = scanner.nextInt();


        if (guess == randomNumber) {
            System.out.println("Correct! Aren't you lucky.");
        } else {
            System.out.println("One more try!");
            guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Correct! About time.");
            } else {
                System.out.println("Wrong again!");
            }
        }
    }
}