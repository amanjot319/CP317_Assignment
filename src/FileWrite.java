import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWrite {
    public void writeToFile(List<Inventory> formattedInventory, String outputPath) throws Exception{
    	if (formattedInventory == null) {
            System.out.println("Inventory list is empty. Nothing to write.");
            return;
        }

        if (outputPath == null) {
            System.out.println("Output path is null. Cannot write to file.");
            return;
        }
        
    	try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));

            for (Inventory inventory : formattedInventory) {
            	writer.write(inventory.getProductId() + ", " + inventory.getProductName() + ", " + inventory.getQuantity() 
            	+ ", " + "$" + inventory.getPrice() + ", " + inventory.getStatus() + ", " + inventory.getsupplierName());
            	writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            throw new Exception("Error reading file: " + e.getMessage(), e);
        }
    }
}