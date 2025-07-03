/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Dao.ProfileDAO;
import dao.UserDAO;
import model.User;
import view.saveProfile;
import java.sql.SQLException;
import javax.swing.ImageIcon;

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
    }

    public void saveProfile(String username, String email, String phone, String dob, String photoPath) {
        try {
            Profile profile = new Profile(username, email, phone, dob, photoPath);
            profileDAO.saveProfile(profile);
            // Update the view with the saved data
            view.updateProfileDisplay(username, photoPath);
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle error (e.g., show error message in view)
            view.showError("Error saving profile: " + e.getMessage());
        }
    }

    public void loadUserProfile(String username) {
        try {
            Profile profile = profileDAO.getProfileByUsername(username);
            if (profile != null) {
                view.updateProfileDisplay(profile.getUsername(), profile.getPhotoPath());
            }
        } catch (SQLException e) {
            e.printStackTrace();
            view.showError("Error loading profile: " + e.getMessage());
        }
    }
}
    

