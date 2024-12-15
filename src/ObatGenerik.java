public class ObatGenerik extends Obat {
    private double diskon; // Diskon untuk obat generik
    private String kategori; // Kategori obat generik, misal: antiinflamasi, antibiotik, dsb.

    public ObatGenerik(String kodeObat, String namaObat, String jenisObat, int stok, double harga, double diskon, String kategori) {
        super(kodeObat, namaObat, jenisObat, stok, harga);
        this.diskon = diskon;
        this.kategori = kategori;
    }

    @Override
    public String getInfo() {
        return "Obat Generik: " + namaObat + ", Kategori: " + kategori + ", Harga setelah diskon: " + hitungHargaSetelahDiskon();
    }

    public double hitungHargaSetelahDiskon() {
        return harga - (harga * diskon / 100);
    }
}
