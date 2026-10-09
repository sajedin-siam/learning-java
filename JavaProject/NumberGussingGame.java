
import java.util.Scanner;
public class NumberGussingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100)+1;
        int guess;
        System.out.print("Guess a number between 1 to 100:");

        guess=input.nextInt();
        if(guess==randomNumber){
            System.out.println("Congress! you gurss correct number");

        }
        else if(guess<randomNumber){
            System.out.println("too low ! the number was :"+randomNumber);
        }
        else{
            System.out.println("Too high! The number was:"+randomNumber);
        }
     input.close();

    }
}
 