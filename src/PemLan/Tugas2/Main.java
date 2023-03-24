package PemLan.Tugas2;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String [][] teknologi = {{"Pengantar Teknologi Informatika Dan Komunikasi Data","Teknologi Informasi: Aplikasi dan Penerapannya","Media & Teknologi Dalam Pembelajaran","Artificial Intelligence: A Guide for Thinking Humans","Artificial Intelligence: Konsep Fundamental dan Terapan"},
                                 {"134 halaman","130 halaman","266 halaman","419 halaman","270 halaman"},
                                 {"Deepublish","Yayasan Kita Menulis","Prenada Media","Penguin Books, Limited","Media Nusa Creative (MNC Publishing)"},
                                 {"Bagaskoro","Janner Simarmata, DKK","Dr. Benny A. Pribadi","Melanie Mitchell","Achmad Fanany Onnilita Gaffar; Rheo Malani; Arief Bramanto Wicaksono Putra"},
                                 {"2019","2020","2017","2020","2021"}};

        String [][] filsafat = {{"Filsafat Ilmu","Filsafat Umum Zaman Now","Filsafat Bahasa","Dasar Filsafat Ilmu","FILSAFAT ISLAM"},
                                {"248 halaman","296 halaman","168 halaman","139 halaman","272 halaman"},
                                {"Kencana","CV. Kataba Group","Media Sains Indonesia","Cv. Pusdikra Mitra Jaya","Penerbit NEM"},
                                {"Dr. Nunu Burhanuddin, Lc., M.A.","Hamidulloh Ibda","Dr. Andi Sadapotto, M. Hum., Dr. Muhammad Hanafi, M. Pd., Drs. H. Agussalim, M. Si.","Suhardi, S.Pd.I, M.A, DKK","Dr. H. Imam Kanafi, M.Ag."},
                                {"2018","2018","2021","2020","2019"}};

        String [][] sejarah = {{"Geografi Sejarah Indonesia","Ilmu Sejarah","Sejarah nasional Indonesia: Zaman pertumbuhan dan perkembangan kerajaan-kerajaan Islam di Indonesia","Sejarah Islam di Nusantara","Sejarah nasional Indonesia: Zaman Kebangkitan Nasional dan masa Republik Indonesia"},
                              {"286 halaman","278 halaman","385 halaman","326 halaman","358 halaman"},
                              {"Penerbit Garudhawaca","Kencana","Balai Pustaka","Bentang","Balai Pustaka"},
                              {"Yulia Siska","M. Dien Madjid, Johan Wahyudhi","Marwati Djoened Poesponegoro, Nugroho Notosusanto","Michael Francis Laffan","Marwati Djoened Poesponegoro"},
                              {"2017","2014","2008","2015","2008"}};

        String [][] agama = {{"TEOLOGI AGAMA-AGAMA","Mengenal Agama Manusia","Satu Bumi Banyak Agama","Pendidikan Agama Islam","Manusia, Agama, Dan Sastra"},
                            {"100 halaman","544 halaman","282 halaman","426 halaman","220 halaman"},
                            {"Ahlimedia Book","PBMR ANDI","BPK Gunung Mulia","Zizi Publisher","Deepublish"},
                            {"Dr. Wendy Sepmady Hutahaean, S.E., M.Th.","Jonar Situmorang","Paul F. Knitter","Al Ikhlas, Lc., MA.","I Nyoman Buditha S"},
                            {"2021","2021","2003","2000","2019"}};

        String [][] psikologi = {{"Teori Psikologi Kepribadian Manusia","Psikologi Pendidikan","Psikologi Pendidikan","Psikologi Musik","Psikologi Pendidikan Berbasis Analisis Empiris Aplikatif"},
                                {"352 halaman","175 halaman","223 halaman","320 halaman","330 halaman"},
                                {"Penerbit Andi","Uwais Inspirasi Indonesia","Deepublish","PT Kanisius","Kencana"},
                                {"Nur Fatwikiningsih, S. Psi, M.Psi, Psikolog","Stefanus M. Marbun, S.Th, M.PdK","Dr. Muhamad Uyun, M.Si., Dr. Idi Warsah, M.Pd.I.","Prof. Dr. Djohan","Prof. Dr. Syamsul Bachri Thalib, M.Si."},
                                {"2020","2020","2021","2016","2017"}};

        String [][] politik = {{"Politik Parole : Dari Supersemar Hingga HTI dan Hal Kontemporer","Relasi Islam politik & kekuasaan","Ilmu Politik Hukum Dari Masa Ke Masa","Pegawai Negeri Sipil : Lepas dari Partai Politik Terjebak di Pilkada","Kekuasaan - Sebuah Analisis Sosial dan Politik"},
                              {"289 halaman","252 halaman","102 halaman","234 halaman","323 halaman"},
                              {"LPMI","LKiS","Deepublish","Kencana","Yayasan Pustaka Obor Indonesia"},
                              {"Hartanto","Abd Halim","Dr. T. Mangaranap Sirait, S.H., M.H., CTA.","English Nainggolan","Bertrand Russel"},
                              {"2020","2013","2021","2021","2020"}};

        String [][] fiksi = {{"Your Name","Weathering With You","So I'm a Spider, So What?","I Want to Eat Your Pankreas","Laskar Pelangi"},
                            {"262 halaman","192 halaman","318 halaman","308 halaman","529 halaman"},
                            {"Kadokawa","Yen Press","Fujimi Shobo","Penerbit Haru","Bentang Pustaka"},
                            {"Makoto Shinkai","Makoto Shinkai","Okina Baba","Yoru Sumino","Andrea Hirata"},
                            {"2016","2019","2015","2018","2005"}};
 
        int pilihan;

        do {
          System.out.println("");
          System.out.println("Selmat datang di PERPUSTAKAAN X");
          System.out.println("Pilihan kategori buku");
          System.out.println("1. Teknologi");
          System.out.println("2. Filsafat");
          System.out.println("3. Sejarah");
          System.out.println("4. Agama");
          System.out.println("5. Psikologi");
          System.out.println("6. Politik");
          System.out.println("7. Fiksi");
          System.out.println("8. Total Buku yang ada");
          System.out.println("9. Keluar");
          System.out.println("\n");
          System.out.println("Masukkan piliha anda");
          pilihan = input.nextInt();
          System.out.println("\n");
          switch (pilihan) {
            case 1: loopMethod(teknologi, "Teknologi");
            loopMethodCopy(teknologi, "Teknologi", "Disini berisikan sinopsis buku yang saya belum isikan karena harus mencari lagi di internet"); break;
            case 2: loopMethod(filsafat, "Filsafat");
            loopMethodCopy(filsafat, "Filsafat", "Disini berisikan sinopsis buku yang saya belum isikan karena harus mencari lagi di internet"); break;
            case 3: loopMethod(sejarah, "Sejarah");
            loopMethodCopy(sejarah, "Sejarah", "Disini berisikan sinopsis buku yang saya belum isikan karena harus mencari lagi di internet"); break;
            case 4: loopMethod(agama, "Agama"); 
            loopMethodCopy(agama, "Agama", "Disini berisikan sinopsis buku yang saya belum isikan karena harus mencari lagi di internet"); break;
            case 5: loopMethod(psikologi, "Psikologi"); 
            loopMethodCopy(psikologi, "Psikologi", "Disini berisikan sinopsis buku yang saya belum isikan karena harus mencari lagi di internet"); break;
            case 6: loopMethod(politik, "Politik");
            loopMethodCopy(politik, "Politik", "Disini berisikan sinopsis buku yang saya belum isikan karena harus mencari lagi di internet"); break;
            case 7: loopMethod(fiksi, "Fiksi");
            loopMethodCopy(fiksi, "Fiksi", "Disini berisikan sinopsis buku yang saya belum isikan karena harus mencari lagi di internet"); break;
            case 8: System.out.printf("Total buku yang ada : %d\n", teknologi.length + filsafat.length + sejarah.length + agama.length + agama.length + psikologi.length + politik.length + fiksi.length); break;
            default: if (pilihan != 9) {
              System.out.println("Yang bener bang menunya cuma 9\n\n");
            } break;
          }
        } while (pilihan != 9);
        System.out.println("Program Berhenti");


    }  

    // public static void loopMethod(String[][] array, String JenisBuku) {
    //   atribut buku = new atribut();
    //   buku.setKategoriBuku(JenisBuku);
    //   System.out.println("Menampilkan buku " + JenisBuku);
    //     for (int i = 0; i < array.length; i++) {
    //       buku.setJudulBuku(array[0][i]);
    //       buku.setJumlahHalamanBuku(array[1][i]);
    //       buku.setPenerbit(array[2][i]);
    //       buku.setPenulisBuku(array[3][i]);
    //       buku.setTahunTerbit(array[4][i]);
    //       buku.tampilanHasil();
    //     }
    // }

    public static void loopMethod(String[][] array, String JenisBuku) {
      System.out.println("Menampilkan buku " + JenisBuku);
        for (int i = 0; i < array.length; i++) {
          atribut buku = new atribut((array[0][i]), (array[1][i]), (array[2][i]), (array[3][i]), (array[4][i]), JenisBuku);
          buku.tampilanHasil();
        }
    }

    public static void loopMethodCopy(String[][] array, String JenisBuku, String sinopsis) {
      System.out.println("\nMenampilkan hasil copy untuk kategori " + JenisBuku);
        for (int i = 0; i < array.length; i++) {
          atribut buku = new atribut((array[0][i]), (array[1][i]), (array[2][i]), (array[3][i]), (array[4][i]), JenisBuku, sinopsis);
          atribut pindah = buku.copy(buku);
          pindah.tampilanHasilCopy();
        }
    }
}
