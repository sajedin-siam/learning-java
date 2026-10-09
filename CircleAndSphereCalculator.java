import java.util.Scanner;

//circumference=2*Math.PI.radius;
//area = Math.PI*Math.pow(radius,2);
//valume=(4.0/3.0)*Math.PI*Math.Pow(radius,3);
public class Radious {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = input.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The circumference is : " + circumference + "cm");
        System.out.println("The Area is : " + area + "cm^2");
        System.out.println("The volume is : " + volume + "cm^3");

        input.close();
    }
}
