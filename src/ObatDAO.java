
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ObatDAO extends DBConnection {

    // Constructor yang memanggil constructor dari DBConnection untuk mendapatkan koneksi
    public ObatDAO() throws SQLException {
        super(); // Memanggil constructor parent class DBConnection
    }

    // Create Obat (Insert)
    public int insertObat(Obat obat) {
        String sql = "INSERT INTO obat (kode_obat, nama_obat, jenis_obat, stok_obat, harga_obat) VALUES(?,?,?,?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, obat.getKode());
            stmt.setString(2, obat.getNama());
            stmt.setString(3, obat.getJenis());
            stmt.setInt(4, obat.getStok());
            stmt.setDouble(5, obat.getHarga());
            stmt.executeUpdate();
            return 1; // Berhasil
        } catch (SQLException e) {
            e.printStackTrace();
            return 0; // Gagal
        }
    }

    // Read Obat (Select)
    public List<Obat> getObat() {
        List<Obat> obatList = new ArrayList<>();
        String sql = "SELECT * FROM obat";
        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String kode = rs.getString("kode_obat");
                String nama = rs.getString("nama_obat");
                String jenis = rs.getString("jenis_obat");
                int stok = rs.getInt("stok_obat");
                double harga = rs.getDouble("harga_obat");
                obatList.add(new Obat(kode, nama, jenis, stok, harga));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obatList;
    }

    // Update Obat
    public int updateObat(Obat obat) {
        String sql = "UPDATE obat SET kode_obat=?, nama_obat=?, jenis_obat=?, stok_obat=?, harga_obat=? WHERE id=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, obat.getKode());
            stmt.setString(2, obat.getNama());
            stmt.setString(3, obat.getJenis());
            stmt.setInt(4, obat.getStok());
            stmt.setDouble(5, obat.getHarga());
            stmt.executeUpdate();
            return 1; // Berhasil
        } catch (SQLException e) {
            e.printStackTrace();
            return 0; // Gagal
        }
    }

    // Delete Obat
    public int deleteObat(int id) {
        String sql = "DELETE FROM obat WHERE id=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return 1; // Berhasil
        } catch (SQLException e) {
            e.printStackTrace();
            return 0; // Gagal
        }
    }
}
