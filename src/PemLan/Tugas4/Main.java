package PemLan.Tugas4;

import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    int pilihan;
    int hargaTotal = 0;
    int jmlJaket = 0;
    char typeJaket;
    Toko jaket = new Toko();
    System.out.println("Menu");
    System.out.println("Daftar Barang");
    System.out.printf("1. Jaket bahan A dengan harga %d/biji\n", jaket.getHargaA());
    System.out.printf("2. Jaket bahan B dengan harga %d/biji\n", jaket.getHargaB());
    System.out.printf("3. Jaket bahan C dengan harga %d/biji\n", jaket.getHargaC());
    pilihan = input.nextInt();
    switch (pilihan) {
        case 1: {
            System.out.println("Anda Telah memilih jaket bahan A");
            System.out.println("Tulis jumlah jaket yang anda beli");
            jmlJaket = input.nextInt();
            if (jmlJaket > 100) {
                hargaTotal = (jaket.getHargaA()-5000)*jmlJaket;
            } else {
                hargaTotal = jaket.getHargaA()*jmlJaket;
            }
            break;
        }

        case 2: {
            System.out.println("Anda Telah memilih jaket bahan B");
            System.out.println("Tulis jumlah jaket yang anda beli");
            jmlJaket = input.nextInt();
            if (jmlJaket > 100) {
                hargaTotal = (jaket.getHargaB()-5000)*jmlJaket;
            } else {
                hargaTotal = jaket.getHargaB()*jmlJaket;
            }
            break;
        }

        case 3: {
            System.out.println("Anda Telah memilih jaket bahan C");
            System.out.println("Tulis jumlah jaket yang anda beli");
            jmlJaket = input.nextInt();
            if (jmlJaket > 100) {
                hargaTotal = (jaket.getHargaC()-15000)*jmlJaket;
            } else {
                hargaTotal = jaket.getHargaC()*jmlJaket;
            }
            break;
        }
    
        default:
            System.out.println("YANG BENAR BRO!");
            break;
    }
    if (pilihan == 1) {
        typeJaket ='A';
    } else if (pilihan == 2){
         typeJaket = 'B';
    } else {
     typeJaket = 'C';
    }
    System.out.println("Detail Pembelian Anda");
    System.out.printf("%-20s: %c\n","Jenis Bahan", typeJaket);
    System.out.printf("%-20s: %d\n","Jumlah Beli", jmlJaket);
    System.out.printf("%-20s: RP %,3d.00\n","Harga Total", hargaTotal);
    }
}
