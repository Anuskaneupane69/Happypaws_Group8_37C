/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Happypaws;
import Controller.AccessoriesController;
import Controller.AdoptionController;
import Controller.SignupController;
import Controller.ProductController;
import database.*;
import view.Signup;
import view.Login;
import Controller.LoginController;
import Controller.AdoptionController;
import view.AdminDashboard;
import view.Accessories;
import view.AdoptionModule;
import view.Dashboard;
import view.ProductCard;


public class Happypaws {
    public static void main(String[] args) {
        Database db = new MySqlConnection();
        if(db.openConnection() != null){
            System.out.println("Database connected Sucessfully");
        }else{
            System.out.println("Failed to connect to database");
        }
        
//        Signup myprojform = new Signup();
//        myprojform.setVisible(true);
//        SignupController controller = new SignupController(myprojform);
        
        
       
Dashboard dash = new Dashboard();
dash.open();


//        AdminDashboard admin = new AdminDashboard();
//        admin.setVisible(true);
        
//    Accessories admin = new Accessories();
//    AccessoriesController controller1 = new AccessoriesController(admin);
//        controller1.open();
//
//            AdoptionModule accessoriesView = new AdoptionModule(); // Create the Accessories view
//            AdoptionController controller2 = new AdoptionController(accessoriesView); // Create the controller
//            controller2.open(); // Open the view

        
    }
}
