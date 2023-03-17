package PemLan.Tugas1;

public class atribut {
    private String judulBuku;
    private String penulisBuku;
    private String jumlahHalamanBuku;
    private String tahunTerbit;
    private String penerbit;
    private String kategoriBuku;

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public void setJumlahHalamanBuku(String jumlahHalamanBuku) {
        this.jumlahHalamanBuku = jumlahHalamanBuku;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setPenulisBuku(String penulisBuku) {
        this.penulisBuku = penulisBuku;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setKategoriBuku(String kategoriBuku) {
        this.kategoriBuku = kategoriBuku;
    }
    
    public void titleAtas() {
        System.out.println("Menampilkan buku kategori " + kategoriBuku);
    }
    public void tampilanHasil() {
        System.out.println("");
        System.out.println(judulBuku);
        System.out.println(jumlahHalamanBuku);
        System.out.println(penerbit);
        System.out.println(penulisBuku);
        System.out.println(tahunTerbit);
    }
}
