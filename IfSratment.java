
import java.util.Scanner;

public class IfSratment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name:");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.println("Are you a student(true/false):");
        isStudent = input.nextBoolean();

        // group 1
        if (name.isEmpty()) {
            System.out.println("You didn't enter your name");
        } else {
            System.out.println("Hello " + name + " !");
        }

        // group 2
        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age == 0) {
            System.out.println("You are a baby!");
        } else if (age < 18) {
            System.out.println("You are a child");
        } else if (age < 65) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a senior");
        }

        // group 3
        if (isStudent) {
            System.out.println("You are a student");

        } else {
            System.out.println("You are not a student");
        }

        input.close();
    }

}
