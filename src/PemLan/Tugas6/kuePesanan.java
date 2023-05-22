package PemLan.Tugas6;

public class kuePesanan extends kue{
    private double berat;

    public kuePesanan(String nama, double harga, double berat){
        super(nama, harga);
        this.berat = berat;
    }
    
    public double getBerat() {
        return berat;
    }

    @Override
    public double hitungHarga() {
        // TODO Auto-generated method stub
        return super.getHarga()*berat;
    }

    @Override
    public String toString() {
         // TODO Auto-generated method stub
        return super.toString() + String.format("\n%-15s: %s", "Jenis Kue", "Kue Pesanan");
    }
}
