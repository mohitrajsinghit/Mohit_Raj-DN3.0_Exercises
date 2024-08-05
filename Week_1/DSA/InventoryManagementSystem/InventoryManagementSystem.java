import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {
    private Map<String, Product> inventory;

    public InventoryManagementSystem() {
        this.inventory = new HashMap<>();
    }

    // Add your products here
    public void add_Product(Product product) {
        inventory.put(product.getProduct_Id(), product);
    }

    // Update your product here
    public void update_Product(String product_id, String new_name, int new_quantity, double new_price) {
        Product product = inventory.get(product_id);
        if (product != null) {
            product.setProduct_Name(new_name);
            product.setQuantity(new_quantity);
            product.setPrice(new_price);
        }
    }

    // Delete your product here
    public void delete_Product(String product_id) {
        inventory.remove(product_id);
    }

    // Get your product here
    public Product get_Product(String product_id) {
        return inventory.get(product_id);
    }

    // Print here
    public void print_Inventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        Product product1 = new Product("101", "CLRS Book", 15, 1524.0);
        Product product2 = new Product("102", "Java Book", 25, 750.0);

        ims.add_Product(product1);
        ims.add_Product(product2);

        System.out.println("\nInventory after adding products:");
        ims.print_Inventory();

        ims.update_Product("101", "Updated CLRS Book", 20, 1500.0);
        System.out.println("\nInventory after updating product 101:");
        ims.print_Inventory();

        ims.delete_Product("102");
        System.out.println("\nInventory after deleting product 102:");
        ims.print_Inventory();
    }
}
