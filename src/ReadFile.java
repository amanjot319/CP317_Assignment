import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public <T> List<T> readData(String filePath, Class<T> type) throws Exception {
        List<T> dataList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                try {
                    T obj = null;
                    if (type.equals(Product.class) && parts.length == 7) {
                        int productId = Integer.parseInt(parts[0]);
                        String productName = parts[1];
                        String description = parts[2];
                        double price = Double.parseDouble(parts[3].substring(1)); // Removes "$" Symbol from price
                        int quantity = Integer.parseInt(parts[4]);
                        char status = parts[5].charAt(0);
                        int supplierId = Integer.parseInt(parts[6]);

                        obj = type.cast(new Product(productId, productName, description, price, quantity, status, supplierId));
                    }
                    else if (type.equals(Supplier.class) && parts.length == 5) {
                        int supplierId = Integer.parseInt(parts[0]);
                        String supplierName = parts[1];
                        String address = parts[2];
                        String phoneNumber = parts[3];
                        String email = parts[4];
                        obj = type.cast(new Supplier(supplierId, supplierName, address, phoneNumber, email));
                    }
                    else {
                        throw new Exception("Invalid number of data variables: " + line);
                    }

                    dataList.add(obj);
                }
                catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    throw new Exception("Error parsing data: " + e.getMessage(), e);
                }
            }
        }
        catch (IOException e) {
            throw new Exception("Error reading file: " + e.getMessage(), e);
        }
        return dataList;
    }

    public List<Product> readProducts(String filePath) throws Exception {
        return (List<Product>) readData(filePath, Product.class);
    }

    public List<Supplier> readSuppliers(String filePath) throws Exception {
        return (List<Supplier>) readData(filePath, Supplier.class);
    }
    

}