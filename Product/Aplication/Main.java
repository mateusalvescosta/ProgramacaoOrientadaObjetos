package Product.Aplication;

import Product.Entities.ImportedProduct;
import Product.Entities.Product;
import Product.Entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.print("Insira o número de produtos: ");
        int number = sc.nextInt();

        for(int i=0; i < number; i++) {
            System.out.println("\nInsira a informação do #" + (i+1) + " produto:");
            System.out.print("Novo, usado ou importado ? ");
            char character = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome do produto: ");
            String name = sc.nextLine();

            System.out.print("Preço do produto: ");
            Double price = sc.nextDouble();
            sc.nextLine();


            if(character == 'i' || character == 'I') {

                System.out.print("Taxa de importação: ");
                Double customsFee = sc.nextDouble();

                ImportedProduct imp = new ImportedProduct(name, price+customsFee, customsFee);
                product.addProduct(imp);

            } else if (character == 'u' || character == 'U') {
                System.out.print("Data de fabricação: ");
                String manufactureDate = sc.nextLine();

                DateTimeFormatter formatted = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dateHour = LocalDate.parse(manufactureDate, formatted);

                UsedProduct use = new UsedProduct(name, price, dateHour);
                product.addProduct(use);

            } else {
                Product newProduct = new Product(name, price);
                product.addProduct(newProduct);
            }
        }

        System.out.println("\nTabela de preços:");
        for(Product p : product.getProducts()) {
            System.out.print(p.getName() + " R$" + p.getPrice() + " " + p.priceTag() + "\n");
        }
    }
}
