package PemLan.Tugas7;

public class Employee implements Payable{
    int registrationNumber;
    String name;
    int salaryPerMonth;
    Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices){
        this.invoices = invoices;
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.salaryPerMonth = salaryPerMonth;
    }

    public void setInvoices(Invoice[] invoices) {
        this.invoices = invoices;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setSalaryPerMonth(int salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    public String getName() {
        return name;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    @Override
    public double getPayableAmount() {
        // TODO Auto-generated method stub
        int totalInvoices = 0;
        for (Invoice invoice : invoices) {
            totalInvoices += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoices;
    }

    public void tampilan(){
        System.out.printf("%-20s: %s\n", "Employee", name);
        System.out.printf("%-20s: %s\n","Nomer Registrasi", registrationNumber);
        System.out.printf("%-20s: %s\n","Gaji/Bulan", salaryPerMonth);
        System.err.println("Invoices");
        System.out.print("\tProduk\t\tJumlah\t\t\tHarga\t\t\tTotal");
        for(Invoice invoice : getInvoices()){
            System.out.printf("\n%10s\t\t%5d\t\t%8d\t\t%10d", invoice.getProductName(), invoice.getQuantity(), invoice.getPricePerItem(), invoice.getQuantity() * invoice.getPricePerItem());
        }
        System.out.printf("\nGaji Bersih\t: %.0f\n", this.getPayableAmount());
        System.out.println("");
    }
}
