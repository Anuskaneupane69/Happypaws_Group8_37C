package Dao;

import database.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import model.ProductModel;
import view.Accessories;
import view.ProductCard;

public class ProductDao {
    MySqlConnection mysql = new MySqlConnection();
    

    public void createProduct(ProductModel product) {
        String sql = "INSERT INTO tblproduct (productName, img, productPrice, productRating, productId) VALUES (?, ?, ?, ?, ?)";
        System.out.println("trying to enter data in");
        try (Connection conn = mysql.openConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, product.getProductName());
            pstmt.setString(2, product.getImg()); // this is a path
            pstmt.setInt(3, product.getProductPrice());
            pstmt.setInt(4, product.getProductRating());
            pstmt.setInt(5, product.getProductId());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<ProductModel> getAllProducts() {
        System.out.println("get all products");
        
        List<ProductModel> products = new ArrayList<>();
        Connection conn = mysql.openConnection();
        String sql = "SELECT * FROM tblproduct"; // fix table name

        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                ProductModel product = new ProductModel(
                    rs.getString("productName"),
                    rs.getString("img"), // fix column name to match insert
                    rs.getInt("productPrice"),
                    rs.getInt("productRating"),
                    rs.getInt("productId")
                );
                products.add(product);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            mysql.closeConnection(conn);
        }

        return products;
    }

    public void updateProduct(ProductModel product) {
        Connection conn = mysql.openConnection();
        String sql = "UPDATE tblproduct SET productName=?, img=?, productPrice=?, productRating=? WHERE productId=?"; // fix table and column names

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, product.getProductName());
            pstmt.setString(2, product.getImg());
            pstmt.setInt(3, product.getProductPrice());
            pstmt.setInt(4, product.getProductRating());
            pstmt.setInt(5, product.getProductId());

            pstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            mysql.closeConnection(conn);
        }
    }
    
    
}
