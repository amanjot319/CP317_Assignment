public class Product extends Object{
    private int productId;
    private String productName;
    private String description;
    private double price;
    private int quantity;
    private char status;
    private int supplierId;


    public Product() {
        // Default constructor
    }

    public Product(int productId, String productName, String description, double price, int quantity, char status, int supplierId) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
        this.supplierId = supplierId;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public char getStatus() {
        return status;
    }

    public int getSupplierId() {
        return supplierId;
    }

    // Setters
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }
}