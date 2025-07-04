/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Dao.ProfileDAO;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.User;
import view.saveProfile;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
//import javax.swing.myImageIcon;
import javax.swing.JOptionPane;
import model.Profile;

/**
 *
 * @author suyas
 */
public class ProfileController {
    private saveProfile view;
    private ProfileDAO profileDAO;

    public ProfileController(saveProfile view) {
        this.view = view;
        this.profileDAO = new ProfileDAO();
        loadUserData();
        view.AddSaveListener(new SaveListener());
    }

    private void loadUserData() {
        Profile user = profileDAO.fetchUser();
        if (user != null) {
            view.getUsernameField().setText(user.getUsername());
            view.getEmailField().setText(user.getEmail());
            view.getPhoneField().setText(user.getPhone());
            view.getDOBField().setText(user.getDob());

            view.updateProfileDisplay(user.getUsername(), user.getPhotoPath());
        }
    }


    class SaveListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                saveUserData();

            } catch (SQLException ex) {
                Logger.getLogger(ProfileController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }


     public void loadUserData() {
        Profile user = profileDAO.fetchUser();
        if (user != null) {
            view.getUsernameField().setText(user.getUsername());
            view.getEmailField().setText(user.getEmail());
            view.getPhoneField().setText(user.getPhone());
            view.getDOBField().setText(user.getDob());

            view.updateProfileDisplay(user.getUsername(), user.getPhotoPath());
        }
    }

    private void saveUserData() throws SQLException {
        String username = view.getUsernameField().getText();
        String email = view.getEmailField().getText();
        String phone = view.getPhoneField().getText();
        String dob = view.getDOBField().getText();
        String photoPath = view.getCurrentPhotoPath();  // You need to set this in view after choosing image

        Profile user = new Profile(username, email, phone, dob, photoPath);
        profileDAO.saveOrUpdateUser(user);

        // Update the display
        view.updateProfileDisplay(username, photoPath);
    }
    }
}


        
    
    
    

    

