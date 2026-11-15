import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int size = input.nextInt();

        int[] num = new int[size];
        System.out.print("Enetr array element :");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }
        // sort
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    // swap
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }

            }
        }
        int min = num[0];

        // after sorted

        System.out.println("Smallest number: " + min);
        System.out.print("Smallest to largest number: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("\n");
        input.close();

    }
}
