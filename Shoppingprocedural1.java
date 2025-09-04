import java.util.Scanner;

public class Shoppingprocedural1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of orders: ");
        int n = input.nextInt();
        input.nextLine(); 
        String[] items = new String[n];
        double[] prices = new double[n];
        int[] quantities = new int[n];
        System.out.println("\n--- Enter Order Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nOrder " + (i + 1) + ":");
            System.out.print("Item name: ");
            items[i] = input.nextLine();
	    System.out.print("Price: ");
            prices[i] = input.nextDouble();
	    System.out.print("Quantity: ");
            quantities[i] = input.nextInt();
            input.nextLine(); // Consume newline
        }
        double total = 0;
        for (int i = 0; i < n; i++) {
            total += prices[i] * quantities[i];
        }
        System.out.println("\n Order Summary");
        for (int i = 0; i < n; i++) {
            System.out.println("Order " + (i + 1) + ": " + items[i] +
                               " | rupees" + prices[i] + " x " + quantities[i] +
                               " = rupees" + (prices[i] * quantities[i]));
        }
        System.out.println("\nTotal price of all orders: rupees" + total);
        input.close(); 
    }
}
