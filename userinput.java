import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        
    
    Scanner input=new Scanner(System.in);
    //string
    System.out.print("Enter your name:");
    String name=input.nextLine();

    //interger
    System.out.print("Enter your age:");
    String age=input.nextLine();

    //Bouble
    System.out.print("Enter your GPA:");
    String gpa=input.nextLine();

    System.out.println("\nYou infornaton:");
    System.out.println("Name:"+name);
    System.out.println("Age :"+age);
    System.out.println("GPA :"+gpa);

}
}
