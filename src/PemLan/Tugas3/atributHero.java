package PemLan.Tugas3;

public class atributHero {
    private String name;
    private double atk;
    private double hp;
    private double defense;
    private double aspd;

    public atributHero(){

    }

    public atributHero(String name, double atk, double hp, double defense, double aspd){
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.defense = defense;
        this.aspd = aspd;
    }

    public void setAtk(double atk) {
        this.atk = atk;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public void setAspd(double atkspd) {
        this.aspd = atkspd;
    }

    public double getAtk() {
        return atk;
    }

    public double getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public double getDefense() {
        return defense;
    }

    public double getAspd() {
        return aspd;
    }

    public void attack(atributHero hero2){
        System.out.printf("%s menyerang  %s \n\n", this.getName(), hero2.getName());
        hero2.setHp(hero2.getHp() - (this.atk - hero2.getDefense()));
        System.out.printf("%s memberikan damage sebesar %s \n", this.getName(), Double.toString(this.atk - hero2.getDefense()));
        System.out.printf("sisa hp dari %s adalah %s \n\n", hero2.getName(), Double.toString(hero2.getHp()));
    }
}
