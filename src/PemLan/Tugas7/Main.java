package PemLan.Tugas7;

public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("SSD", 1, 100);
        Invoice invoice2 = new Invoice("RAM", 2, 50);
        Invoice invoice3 = new Invoice("Set Obeng", 1, 10);
        Invoice[] invoices1 = {invoice1, invoice2, invoice3};

        Employee employee1 = new Employee(007, "Alexa", 1000, invoices1);
        employee1.tampilan();
    }
}
