

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ObatManager implements CRUD {
    @Override
    public void tambahObat(Obat obat) {
        try (Connection conn = DatabaseConnector.connect()) {
            String query = "INSERT INTO obat (kode_obat, nama_obat, jenis_obat, stok, harga) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, obat.kodeObat);
            stmt.setString(2, obat.namaObat);
            stmt.setString(3, obat.jenisObat);
            stmt.setInt(4, obat.stok);
            stmt.setDouble(5, obat.harga);
            stmt.executeUpdate();
            System.out.println("Data berhasil ditambahkan!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void hapusObat(String kodeObat) {
        try (Connection conn = DatabaseConnector.connect()) {
            String query = "DELETE FROM obat WHERE kode_obat = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, kodeObat);
            stmt.executeUpdate();
            System.out.println("Data berhasil dihapus!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void editObat(Obat obat) {
        try (Connection conn = DatabaseConnector.connect()) {
            String query = "UPDATE obat SET nama_obat = ?, jenis_obat = ?, stok = ?, harga = ? WHERE kode_obat = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, obat.namaObat);
            stmt.setString(2, obat.jenisObat);
            stmt.setInt(3, obat.stok);
            stmt.setDouble(4, obat.harga);
            stmt.setString(5, obat.kodeObat);
            stmt.executeUpdate();
            System.out.println("Data berhasil diubah!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
