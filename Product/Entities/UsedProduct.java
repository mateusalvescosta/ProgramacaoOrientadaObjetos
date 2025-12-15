package Product.Entities;

import java.time.LocalDate;


public final class UsedProduct extends Product{
    private LocalDate manufactureDate;

    public UsedProduct(){
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public final String priceTag(){
        return "(Manufacture date: " + manufactureDate + ")";
    }

}
