
package Dao;
import database.MySqlConnection;
import java.sql.*;
import java.io.*;
import model.AdoptionModel;
import model.CertificationModel;
import model.UserSession;

/**
 *
 * @author suyas
 */
public class CertificationDao {
    
    MySqlConnection mysql = new MySqlConnection();
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/pet_certification"; 
    private static final String USER = "root"; 
    private static final String PASSWORD = ""; 

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }

    
    public void insertVaccationImagePath(CertificationModel certificate) {
        String sql = "INSERT INTO vaccination_table (id, image_path) VALUES (?, ?)";
        
        Connection conn = mysql.openConnection();

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1,UserSession.getUserId() );
            pstmt.setString(2, certificate.getVaccinationImagePath());
            
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    


public void insertInsuranceImagePath(CertificationModel insurance) {
        String sql = "INSERT INTO insurance_table (id, image_path) VALUES (?, ?)";
        Connection conn = mysql.openConnection();
        try ( 
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1,UserSession.getUserId() );
            pstmt.setString(2, insurance.getInsuranceImagePath());
            
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
   
