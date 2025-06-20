package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

import database.Database;
import database.MySqlConnection;
import model.ProductModel;

public class ProductDao {
    MySqlConnection mysql = new MySqlConnection();

    public void createProduct(ProductModel product) {
        String sql = "INSERT INTO tblproduct (productName, img, productPrice, productRating, productId) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, product.getProductName());
            pstmt.setString(2, product.getImg());
            pstmt.setInt(3, product.getProductPrice());
            pstmt.setInt(4, product.getProductRating()); // default 0
            pstmt.setInt(5, product.getProductId()); // default 0

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exception appropriately
        }
    }
    }

    public List<ProductModel> getAllProducts() {
        List<ProductModel> products = new ArrayList<>();
        Connection conn = mysql.openConnection();
        String sql = "SELECT * FROM products";

        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                ProductModel product = new ProductModel(
                    rs.getString("productName"),
                    rs.getString("productImage"),
                    rs.getInt("productPrice"),
                    rs.getInt("productRating"),
                    rs.getInt("productId")
                );
                product.setProductId(rs.getInt("productId")); // set ID from DB
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
        String sql = "UPDATE products SET productName=?, productImage=?, productPrice=?, productRating=? WHERE productId=?";

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
