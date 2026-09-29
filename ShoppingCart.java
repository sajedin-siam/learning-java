
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        double total;

        System.out.print("Enetr your item name:");
        item = input.nextLine();

        System.out.print("Enter the price:");
        price= input.nextDouble();


        System.out.print("Enter The Quantity:");
        quantity=input.nextInt();

        total=price*quantity;

        System.out.println("\n Shopping Cart\n");
        System.out.println("Item: "+item);
        System.out.println("Price: "+price+"$");
        System.out.println("Quantity: "+quantity);
        System.out.println("Total: "+total+"$");
        
        input.close();
   }
    
}
