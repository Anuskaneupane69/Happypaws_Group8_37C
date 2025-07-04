package Dao;
import database.MySqlConnection;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import model.PetinfoModel;
public class PetProfileDao {
    private MySqlConnection mysql = new MySqlConnection();
    
    public void createPetInfo(PetinfoModel petInfo) {
        String sql = "INSERT INTO tblpetinfo (petId, name, species, age, birthday, lastWeight, lastWeightUpdate, image) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = mysql.openConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, petInfo.getPetId());
            pstmt.setString(2, petInfo.getName());
            pstmt.setString(3, petInfo.getSpecies());
            pstmt.setInt(4, petInfo.getAge());
            pstmt.setObject(5, petInfo.getBirthday());
            pstmt.setDouble(6, petInfo.getLastWeight());
            pstmt.setObject(7, petInfo.getLastWeightUpdate());
            pstmt.setString(8, petInfo.getImage());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<PetinfoModel> getAllPetInfos() {
        List<PetinfoModel> petInfos = new ArrayList<>();
        String sql = "SELECT * FROM tblpetinfo";
        try (Connection conn = mysql.openConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                PetinfoModel petInfo = new PetinfoModel(
                        rs.getInt("petId"),
                        rs.getString("name"),
                        rs.getString("species"),
                        rs.getInt("age"),
                        rs.getObject("birthday", LocalDate.class),
                        rs.getDouble("lastWeight"),
                        rs.getObject("lastWeightUpdate", LocalDateTime.class),
                        rs.getString("image")
                );
                petInfos.add(petInfo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return petInfos;
    }
   
}
