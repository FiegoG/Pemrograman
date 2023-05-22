package PemLan.Tugas6;

public abstract class kue {
    private String nama;
    private double harga;

    public kue(String nama, double harga){
        this.harga = harga;
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public abstract double hitungHarga();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%-15s: %s\n%-15s: Rp %,3.2f", "Nama Kue", this.nama, "Harga", this.hitungHarga());
    }
}
