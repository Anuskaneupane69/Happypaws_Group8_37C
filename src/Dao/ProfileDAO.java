/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import database.DatabaseConnection;
import database.MySqlConnection;
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
    MySqlConnection mysql= new MySqlConnection();
     public void saveOrUpdateUser(Profile profile) throws SQLException {
         Connection conn = mysql.openConnection();
        String sql = "INSERT INTO profile(username, email, phone, dob, photoPath) VALUES (?, ?, ?, ?, ?)";
        try (
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, profile.getUsername());
            stmt.setString(2, profile.getEmail());
            stmt.setString(3, profile.getPhone());
            stmt.setString(4, profile.getDob());
            stmt.setString(5, profile.getPhotoPath());
            stmt.executeUpdate();
        }
    }

//    public Profile getProfileByUsername(String username) throws SQLException {
//        String sql = "SELECT * FROM users WHERE username = ? ORDER BY id DESC LIMIT 1";
//        try (Connection conn = DatabaseConnection.getConnection();
//             PreparedStatement stmt = conn.prepareStatement(sql)) {
//            stmt.setString(1, username);
//            ResultSet rs = stmt.executeQuery();
//            if (rs.next()) {
//                Profile profile = new Profile();
//                profile.setId(rs.getInt("id"));
//                profile.setUsername(rs.getString("username"));
//                profile.setEmail(rs.getString("email"));
//                profile.setPhone(rs.getString("phone"));
//                profile.setDob(rs.getString("dob"));
//                profile.setPhotoPath(rs.getString("photo_path"));
//                return profile;
//            }
//            return null;
//        }
//    }
     
     public Profile fetchUser(){
         Connection conn = mysql.openConnection();
         String query = "SELECT * FROM profile LIMIT 1";
         try (PreparedStatement pstmt = conn.prepareStatement(query)){
             ResultSet  rs = pstmt.executeQuery();
             if(rs.next()){
                 return new Profile(
                         rs.getString("username"),
                         rs.getString("email"),
                         rs.getString("phone"),
                         rs.getString("dob"),
                         rs.getString("photoPath")
                 );
             }
         }catch(SQLException e){
             e.printStackTrace();
         }
         return null;
     }
}
    

