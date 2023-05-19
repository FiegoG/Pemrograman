package PemLan.Tugas5;

public class Manager extends Pekerja{
    String departemen;

    public Manager(String departemen, double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String nik, Boolean jeniskelamin, Boolean menikah){
        super(gaji, tahun, bulan, hari, jumlahAnak, nama, nik, jeniskelamin, menikah);
        this.departemen = departemen;
    }
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    @Override
    public double getTunjangan() {
        // TODO Auto-generated method stub
        return super.getTunjangan() + 0.1*getGaji();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + String.format("%-15s: %s\n", "Departemen", departemen);
    }
}
