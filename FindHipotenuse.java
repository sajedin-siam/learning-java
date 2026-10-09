import java.util.Scanner;

public class FindHipotenuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.print("Enter the length of side A: ");
        a = input.nextDouble();
        System.out.print("Enter the length of side B: ");
        b = input.nextDouble();
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse(Side C )= " + c);
        input.close();
    }
}
