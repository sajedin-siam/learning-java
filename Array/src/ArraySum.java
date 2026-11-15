import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter array Size: ");
        int size = input.nextInt();

        int[] num = new int[size];
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter element" + (i + 1) + ":");
            num[i] = input.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("Sum of all element :" + sum);
        input.close();
    }
}
