
package Controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.ProductModel;
import view.ProductFrame;


/**
 *
 * @author User
 */

public class ProductController {
    private ProductFrame view;
    private ArrayList<ProductModel> productList = new ArrayList<>();
    public ProductController(ProductFrame view) {
           System.out.println("Attaching listener.");
        this.view = view;
        
        view.SavebtnListener(new SavebtnListener() 
            
//            @Override
//            public void actionPerformed(ActionEvent e) {
                
//            }
        );
    }
    
public ArrayList<ProductModel> getProductList() {
        return productList;
    }

    public void open(){
        this.view.setVisible(true);
    }

    class SavebtnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("button has been clicked");

        }
        
    }
}



   

    
