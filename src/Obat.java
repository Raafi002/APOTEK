

public abstract class Obat {
    protected String kodeObat;
    protected String namaObat;
    protected String jenisObat;
    protected int stok;
    protected double harga;

    public Obat(String kodeObat, String namaObat, String jenisObat, int stok, double harga) {
        this.kodeObat = kodeObat;
        this.namaObat = namaObat;
        this.jenisObat = jenisObat;
        this.stok = stok;
        this.harga = harga;
    }

    public abstract String getInfo();
}
