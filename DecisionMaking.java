import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        int num=30;
        //if statment
        if(num>0){
            System.out.println("The number is positive");
        }
        //if-else statment
        if(num%2==0){
            System.out.println("the number is even");
        }else{
            System.out.println("The number is odd");
        }
        //if-else if
        
        if(num<0){
            System.out.println("the number is negative ");
        }
        else if (num==0) {
            System.out.println("the number is zero");
        }
        else{
            System.out.println("The number is positive");
        }
        //switch statment
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Day: ");
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thrusday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                throw new AssertionError();
        }
    }
}
