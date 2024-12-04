
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    protected Connection connection;

    // Constructor untuk mendapatkan koneksi
    public DBConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/java_crud_db";
        String user = "root";
        String password = "";
        this.connection = DriverManager.getConnection(url, user, password);
    }

    // Method untuk mendapatkan koneksi
    public Connection getConnection() {
        return connection;
    }
}
