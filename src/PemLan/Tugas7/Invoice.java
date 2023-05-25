package PemLan.Tugas7;

public class Invoice implements Payable{
    String productName;
    int quantity;
    int pricePerItem;

    public Invoice(String productName, Integer quantity, Integer pricePerItem){
        this.pricePerItem = pricePerItem;
        this.productName = productName;
        this.quantity = quantity;
    }
    public void setPricePerItem(Integer pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPricePerItem() {
        return pricePerItem;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public double getPayableAmount() {
        // TODO Auto-generated method stub
        return quantity * pricePerItem;
    }
}
