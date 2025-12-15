package Product.Entities;

import java.util.List;
import java.util.ArrayList;

public class Product {

    private String name;
    private Double price;

    private ImportedProduct importedProduct;
    private UsedProduct usedProduct;

    private List<Product> products = new ArrayList<>();

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ImportedProduct getImportedProduct() {
        return importedProduct;
    }

    public void setImportedProduct(ImportedProduct importedProduct) {
        this.importedProduct = importedProduct;
    }

    public UsedProduct getUsedProduct() {
        return usedProduct;
    }

    public void setUsedProduct(UsedProduct usedProduct) {
        this.usedProduct = usedProduct;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public String priceTag() {
        return " ";
    }

}
