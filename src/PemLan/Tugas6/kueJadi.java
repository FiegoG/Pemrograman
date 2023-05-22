package PemLan.Tugas6;

public class kueJadi extends kue{
    private double jumlah;
    
    public kueJadi(String nama, double harga, double jumlah){
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    @Override
    public double hitungHarga() {
        // TODO Auto-generated method stub
        return super.getHarga()*jumlah*2;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + String.format("\n%-15s: %s", "Jenis Kue", "Kue Jadi");
    }
}
