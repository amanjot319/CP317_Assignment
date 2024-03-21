import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        ReadFile fileReader = new ReadFile();
        
        try {
	        List<Product> products = fileReader.readData("C:\\Users\\singh\\eclipse-workspace\\CP317_Assignment\\src\\ProductFile.txt", Product.class);
	        List<Supplier> suppliers = fileReader.readData("C:\\Users\\singh\\eclipse-workspace\\CP317_Assignment\\src\\SupplierFile.txt", Supplier.class);
	
	        FormatData dataFormatter = new FormatData();
	        List<Inventory> formattedInventory = dataFormatter.formatInventory(products, suppliers);
	        
	        FileWrite fileWriter = new FileWrite();
	        fileWriter.writeToFile(formattedInventory, "C:\\Users\\singh\\eclipse-workspace\\CP317_Assignment\\src\\InventoryFile.txt");
	        System.out.println("Data written in InventoryFile.txt");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}