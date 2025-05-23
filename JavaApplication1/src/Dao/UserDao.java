package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import database.MySqlConnection;
import model.user;

public class UserDao {
    MySqlConnection mysql = new MySqlConnection();
    Connection conn = mysql.openConnection();

    public void signup(user user){
        String sql = "INSERT INTO user (username,email,password) VALUES (?,?,?)";
        try{
            PreparedStatement pstm = conn.prepareStatement(sql);
        }catch (SQLException ex){
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}