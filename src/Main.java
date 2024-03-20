import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        ReadFile fileReader = new ReadFile();
        try {
        List<Product> products = fileReader.readProduct("C:\\Users\\singh\\eclipse-workspace\\CP317_Assignment\\src\\ProductFile.txt");
        List<Supplier> suppliers = fileReader.readSupplier("C:\\Users\\singh\\eclipse-workspace\\CP317_Assignment\\src\\SupplierFile.txt");

        FormatData dataFormatter = new FormatData();
        List<Inventory> formattedInventory = dataFormatter.formatInventory(products, suppliers);
        
        FileWrite fileWriter = new FileWrite();
        fileWriter.writeToFile(formattedInventory, "C:\\Users\\singh\\eclipse-workspace\\CP317_Assignment\\src\\InventoryFile.txt");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}