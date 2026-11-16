import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        System.out.println("Even number count :" + even);
        System.out.println("ODD number count :" + odd);
    }
}
