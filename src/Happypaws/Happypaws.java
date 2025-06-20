/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Happypaws;
import Controller.SignupController;
import Controller.AdminDashboardController;
import database.*;
import view.Signup;
import view.Login;
import Controller.LoginController;
import view.AdminDashboard;

/**
 *
 
 */
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
//        controller.open();

        AdminDashboard admin = new AdminDashboard();
        AdminDashboardController controller = new AdminDashboardController(admin);
        controller.open();
        

        
    }
}
