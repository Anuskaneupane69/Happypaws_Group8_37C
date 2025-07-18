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
import Controller.NewCertificationController;
import view.AdminDashboard;
import view.Accessories;
import view.AdoptionModule;
import view.Dashboard;
import view.NewCertification;
import view.ProductCard;


public class Happypaws {
    public static void main(String[] args) {
        Database db = new MySqlConnection();
        if(db.openConnection() != null){
            System.out.println("Database connected Sucessfully");
        }else{
            System.out.println("Failed to connect to database");
        }

        NewCertification user = new NewCertification();
        NewCertificationController controller = new NewCertificationController(user);
        controller.open();

        
    }
}
