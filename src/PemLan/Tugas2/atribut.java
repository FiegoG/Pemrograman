package PemLan.Tugas2;

public class atribut {
    private String judulBuku;
    private String penulisBuku;
    private String jumlahHalamanBuku;
    private String tahunTerbit;
    private String penerbit;
    private String kategoriBuku;
    private String Sinopsis;

    public atribut(){

    }

    public atribut(String judulBuku, String penulisBuku, String jumlahHalamanBuku, String tahunTerbit, String penerbit, String kategoriBuku) {
        this.judulBuku = judulBuku;
        this.penulisBuku = penulisBuku;
        this.jumlahHalamanBuku = jumlahHalamanBuku;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
        this.kategoriBuku = kategoriBuku;
    }

    public atribut(String judulBuku, String penulisBuku, String jumlahHalamanBuku, String tahunTerbit, String penerbit, String kategoriBuku, String Sinopsis) {
        this.Sinopsis = Sinopsis;
        this.judulBuku = judulBuku;
        this.penulisBuku = penulisBuku;
        this.jumlahHalamanBuku = jumlahHalamanBuku;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
        this.kategoriBuku = kategoriBuku;
    }

    public void setSinopsis(String sinopsis) {
        Sinopsis = sinopsis;
    }

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
    

    public void tampilanHasil() {
        System.out.println("");
        System.out.println(judulBuku);
        System.out.println(jumlahHalamanBuku);
        System.out.println(penerbit);
        System.out.println(penulisBuku);
        System.out.println(tahunTerbit);
    }

    // public void hitungSinopsis(){
    //     if (Sinopsis.split("\\s").length >= 10) {
    //         System.out.println("yes");
    //     }
    // }

    public int hitungSinopsis(){
        int countWords = 1;
        for (int i = 0; i < Sinopsis.length(); i++) {
            if(Sinopsis.charAt(i) == ' '){
                countWords++;
            }
        }
        return countWords;
    }

    public atribut copy(atribut buku){
        return new atribut(buku.judulBuku, buku.penulisBuku, buku.jumlahHalamanBuku, buku.tahunTerbit, buku.penerbit, buku.kategoriBuku, buku.Sinopsis);
    }

    public void tampilanHasilCopy(){
        System.out.println("");
        System.out.println(judulBuku);
        System.out.println(jumlahHalamanBuku);
        System.out.println(penerbit);
        System.out.println(penulisBuku);
        System.out.println(tahunTerbit);
        System.out.println(Sinopsis);
        System.out.println("Jumlah kata sinopsis : " + hitungSinopsis());

    }
}
