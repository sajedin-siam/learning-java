import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;
        double compoundInterest;

        System.out.print("Enetr the principal amount: ");
        principal = input.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = input.nextDouble();

        System.out.print("Enter the # of time compounded per year: ");
        timesCompounded = input.nextInt();

        System.out.print("Enter the # of year : ");
        years = input.nextInt();

        amount = principal * Math.pow(1 + (rate / 100.0) / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is: $%.2f\n", years, amount);

        compoundInterest = amount - principal;
        System.out.printf("Total compound interest: $%.2f\n", compoundInterest);

        input.close();
    }
}
