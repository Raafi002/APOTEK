

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class UserDAO {
    private Connection connection;
    public UserDAO() throws SQLException{
        connection = DBConnection.getConnection();
        
    }
    
    // create User
    public int insertUser(User obat){
        try{
            String sql = "INSERT INTO users (kode_obat, nama_obat, jenis_obat, stok_obat, harga_obat) VALUES(?,?,?,?,?)";
            PreparedStatement stmt =connection.prepareStatement(sql);
            stmt.setString(1, user.getkode());
            stmt.setString(2, user.getnama());
            stmt.setString(3, user.getjenis());
            stmt.setInt(4, user.getstok());
            stmt.setDouble(5, user.getharga(0));
            stmt.executeUpdate();
            return 1;
            
        }catch(SQLException e){
              return 0;
        }
        
    }
    
    // Select/read Users
    public List<User> getObat(){
        List<User> obat = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM obat";
            PreparedStatement stmt =connection.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String kode = rs.getString("kode_obat");
                String nama = rs.getString("nama_obat");
                String jenis = rs.getString("jenis_obat");
                int stok = rs.getInt("stok_obat");
                double harga= rs.getDouble("harga_obat");
                
                obat.add(new User(kode, nama, jenis, stok, harga));
                
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return obat;
    }
    
    // update User
    public int updateobat(User obat){
        try{
            String sql = "UPDATE users SET kode_obat=?, nama_obat=?, jenis_obat=?, stok_obat=?, harga_obat=? WHERE id=?";
            PreparedStatement stmt =connection.prepareStatement(sql);
            stmt.setString(1, User.getkode());
            stmt.setString(2, user.getnama());
            stmt.setString(3, user.getjenis());
            stmt.setInt(4, user.getstok());
            stmt.setDouble(5, user.getharga(0));
            stmt.executeUpdate();
            return 1;
            
        }catch(SQLException e){
              return 0;
        }
        
    }
    
    // Delete User
    public void deleteUser(int id){
        try{
            String sql = "DELETE FROM obat  WHERE id=?";
            PreparedStatement stmt =connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            
        }catch(SQLException e){
              e.printStackTrace();
        }
        
    }

    List<User> getobat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
