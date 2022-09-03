package Entity;

public class Product {
    
    private int productId;
    private int userId;
    private String name;
    private String category;
    private Double price;
    private int quantity;
    private String available;

    public Product(int productId, int userId, String name, String category, Double price, int quantity, String available) {
        this.productId = productId;
        this.userId = userId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.available = available;
    }

    public int getProductId() {
        return productId;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getAvailable() {
        return available;
    }
    
}
