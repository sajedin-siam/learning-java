
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] question = {
                "Which keyword is used to create an object in Java?",
                "What is the index of the first element in an array?",
                "Which loop is guaranteed to run at least once?",
                "Which data type stores true or false?"
        };

        String[][] option = {
                { "new", "create", "make", "object" },
                { "1", "0", "-1", "2" },
                { "for", "while", "do-while", "foreach" },
                { "int", "String", "char", "boolean" }
        };

        int[] answer = { 1, 2, 3, 4 };

        int guess;
        int score = 0;

        System.out.println("*****************************");
        System.out.println("       Welcome to QUIZ");
        System.out.println("*****************************");

        // Question loop
        for (int i = 0; i < question.length; i++) {

            System.out.println("\nQ" + (i + 1) + ". " + question[i]);

            // Option loop
            for (int j = 0; j < option[i].length; j++) {

                System.out.println((j + 1) + ". " + option[i][j]);
            }

            System.out.print("Your answer (1-4): ");
            guess = input.nextInt();

            // Check answer
            if (guess == answer[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: "
                        + option[i][answer[i] - 1]);
            }
        }

        System.out.println("\n*****************************");
        System.out.println("Final Score: " + score + "/" + question.length);
        System.out.println("*****************************");

        input.close();
    }
}
