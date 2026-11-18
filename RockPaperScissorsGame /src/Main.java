import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };
        String playerChoice;
        String computerChoice;
        String playGame = "yes";

        do {
            System.out.print("Enter your move(rock,paper,scissors): ");
            playerChoice = input.nextLine().toLowerCase();

            if (!playerChoice.equals("rock")
                    && !playerChoice.equals("paper")
                    && !playerChoice.equals("scissors")) {
                System.out.println("Invalid Choice");
                continue;
            }
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer Choice: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors"))
                    || (playerChoice.equals("paper") && computerChoice.equals("rock"))
                    || (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("you win!");
            } else {
                System.out.println("You lose!");
            }
            System.out.println("Play Again(yes/no): ");
            playGame = input.nextLine().toLowerCase();

        } while (playGame.equals("yes"));

        System.out.println("Thanks for playing");

    }
}
