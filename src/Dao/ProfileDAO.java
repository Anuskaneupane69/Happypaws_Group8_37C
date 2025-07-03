/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import database.DatabaseConnection;
import model.Profile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author suyas
 */
public class ProfileDAO {
     public void saveProfile(Profile profile) throws SQLException {
        String sql = "INSERT INTO users (username, email, phone, dob, photo_path) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, profile.getUsername());
            stmt.setString(2, profile.getEmail());
            stmt.setString(3, profile.getPhone());
            stmt.setString(4, profile.getDob());
            stmt.setString(5, profile.getPhotoPath());
            stmt.executeUpdate();
        }
    }

    public Profile getProfileByUsername(String username) throws SQLException {
        String sql = "SELECT * FROM users WHERE username = ? ORDER BY id DESC LIMIT 1";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Profile profile = new Profile();
                profile.setId(rs.getInt("id"));
                profile.setUsername(rs.getString("username"));
                profile.setEmail(rs.getString("email"));
                profile.setPhone(rs.getString("phone"));
                profile.setDob(rs.getString("dob"));
                profile.setPhotoPath(rs.getString("photo_path"));
                return profile;
            }
            return null;
        }
    }
}
    

