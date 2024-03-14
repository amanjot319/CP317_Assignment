import java.util.ArrayList;
import java.util.List;


public class FormatData {

	public List<Inventory> formatInventory(List<Product> products, List<Supplier> suppliers) {
		List<Inventory> formattedInventory = new ArrayList<>();

	    for (int i = 0; i < products.size(); i++) {
	        Product product = products.get(i);
	        Supplier supplier = findSupplier(product.getSupplierId(), suppliers);
	        if (supplier != null) {
	            Inventory inventory = new Inventory(product.getProductId(), product.getProductName(), product.getQuantity(), product.getPrice(), product.getStatus(), supplier.getSupplierName());
	            formattedInventory.add(inventory);
	        }
	    }
	    return formattedInventory;
	}

	private Supplier findSupplier(int supplierId, List<Supplier> suppliers) {
	    for (int i = 0; i < suppliers.size(); i++) {
	        Supplier supplier = suppliers.get(i);
	        if (supplier.getSupplierId() == supplierId) {
	            return supplier;
	        }
	    }
	    return null;
	}

	
}