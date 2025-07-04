package Controller;
import Dao.ProductDao;
import java.util.List;
import model.ProductModel;
import view.Accessories; 
import view.ProductCard;
public class AccessoriesController {
    private ProductDao productDao = new ProductDao();
    private Accessories accessories;
    
    public AccessoriesController(Accessories accessories) {
        this.accessories = accessories;
        loadProducts();
    }
    private void loadProducts() {
        // Load all products and update the view

        System.out.println("load all products");
        
        List<ProductModel> products = productDao.getAllProducts();
        accessories.getProductpannelField().removeAll(); // Clear previous products
        for (ProductModel product : products) {
            ProductCard card = new ProductCard();
            card.setProduct(product); // Assume ProductCard's setProduct method sets the product data
            accessories.getProductpannelField().add(card);
        }
        accessories.getProductpannelField().revalidate();
        accessories.getProductpannelField().repaint();
    }
    public void open() {
        this.accessories.setVisible(true);
    }
  
}
    
