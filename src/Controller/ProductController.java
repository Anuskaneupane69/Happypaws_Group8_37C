// package Controller;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.util.ArrayList;
// import model.ProductModel; // Import your ProductModel
// import model.AdoptionModel; // Import your AdoptionModel
// import view.ProductFrame; // Import your ProductFrame
// import view.AddAdoption; // Import your AdoptionFrame
// //
//  // This class serves as the controller for managing the product dashboard and the adoption process.
//  //
// public class ProductController {
//     private ProductFrame view; // Reference to the ProductFrame
//     private ArrayList<ProductModel> productList = new ArrayList<>(); // List of products
//     // Constructor for ProductController
//     public ProductController(ProductFrame view) {
//         System.out.println("Attaching listener for Product Dashboard.");
//         this.view = view;
//         this.view.SavebtnListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 handleProductSave();
//             }
//         });
//     }
//     // Method to handle saving a product
//     private void handleProductSave() {
//         System.out.println("Product save button has been clicked");
//         try {
//             String name = view.ProductnameField().getText();
//             String imagePath = view.getSelectedImagePath();
//             int price = Integer.parseInt(view.ProductpriceField().getText());
//             int rating = Integer.parseInt(view.ProductratingField().getText());
//             int id = Integer.parseInt(view.ProductidField().getText());
//             ProductModel product = new ProductModel(name, imagePath, price, rating, id);
//             productList.add(product);
//             System.out.println("Product saved: " + name);
//         } catch (NumberFormatException ex) {
//             System.out.println("Error: Please enter valid numbers.");
//         }
//     }
//     public ArrayList<ProductModel> getProductList() {
//         return productList;
//     }
//     // Nested class for AdoptionController
//     public class AdoptionController {
//         private AddAdoption view; // Reference to the AdoptionFrame
//         private ArrayList<AdoptionModel> adoptionList = new ArrayList<>(); // List of adoptions
//         // Constructor for AdoptionController
//         public AdoptionController(AddAdoption view) {
//             System.out.println("Attaching listener for Adoption.");
//             this.view = view;
//             this.view.AdoptBtnListener(new ActionListener() {
//                 @Override
//                 public void actionPerformed(ActionEvent e) {
//                     handleAdoption();
//                 }
//             });
//         }
//         // Method to handle the adoption process
//         private void handleAdoption() {
//             System.out.println("Adoption button has been clicked");
//             try {
//                 String adopterName = view.getAdopterName();
//                 String adoptAnimalSpecies = view.getAdoptAnimalSpecies();
//                 int adoptAnimalAge = Integer.parseInt(view.getAdoptAnimalAge());
//                 String adoptDetailsInfo = view.getAdoptDetailsInfo();
//                 String adopterContactNumber = view.getAdopterContactNumber();
//                 String adoptionImagePath = view.getAdoptionImagePath();
//                 AdoptionModel adoption = new AdoptionModel(adopterName, adoptAnimalSpecies, adoptAnimalAge,
//                         adoptDetailsInfo, adopterContactNumber, adoptionImagePath);
//                 adoptionList.add(adoption);
//                 System.out.println("Adoption saved: " + adopterName);
//             } catch (NumberFormatException ex) {
//                 System.out.println("Error: Please enter valid numbers for age.");
//             } catch (NullPointerException ex) {
//                 System.out.println("Error: Some fields may be empty.");
//             }
//         }
//         public ArrayList<AdoptionModel> getAdoptionList() {
//             return adoptionList;
//         }
//     }
// }
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



   

    
