package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import database.MySqlConnection;
import model.LoginRequest;

public class UserDao {
    MySqlConnection mysql = new MySqlConnection();

    public boolean signup(model.UserModel user){
        Connection conn = mysql.openConnection();
        String sql = "INSERT INTO user (name,email,password) VALUES (?,?,?)";
        try(PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setString(1, user.getUsername());
            pstm.setString(2, user.getEmail());
            pstm.setString(3, user.getPassword());
            pstm.executeUpdate();
            return true;
        }catch (SQLException ex){
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
                    return false;

        }finally{
            mysql.closeConnection(conn);
        }
    }

    public boolean CheckUser(model.UserModel user){
        Connection conn = mysql.openConnection();
        String sql = "SELECT * FROM user WHERE email = ? AND password = ?";
        try(PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setString(1, user.getUsername());
            pstm.setString(2, user.getPassword());
            ResultSet result = pstm.executeQuery();
            return result.next();
        }catch(SQLException e){
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            mysql.closeConnection(conn);
        }
        return false;
    }

public model.UserModel Login(LoginRequest login){
        Connection conn = mysql.openConnection();
        String sql = "SELECT * FROM user where email = ? and password = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, login.getemail());
            pstmt.setString(2, login.getpassword());
            ResultSet result = pstmt.executeQuery();
    if (result.next()) {
                model.UserModel user = new model.UserModel(
            result.getString("email"),
            result.getString("name"), // or username if you have one
            result.getString("password")
                );
                user.SetId(result.getInt("id"));
                
                return user;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            mysql.closeConnection(conn);    
        }
        return null;
    }

}
