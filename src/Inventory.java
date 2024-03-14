public class Inventory {
    private int productId;
    private String productName;
    private int quantity;
    private double price;
    private char status;
    private String supplierName;

    public Inventory() {
        // Default constructor
    }
    
    public Inventory(int productId, String productName, int quantity, double price, char status, String supplierName) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
        this.supplierName = supplierName;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public char getStatus() {
        return status;
    }

    public String getsupplierName() {
        return supplierName;
    }

    // Setters
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void setsupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
}