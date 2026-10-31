import java.util.Scanner;

public class enhancedSwitchTemperatureConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double temp;
        String unit;

        System.out.print("convert to celsiud or fahrenheit?(C or F): ");
        unit = input.next().toUpperCase();

        System.out.print("Enetr the temperature: ");
        temp = input.nextDouble();

        switch (unit) {
            case "C" ->
                System.out.printf("Temperature: %.1f°C%n ", (temp - 32) * 5 / 9);

            case "F" ->
                System.out.printf("Temperature: %.1f°C%n",
                        (temp * 9 / 5) + 32);

            default ->
                System.out.println("Invalid unit!");
        }
        input.close();
    }
}
