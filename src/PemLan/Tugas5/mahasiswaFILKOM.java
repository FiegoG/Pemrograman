package PemLan.Tugas5;

public class mahasiswaFILKOM extends Manusia{
    private String nim;
    private double ipk;

    public mahasiswaFILKOM(String nim, Double ipk, String nama, String nik, Boolean jenisKelamin, Boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.ipk = ipk;
        this.nim = nim;
    }
    public void setIpk(Double ipk) {
        this.ipk = ipk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Double getIpk() {
        return ipk;
    }

    public String getNim() {
        return nim;
    }

    public String getStatus(){
        String angkatan = this.nim.substring(0, 2);
        char prodi = this.nim.charAt(6);

        switch(prodi){
            case '2': return "Teknik Informatika, 20" + angkatan;
            case '3': return "Teknik Komputer, 20" + angkatan;
            case '4': return "Sistem Informasi, 20" + angkatan;
            case '6': return "Pendidikan Teknologi Informasi, 20" + angkatan;
            case '7': return "Teknologi Informasi, 20" + angkatan;
        }

        return "";
    }

    public double getBeasiswa(){
        if(ipk <= 3.5 && ipk >= 3.0) return 50;
        else if(ipk <= 4 && ipk > 3.5) return 75;
        return 0;
    }

    @Override
    public double getPendapatan() {
        // TODO Auto-generated method stub
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + String.format("%-15s: %s\n%-15s: %.1f\n%-15s: %s\n", "NIM", nim, "IPK", ipk, "Status", getStatus());
    }
    
}
