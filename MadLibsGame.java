
import java.util.Scanner;

public class MadLibsGame {

    public static void main(String[] args) {
        String place;
        String adjective;
        String animal;
        String verb;
        String noun;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a place:");
        place = input.nextLine();
        System.out.print("Enter an Adjective:");
        adjective = input.nextLine();
        System.out.print("Enetr an animal:");
        animal = input.nextLine();

        System.out.print("Enter a verb:");
        verb = input.nextLine();

        System.out.print("Enter a noun:");
        noun = input.nextLine();

        System.out.println("\nToday I went to the " + place + " and saw a creaz " + adjective + "" + animal + "." +"\nIt started " + verb + "with my " + noun + ".");

        input.close();



    }
}
