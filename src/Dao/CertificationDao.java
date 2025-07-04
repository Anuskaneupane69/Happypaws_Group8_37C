/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import java.sql.*;
import java.io.*;

/**
 *
 * @author suyas
 */
public class CertificationDao {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/pet_certification"; 
    private static final String USER = "root"; 
    private static final String PASSWORD = ""; 

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }

    public void uploadVaccinationRecord(int petId, File imageFile) {
        String sql = "INSERT INTO vaccination_records (pet_id, record_image) VALUES (?, ?)";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             FileInputStream fis = new FileInputStream(imageFile)) {

            pstmt.setInt(1, petId);
            pstmt.setBinaryStream(2, fis, (int) imageFile.length());
            pstmt.executeUpdate();
            System.out.println("Vaccination record uploaded.");
        } catch (Exception e) {
        }
    }

    public void uploadInsuranceDetail(int petId, File imageFile) {
        String sql = "INSERT INTO insurance_details (pet_id, insurance_image) VALUES (?, ?)";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             FileInputStream fis = new FileInputStream(imageFile)) {

            pstmt.setInt(1, petId);
            pstmt.setBinaryStream(2, fis, (int) imageFile.length());
            pstmt.executeUpdate();
            System.out.println("Insurance detail uploaded.");
        } catch (Exception e) {
        }
    }
}
    

