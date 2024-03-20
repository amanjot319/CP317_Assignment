import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public List<Product> readProduct(String filePath) throws Exception {
        List<Product> products = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length == 7) {
                	try {
                		int productId = Integer.parseInt(parts[0]);
                        String productName = parts[1];
                        String description = parts[2];
                        double price = Double.parseDouble(parts[3].substring(1)); // Removes "$" Symbol from price
                        int quantity = Integer.parseInt(parts[4]);
                        char status = parts[5].charAt(0);
                        int supplierId = Integer.parseInt(parts[6]);
                        
                        Product product = new Product(productId, productName, description, price, quantity, status, supplierId);
                        products.add(product);
                	}
                	catch (NumberFormatException | ArrayIndexOutOfBoundsException e){
                		throw new Exception("Error parsing supplier data: " + e.getMessage(), e);
                	}
                }
                else {
                	throw new Exception("Invalid number of product data variables: " + line);
                }
                
            }
        } catch (IOException e) {
        	throw new Exception("Error reading file: " + e.getMessage(), e);
        }
        return products;
    }

    public List<Supplier> readSupplier(String filePath) throws Exception{
        List<Supplier> suppliers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length == 5) {
                	try {
                		int supplierId = Integer.parseInt(parts[0]);
                        String supplierName = parts[1];
                        String address = parts[2];
                        String phoneNumber = parts[3];
                        String email = parts[4];
                        Supplier supplier = new Supplier(supplierId, supplierName, address, phoneNumber, email);
                        suppliers.add(supplier);
                        
                	}
                	catch (NumberFormatException | ArrayIndexOutOfBoundsException e){
                		throw new Exception("Error parsing supplier data: " + e.getMessage(), e);
                	}
                }
                else {
                	throw new Exception("Invalid number of supplier data variables: " + line);
                }
            }
        }
        catch (IOException e) {
        	throw new Exception("Error reading file: " + e.getMessage(), e);
        }
        return suppliers;
    }
}