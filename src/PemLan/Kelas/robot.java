package PemLan.Kelas;

//Fiego Triwanda Putra
//225150700111033

public class robot {
    public static void main(String[] args) {
        Lingkaran Kepala = new Lingkaran(13);
        persegiPanjang Badan = new persegiPanjang(32, 26);
        persegiPanjang tanganKiri = new persegiPanjang(10, 5);
        persegiPanjang tanganKanan = new persegiPanjang(10, 5);
        Lingkaran telapakTanganKiri = new Lingkaran(3);
        Lingkaran telapakTanganKanan = new Lingkaran(3);
        persegiPanjang kakiKiri = new persegiPanjang(15, 6);
        persegiPanjang kakiKanan = new persegiPanjang(15, 6);
        Lingkaran telapakKakiKiri = new Lingkaran(4);
        Lingkaran telapakKakiKanan = new Lingkaran(4);
        
        double luas = Kepala.luas() + Badan.luas() + tanganKiri.luas() + tanganKanan.luas() + telapakTanganKanan.luas() + telapakTanganKiri.luas() + kakiKanan.luas() + kakiKiri.luas() + telapakKakiKanan.luas() + telapakKakiKiri.luas();
        System.out.printf("Luas total robot adalah : %.2f\n", luas);
        Double tinggiRobot = Kepala.getJariJari()*2 + Badan.getPanjang() + kakiKanan.getPanjang() + telapakKakiKanan.getJariJari()*2;
        System.out.println("Tinggi total robot adalah : " + tinggiRobot);

    }
}

class Lingkaran{
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public double luas(){
        return Math.PI*jariJari*jariJari;
    }
}

class persegiPanjang{
    private double panjang;
    private double lebar;

    public persegiPanjang(double panjang, double lebar){
        this.lebar = lebar;
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double luas(){
        return panjang*lebar;
    }
}
