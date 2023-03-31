package PemLan.Tugas3;

import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Pemainan Adu Hero");
        System.out.println("Silahkan masukkan hero anda");
        System.out.println("!!SILAHKAN MASUKKAN ANGKA APA SAJA YANG PENTING TIDAK NEGATIF");
        System.out.println("==============================");
        atributHero hero1 = new atributHero();
        System.out.println("Nama Hero : ");
        hero1.setName(input.next());
        System.out.println("Attack Hero : ");
        hero1.setAtk(input.nextDouble());
        System.out.println("Health Point : ");
        hero1.setHp(input.nextDouble());
        System.out.println("Defence : ");
        hero1.setDefense(input.nextDouble());
        System.out.println("Attack Speed : ");
        hero1.setAspd(input.nextDouble());
        System.out.println("==============================");

        System.out.println("==============================");
        System.out.println("Nama Hero : ");
        String nama = input.next();
        System.out.println("Attack Hero : ");
        double atk = input.nextDouble();
        System.out.println("Health Point : ");
        double hp = input.nextDouble();
        System.out.println("Defence : ");
        double defence = input.nextDouble();
        System.out.println("Attack Speed : ");
        double aspd = input.nextDouble();
        System.out.println("==============================");
        atributHero hero2 = new atributHero(nama, atk, hp, defence, aspd);

        if (hero1.getDefense() >= hero2.getAtk()){
            hero2.setAtk(hero1.getDefense() + 1);
        }
        if(hero2.getDefense() >= hero1.getAtk()){
            hero1.setAtk(hero2.getDefense() + 1);
        }

        int round = 0;
        int countAttack = 0;
        boolean attackfirst;

        if(hero1.getAspd() > hero2.getAspd()){
            attackfirst = true;
        } else {
            attackfirst = false;
        }
        
        while(hero1.getHp() > 0 && hero2.getHp() > 0){
            if(countAttack % 2 == 0) {
                System.out.println("==============================");
                System.out.println("==============================");  
                round++;
                System.out.printf("Ronde %d\n", round);
            }
            if(attackfirst) hero1.attack(hero2);
            else hero2.attack(hero1);

            countAttack++;
            attackfirst = !attackfirst;
        }

        
        System.out.println("\nPermainan Telah Berakhir");
        if (hero1.getHp() > hero2.getHp()) {
            System.out.printf("%s telah kalah\n", hero2.getName());
            System.out.println("==============================");
            System.out.printf("%s telah memenangkan pertandingan", hero1.getName());
        } else {
            System.out.printf("%s telah kalah\n", hero1.getName());
            System.out.println("==============================");
            System.out.printf("%s telah memenangkan pertandingan\n", hero2.getName());
        }
        returnMain();
        
    }
    public static void returnMain(){
        System.out.println("apakah anda ingin bermain lagi? Y/N");
        char pilihan;
        input.nextLine();
        pilihan = input.nextLine().charAt(0);
        if (pilihan == 'Y' || pilihan == 'y') {
            main(null);
        }
        else if(pilihan == 'N' || pilihan == 'n') System.out.println("Program berhenti, Terimakasih Telah Bermain");
        else {
            System.out.println("ERROR: Input invalid");
            returnMain();
        }
    }
}
