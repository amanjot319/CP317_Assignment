import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWrite {
    public void writeToFile(List<Inventory> formattedInventory, String outputPath) {
    	try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));

            for (Inventory inventory : formattedInventory) {
            	writer.write(inventory.getProductId() + ", " + inventory.getProductName() + ", " + inventory.getQuantity() 
            	+ ", " + inventory.getPrice() + ", " + inventory.getStatus() + ", " + inventory.getsupplierName());
            	writer.newLine();
            }
            writer.close();

            System.out.println("Data has been written to " + outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}