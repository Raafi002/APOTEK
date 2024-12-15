import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ObatManager implements CRUD {
    
    @Override
    public void tambahObat(Obat obat) {
        // Menggunakan try-with-resources untuk memastikan Connection dan PreparedStatement ditutup
        try (Connection conn = DatabaseConnector.getConnection()) {
            String query = "INSERT INTO obat (kode_obat, nama_obat, jenis_obat, stok, harga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, obat.kodeObat);
                stmt.setString(2, obat.namaObat);
                stmt.setString(3, obat.jenisObat);
                stmt.setInt(4, obat.stok);
                stmt.setDouble(5, obat.harga);
                stmt.executeUpdate();
                System.out.println("Data berhasil ditambahkan!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void hapusObat(String kodeObat) {
        // Menggunakan try-with-resources untuk memastikan Connection dan PreparedStatement ditutup
        try (Connection conn = DatabaseConnector.getConnection()) {
            String query = "DELETE FROM obat WHERE kode_obat = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, kodeObat);
                stmt.executeUpdate();
                System.out.println("Data berhasil dihapus!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void editObat(Obat obat) {
        // Menggunakan try-with-resources untuk memastikan Connection dan PreparedStatement ditutup
        try (Connection conn = DatabaseConnector.getConnection()) {
            String query = "UPDATE obat SET nama_obat = ?, jenis_obat = ?, stok = ?, harga = ? WHERE kode_obat = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, obat.kodeObat);
                stmt.setString(2, obat.namaObat);
                stmt.setString(3, obat.jenisObat);
                stmt.setInt(4, obat.stok);
                stmt.setDouble(5, obat.harga);
                stmt.executeUpdate();
                System.out.println("Data berhasil diubah!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
