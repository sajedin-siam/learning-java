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
            {"new", "class", "this", "static"},
            {"1", "0", "-1", "2"},
            {"for", "while", "do-while", "enhanced for"},
            {"int", "boolean", "String", "char"}
        };

        int[] answer = {1, 2, 3, 2};
        int score = 0;

        System.out.println("===== JAVA QUIZ GAME =====");

        for (int i = 0; i < question.length; i++) {
            System.out.println("\n" + (i + 1) + ". " + question[i]);

            for (int j = 0; j < option[i].length; j++) {
                System.out.println((j + 1) + ". " + option[i][j]);
            }

            System.out.print("Enter your answer (1-4): ");
            int userAnswer = input.nextInt();

            if (userAnswer == answer[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("\n===== QUIZ RESULT =====");
        System.out.println("Your Score: " + score + "/" + question.length);

        input.close();
    }
}
