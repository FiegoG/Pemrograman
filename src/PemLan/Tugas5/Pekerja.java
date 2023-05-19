package PemLan.Tugas5;

import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String nik, Boolean jeniskelamin, Boolean menikah) {
        super(nama, nik, jeniskelamin, menikah);
        LocalDate tanggal = LocalDate.of(tahun, bulan, hari);
        this.gaji = gaji;
        this.jumlahAnak = jumlahAnak;
        this.tahunMasuk = tanggal;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public double getGaji() {
        return gaji;
    }

    public double getBonus(){
        Period bedaWaktu = Period.between(tahunMasuk, LocalDate.now());
        int lamaBekerjaTahun = bedaWaktu.getYears();
        double bonus;
        
        if(lamaBekerjaTahun >= 0 && lamaBekerjaTahun <= 5) bonus = 0.05 * gaji;
        else if(lamaBekerjaTahun > 5 && lamaBekerjaTahun <= 10) bonus = 0.1 * gaji;
        else bonus = 0.15 * gaji;

        return bonus;
    }

    @Override
    public double getPendapatan() {
        // TODO Auto-generated method stub
        return super.getPendapatan() + getGaji() + getBonus();
    }

    @Override
    public double getTunjangan() {
        // TODO Auto-generated method stub
        return super.getTunjangan() + 20*jumlahAnak;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + String.format("%-15s: %d %d %d\n%-15s: %d\n%-15s: %.1f\n", "Tahun Masuk", tahunMasuk.getDayOfMonth(), tahunMasuk.getMonthValue(), tahunMasuk.getYear(), "Jumlah Anak", jumlahAnak, "Gaji", gaji);
    }
}
