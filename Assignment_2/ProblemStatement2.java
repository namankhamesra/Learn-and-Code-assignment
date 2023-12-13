package Assignment_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class InventryManagementSystem {
    private String productName;
    private double productPrice;
    private int quantity;

    public InventryManagementSystem(String productName, double productPrice, int quantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Products {
    private List<InventryManagementSystem> inventryProducts;

    public Products() {
        this.inventryProducts = new ArrayList<>();
    }

    public void addProduct(InventryManagementSystem product) {
        inventryProducts.add(product);
    }

    public List<InventryManagementSystem> getInventryProducts() {
        return inventryProducts;
    }
}

public class ProblemStatement2 {
    public static void main(String[] p) {
        Products availableProducts = new Products();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nInv Mgmt System");
            System.out.println("1. Add Prod");
            System.out.println("2. Display Inv");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter prod name: ");
                    String productName = input.next();
                    System.out.print("Enter prod price: ");
                    double productPrice = input.nextDouble();
                    System.out.print("Enter prod qty: ");
                    int quantity = input.nextInt();

                    InventryManagementSystem product = new InventryManagementSystem(productName, productPrice, quantity);
                    q.addProduct(product);

                    System.out.println("Prod added successfully!");
                    break;

                case 2:
                    System.out.println("\nCurrent Inv:");
                    List<InventryManagementSystem> inventryProducts = availableProducts.getInventryProducts();
                    for (InventryManagementSystem item : inventryProducts) {
                        System.out.println("Name: " + item.getProductName() +
                                ", Price: $" + item.getProductPrice() +
                                ", Quantity: " + item.getQuantity());
                    }
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}