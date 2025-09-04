import java.util.Scanner;
class Order {
    String productName;
    int quantity;
    double pricePerItem;

    public Order(String pName, int qty, double price) {
        productName = pName;
        quantity = qty;
        pricePerItem = price;
    }
    public double getTotalPrice() {
        return quantity * pricePerItem;
    }
}
public class OrderOOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalPrice = 0.0;

        System.out.print("Enter number of orders today: ");
        int numberOfOrders = input.nextInt();
        input.nextLine(); 

        for (int i = 1; i <= numberOfOrders; i++) {
            System.out.println("Order #" + i);

            System.out.print("Enter product name: ");
            String productName = input.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();

            System.out.print("Enter price per item: ");
            double pricePerItem = input.nextDouble();
            input.nextLine(); 
            
            Order order = new Order(productName, quantity, pricePerItem);

            totalPrice += order.getTotalPrice();
        }
        System.out.printf("Total price of all orders: Rs.%.2f\n", totalPrice);
        input.close();
    }
}