import java.util.Scanner;

public class temperatureConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enetr the temperatre: ");
        temp = input.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = input.next().toUpperCase();
        // (Condition)?true:false

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;
        // stem.out.println(newTemp + "°" + unit);

        System.out.printf("%.1f° %s", newTemp, unit);

        input.close();

    }
}
