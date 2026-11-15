import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size:");
        int size = input.nextInt();

        int[] num = new int[size];
        System.out.print("Enter array element :");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }
        int max = num[0];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] < num[j + 1]) {
                    // swap
                    int temp = num[i];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        // after sorted
        System.out.println("Largest number: " + max);

        System.out.println("LArgest to Smallest:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        input.close();
    }
}
