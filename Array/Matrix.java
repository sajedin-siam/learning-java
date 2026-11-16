import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] num = new int[3][3];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.print("Enetr value for [" + i + "][" + j + "]: ");
                num[i][j] = input.nextInt();
            }

        }

        System.out.println("your 2D array:");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();

        }
        input.close();

    }
}
