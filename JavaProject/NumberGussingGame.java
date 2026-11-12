
import java.util.Random;
import java.util.Scanner;

public class NumberGussingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int guess;
        int attempts = 0;
        int max = 100;
        int min = 1;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n:", min, max);

        do {
            System.out.print("Enter a guess:");
            guess = input.nextInt();
            attempts++;
            if (guess < randomNumber) {
                System.out.println("too low ! the number was :" + randomNumber);
            } else if (guess > randomNumber) {
                System.out.println("Too high! The number was:" + randomNumber);
            } else {
                System.out.printf("Congress! you gurss correct number" + randomNumber);
                System.out.println("#Numbwe are attempts" + attempts);
            }

        } while (guess != randomNumber);

        input.close();

    }
}
