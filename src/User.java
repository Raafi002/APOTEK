

public class User {
    private int stok;
    private double harga;
    private String nama;
    private String jenis;
    private String kode;
    
     public User(int stok, String nama,String jenis, String kode, double harga){
        this.kode=kode;
        this.stok=stok;
        this.nama=nama;
        this.jenis=jenis;
        this.harga=harga;
    }

    User(String kode, String nama, String jenis, int stok, double harga) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    User(String kode, String nama, String jenis, String stok, String harga) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
    public int getstok() {
        return stok;
    }
    public void setstok(int stok) {
        this.stok = stok;
    }

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getjenis() {
        return jenis;
    }

    public void setjenis(String jenis) {
        this.jenis = jenis;
    }

    public String getkode() {
        return kode;
    }

    public void setkode(String kode) {
        this.kode=kode;
    }

    public double getharga(double harga) {
        return harga;
    }

    public void setharga(double harga) {
        this.harga=harga;
    }

    Object getharga() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
