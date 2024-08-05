package EcommercePlatform;

public class ECommerceSearch {
    public static void main(String[] args) {
        Product[] products = {
            new Product("001", "iPhone 13", "Electronics"),
            new Product("002", "MacBook Pro", "Electronics"),
            new Product("003", "Samsung Galaxy S21", "Electronics"),
            new Product("004", "Sony WH-1000XM4", "Accessories"),
            new Product("005", "Kindle Paperwhite", "Books"),
            new Product("006", "Nike Air Max", "Fashion"),
            new Product("007", "Adidas Ultraboost", "Fashion"),
            new Product("008", "Apple Watch Series 6", "Accessories"),
            new Product("009", "Dell XPS 13", "Electronics"),
            new Product("010", "Amazon Echo", "Smart Home"),
            new Product("011", "Google Nest Hub", "Smart Home"),
            new Product("012", "Harry Potter Box Set", "Books"),
            new Product("013", "Logitech MX Master 3", "Accessories"),
            new Product("014", "Bose QuietComfort 35 II", "Accessories"),
            new Product("015", "The Lean Startup", "Books")
        };

        System.out.println("Linear Search:");
        Product result1 = LinearSearch.linearSearch(products, "015");
        System.out.println(result1 != null ? "Found: " + result1 : "Not Found");

        System.out.println("\nBinary Search:");
        Product result2 = BinarySearch.binarySearch(products, "015");
        System.out.println(result2 != null ? "Found: " + result2 : "Not Found");
    }
}
