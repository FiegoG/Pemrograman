package PemLan.Kelas;


public class Mobil {
    protected String noPol;
    protected int kapasitas;

    public Mobil(){

    }

    public void setNoPol(String noPol) {
        this.noPol = noPol;
    }

    public String getNoPol() {
        return noPol;
    }

}

class Angkot extends Mobil{
    private driverAngkot driverAngkot;
    private penumpang[] dataPenumpang;

    public Angkot(String noPol, int kapasitas){
        this.noPol = noPol;
        this.kapasitas = kapasitas;
        this.dataPenumpang = new penumpang[this.kapasitas];
    }

    public void setDriverAngkot(driverAngkot driverAngkot) {
        this.driverAngkot = driverAngkot;
    }

    public driverAngkot getDriverAngkot() {
        return driverAngkot;
    }

    public void tambahPenumpang(penumpang penumpang){
        for(int i = 0; i < this.dataPenumpang.length; i++){
            if(this.dataPenumpang[i] == null){
                this.dataPenumpang[i] = penumpang;
                break;
            }
        }
    }

    public void tampilan(){
        System.out.println("Informasi Kendaraan");
        System.out.printf("%-15s : %s\n", "Nomor Polisi", this.noPol);
        System.out.printf("%-15s : %s\n", "Sopir", this.getDriverAngkot().getNama());
        System.out.printf("%-15s : %d %s\n", "Kapasitas", this.kapasitas, "penumpang");
        System.out.println("Data Penumpang : ");
        for(int i = 0; i < dataPenumpang.length; i++){
            if(dataPenumpang[i] != null){
                System.out.printf("%3s %s\n", "-", dataPenumpang[i].getNama());
            }
        }
    }

}

class Bus extends Mobil{
    private driverBus driverBus;
    private penumpang[] dataPenumpang;

    public Bus(String noPol, int kapasitas){
        this.noPol = noPol;
        this.kapasitas = kapasitas;
        this.dataPenumpang = new penumpang[this.kapasitas];
    }

    public void setDriverBus(driverBus driverBus) {
        this.driverBus = driverBus;
    }

    public driverBus getDriverBus() {
        return driverBus;
    }

    public void tambahPenumpang(penumpang penumpang){
        for(int i = 0; i < this.dataPenumpang.length; i++){
            if(this.dataPenumpang[i] == null){
                this.dataPenumpang[i] = penumpang;
                break;
            }
        }
    }

    public void tampilan(){
        System.out.println("Informasi Kendaraan");
        System.out.printf("%-15s : %s\n", "Nomor Polisi", this.noPol);
        System.out.printf("%-15s : %s\n", "Sopir", this.getDriverBus().getNama());
        System.out.printf("%-15s : %d %s\n", "Kapasitas", this.kapasitas, "penumpang");
        System.out.println("Data Penumpang : ");
        for(int i = 0; i < dataPenumpang.length; i++){
            if(dataPenumpang[i] != null){
                System.out.printf("%3s %s\n", "-", dataPenumpang[i].getNama());
            }
        }
    }
}

class orang{
    protected String nama;

    public orang(){

    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class driverAngkot extends orang{
    private boolean simA = true;

    public driverAngkot(){

    }

    public driverAngkot(String nama, String sim) {
        this.nama = nama;
        this.simA = sim.equalsIgnoreCase("A")? true : false; 
    }
    
    public void setSimA(boolean simA) {
        this.simA = simA;
    }

    public void narikAngkot(boolean params, Angkot angkot){
        if(this.simA){
            if(params) {
                System.out.printf("Driver angkot dengan nama %s siap mengemudi\n", this.nama);
                angkot.setDriverAngkot(this);
            }
            else {
                System.out.printf("Driver angkot dengan nama %s berhenti narik\n", this.nama);
                angkot.setDriverAngkot(null);;
            }
        }
        else if(simA == false && params == true) System.out.println("Maaf, Sopir tidak diijinkan mengemudi angkot karena tidak mempunyai SIM A");
    }
}

class driverBus extends orang{
    private boolean simB = true;

    public driverBus(){

    }

    public driverBus(String nama, String sim){
        this.nama = nama;
        this.simB = sim.equalsIgnoreCase("B")? true : false; 
    }

    public void setSimB(boolean simB) {
        this.simB = simB;
    }

    public void narikBus(boolean narik, Bus bus){
        if(this.simB){
            if(narik) {
                System.out.printf("Driver bus dengan nama %s siap mengemudi\n", this.nama);
                bus.setDriverBus(this);
            }
            else {
                System.out.printf("Driver bus dengan nama %s berhenti narik\n", this.nama);
                bus.setDriverBus(null);
            }
        }
        else if(simB == false && narik == true) System.out.println("Maaf, anda tidak diijinkan mengemudi bus karena tidak mempunyai SIM B");
    }
}

class penumpang extends orang{

    public penumpang(String nama){
        this.nama = nama;
    }

    public void naik(Mobil mobil){
        if(mobil instanceof Angkot){
            //mobil bagaikan anggota dari kelas angkot
            ((Angkot)mobil).tambahPenumpang(this);
            System.out.printf("Penumpang dengan nama %s telah naik angkot dengan nopol %s\n", this.nama, mobil.noPol);
        } else if (mobil instanceof Bus) {
            ((Bus)mobil).tambahPenumpang(this);
            System.out.printf("Penumpang dengan nama %s telah naik bus dengan nopol %s\n", this.nama, mobil.noPol);
        }
    }
}
class Main{
    public static void main(String[] args) {
        Angkot angkot1 = new Angkot("AG0000NG", 15);
        Bus bus1 = new Bus("AG1111YU", 50);

        driverAngkot driver1 = new driverAngkot("wahyudi", "a");
        driverBus driver2 = new driverBus("Rudi", "B");

        driver1.narikAngkot(true, angkot1);
        driver2.narikBus(true, bus1);

        penumpang penumpang1 = new penumpang("Andi");
        penumpang penumpang2 = new penumpang("Budi");
        penumpang penumpang3 = new penumpang("Cecil");
        penumpang penumpang4 = new penumpang("Doni");
        penumpang penumpang5 = new penumpang("Ena");

        penumpang1.naik(bus1);
        penumpang2.naik(angkot1);
        penumpang3.naik(bus1);
        penumpang4.naik(angkot1);
        penumpang5.naik(bus1);

        angkot1.tampilan();
        bus1.tampilan();
    } 
}
