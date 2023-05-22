package PemLan.Tugas6;

public class main {
    public static void main(String[] args) {
        double totalHargaKuePesanan = 0;
        double totalHargaKueJadi = 0;
        double totalBeratKuePesanan = 0;
        double totalJumlahKueJadi = 0;
        double hargaKueTermahal = 0;
        String namaKueTermahal = "";

        kue[] kueKue = new kue[20];
        kueKue[0] = new kueJadi("Kukus", 1000, 105);
        kueKue[1] = new kueJadi("Cup Cake", 5000, 150);
        kueKue[2] = new kueJadi("Muffin", 8000, 1000);
        kueKue[3] = new kueJadi("Sus", 9000, 69);
        kueKue[4] = new kuePesanan("Kue Lumpur", 12000, 2);
        kueKue[5] = new kuePesanan("Cheese Cake", 50000, 1);
        kueKue[6] = new kuePesanan("Brownis", 45000, 1.5);
        kueKue[7] = new kueJadi("Serabi", 10000, 1000);
        kueKue[8] = new kueJadi("Cucur", 4000, 1340);
        kueKue[9] = new kueJadi("Onde - Onde", 2000, 1500);
        kueKue[10] = new kuePesanan("Kue Lapis", 30000, 2.5);
        kueKue[11] = new kueJadi("Apem", 2000, 190);
        kueKue[12] = new kueJadi("Red Velvet", 23000, 700);
        kueKue[13] = new kuePesanan("Nastar", 26000, 3);
        kueKue[14] = new kuePesanan("Kastengel", 23000, 4);
        kueKue[15] = new kuePesanan("Putri Salju", 23000, 3.5);
        kueKue[16] = new kueJadi("Roti Tawar", 10000, 1005);
        kueKue[17] = new kueJadi("Tiramisu", 30000, 400);
        kueKue[18] = new kueJadi("Dorayaki", 10000, 50000);
        kueKue[19] = new kueJadi("Taiyaki", 15000, 4670);

        for(int i = 0; i < kueKue.length; i++){
            System.out.printf("\n%s\n", kueKue[i]);
            if(kueKue[i] instanceof kuePesanan){
                totalBeratKuePesanan += ((kuePesanan) kueKue[i]).getBerat();
                totalHargaKuePesanan += ((kuePesanan) kueKue[i]).hitungHarga();
            }
            else if(kueKue[i] instanceof kueJadi){
                totalJumlahKueJadi += ((kueJadi) kueKue[i]).getJumlah();
                totalHargaKueJadi += ((kueJadi) kueKue[i]).hitungHarga();
            }
            if(kueKue[i].hitungHarga() > hargaKueTermahal) {
                hargaKueTermahal = kueKue[i].hitungHarga();
                namaKueTermahal = kueKue[i].getNama();
            }
        }

        System.out.println("\nInformasi Penjualan");
        System.out.printf("%-25s: Rp %,3.2f\n", "Total Harga Semua Kue", totalHargaKuePesanan + totalHargaKueJadi);
        System.out.println();
        System.out.printf("%-25s: Rp %,3.2f\n", "Total Harga Kue Pesanan", totalHargaKuePesanan);
        System.out.printf("%-25s: %,3.1f kg\n", "Total Berat Kue Pesanan", totalBeratKuePesanan);
        System.out.println();
        System.out.printf("%-25s: Rp %,3.2f\n", "Total Harga Kue Jadi", totalHargaKueJadi);
        System.out.printf("%-25s: %,3.1f buah\n", "Total Jumlah Kue Jadi", totalJumlahKueJadi);
        System.out.println();
        System.out.println("Kue Harga Tertinggi");
        System.out.printf("%s%-25s: %s\n", "", "Berdasarkan Jenis", totalHargaKueJadi > totalHargaKuePesanan ? "Kue Jadi" : "Kue Pesanan");
        System.out.printf("%s%-25s: %s\n", "", "Berdasarkan Nama Kue", namaKueTermahal);
    }
}
