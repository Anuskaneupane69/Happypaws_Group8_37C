
package database;
import java.sql.*;

public interface Database {
    Connection openConnection();
    void closeConnection(Connection conn);
    ResultSet runQuery(Connection conn, String query); //reference type
    int executeUpdate(Connection conn, String query);
}
