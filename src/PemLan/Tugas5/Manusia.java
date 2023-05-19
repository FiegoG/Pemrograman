package PemLan.Tugas5;

public class Manusia {
    private String nama;
    private Boolean jenisKelamin;
    private String nik;
    private Boolean menikah;

    public Manusia (String nama, String nik, Boolean jeniskelamin, Boolean menikah) {
        this.jenisKelamin = jeniskelamin;
        this.menikah = menikah;
        this.nama = nama;
        this.nik = nik;
    }

    public void setJenisKelamin(Boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setMenikah(Boolean menikah) {
        this.menikah = menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getJenisKelamin() {
        return jenisKelamin == true ? ("Laki - laki") : ("Perempuan");
    }

    public Boolean getMenikah() {
        return menikah;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public double getTunjangan() {
        if (menikah) {
            if (jenisKelamin) {
                return 25;
            } else return 20;
            
        } else return 15;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%-15s: %s\n%-15s: %s\n%-15s: %s\n%-15s: %.1f\n", "Nama", nama, "NIK", nik, "Jenis Kelamin", getJenisKelamin(), "Pendapatan", getPendapatan());
    }

}
