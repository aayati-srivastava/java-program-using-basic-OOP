import java.util.Scanner;

public class OrderOOP {
    private int orderId;
    private String item;
    private double price;
    private int quantity;
    
    public OrderOOP(int orderId, String item, double price, int quantity) {
        this.orderId = orderId;
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }
    
    public double getTotal() {
        return price * quantity;
    }
    
    public int getOrderId() {
        return orderId;
    }
    
    public String getItem() {
        return item;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
}

class OOPOrderProcessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of orders: ");
        int n = input.nextInt();
        OrderOOP[] orders = new OrderOOP[n];
        System.out.println("\n-- Enter Order Details --");
        // Rest of your processing code would go here
    }
}