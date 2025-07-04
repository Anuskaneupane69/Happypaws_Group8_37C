package Dao;
import database.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.AdoptionModel;
public class AdoptionDao {
    MySqlConnection mysql = new MySqlConnection();
    // Method to create a new adoption record
    public void createAdoption(AdoptionModel adoption) {
        String sql = "INSERT INTO tbladoption (adopterName, adoptedSpecies, adoptedAge, additionalInfo, adopterContact, adoptionImg) VALUES (?, ?, ?, ?, ?, ?)";
        System.out.println("Trying to enter adoption data.");
        try (Connection conn = mysql.openConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, adoption.getAdoptname());
            pstmt.setString(2, adoption.getAdoptspecies());
            pstmt.setInt(3, adoption.getAdoptage());
            pstmt.setString(4, adoption.getAdoptinfo());
            pstmt.setString(5, adoption.getAdoptno());
            pstmt.setString(6, adoption.getAdoptionImg()); // Set the adoption image path
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Method to retrieve all adoptions
    public List<AdoptionModel> getAllAdoptions() {
        System.out.println("Getting all adoptions.");
        List<AdoptionModel> adoptions = new ArrayList<>();
        String sql = "SELECT * FROM tbladoption"; // Update with actual table name
        try (Connection conn = mysql.openConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                AdoptionModel adoption = new AdoptionModel(
                    rs.getString("adopterName"),
                    rs.getString("adoptedSpecies"),
                    rs.getInt("adoptedAge"),
                    rs.getString("additionalInfo"),
                    rs.getString("adopterContact"),
                    rs.getString("adoptionImg") // Get the adoption image path from the database
                );
                adoptions.add(adoption);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return adoptions;
    }
    // Method to update an existing adoption record
    public void updateAdoption(AdoptionModel adoption) {
        String sql = "UPDATE tbladoption SET adopterName=?, adoptedSpecies=?, adoptedAge=?, additionalInfo=?, adoptionImg=? WHERE adopterContact=?";
        try (Connection conn = mysql.openConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, adoption.getAdoptname());
            pstmt.setString(2, adoption.getAdoptspecies());
            pstmt.setInt(3, adoption.getAdoptage());
            pstmt.setString(4, adoption.getAdoptinfo());
            pstmt.setString(5, adoption.getAdoptionImg()); // Update the adoption image path
            pstmt.setString(6, adoption.getAdoptno()); // Assuming contact number is the identifier for updating
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
