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

//    public void saveProfile(String username, String email, String phone, String dob, String photoPath) {
//        try {
//            Profile profile = new Profile(username, email, phone, dob, photoPath);
//            profileDAO.saveProfile(profile);
//            // Update the view with the saved data
//            view.updateProfileDisplay(username, photoPath);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            // Handle error (e.g., show error message in view)
//            JOptionPane.showMessageDialog(view,"Error saving profile: " + e.getMessage());
//        }
//    }
//
//    public void loadUserProfile(String username) {
//        try {
//            Profile profile = profileDAO.getProfileByUsername(username);
//            if (profile != null) {
//                view.updateProfileDisplay(profile.getUsername(), profile.getPhotoPath());
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(view,"Error loading profile: " + e.getMessage());
//        }
//    }
    
    class SaveListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                saveUserData();
//            public void saveProfile(String username, String email, String phone, String dob, String photoPath) {
//        try {
//            Profile profile = new Profile(username, email, phone, dob, photoPath);
//            profileDAO.saveProfile(profile);
//            // Update the view with the saved data
//            view.updateProfileDisplay(username, photoPath);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            // Handle error (e.g., show error message in view)
//            JOptionPane.showMessageDialog(view,"Error saving profile: " + e.getMessage());
//        }
//    }
//
//    public void loadUserProfile(String username) {
//        try {
//            Profile profile = profileDAO.getProfileByUsername(username);
//            if (profile != null) {
//                view.updateProfileDisplay(profile.getUsername(), profile.getPhotoPath());
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(view,"Error loading profile: " + e.getMessage());
//        }
//    }
//        }
//      String username = view.jUsername.getText().trim();
//            String email = view.jEmail.getText().trim();
//            String phone = view.jPhone.getText().trim();
//            String dob = view.jDOB.getText().trim();
//            String photoPath = view.currentPhotoPath; // Assuming currentPhotoPath is added to saveProfile
//
//            // Basic validation
//            if (username.isEmpty() || email.isEmpty() || phone.isEmpty() || dob.isEmpty()) {
//                showError("All fields are required!");
//                return;
//            }
//
//            // Create User object
//            Profile user = new Profile(username, email, phone, dob, photoPath);
//            // Save to database
//            ProfileDAO.saveUser(user);
//            // Update view
//            updateProfileDisplay(username, photoPath);
//            // Clear input fields
//            view.jUsername.setText("Enter User Name");
//            view.jEmail.setText("        Enter Email id");
//            view.jPhone.setText("      Enter 10 digit Number");
//            view.jDOB.setText("      DD / MM / YYYY");
//            JOptionPane.showMessageDialog(view, "Profile saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
//        }
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


        
    
    
    

    

