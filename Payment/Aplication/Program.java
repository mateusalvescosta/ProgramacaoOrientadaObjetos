package Payment.Aplication;

import Payment.Entities.Product;
import Payment.Entities.Installment;
import Payment.Services.ProductService;
import Payment.Services.PaypalService;

import java.time.LocalDate;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os dados do produto:");
        System.out.print("Número do produto: ");
        Integer number = sc.nextInt();
        System.out.print("Valor do produto: ");
        Double totalValue = sc.nextDouble();

        Product product = new Product(number, LocalDate.now(), totalValue);

        System.out.print("Insira o numero de parcelas: ");
        Integer months = sc.nextInt();

        ProductService productService = new ProductService(new PaypalService());

        productService.processProduct(product, months);

        System.out.println("\nParcelas: ");
        for(Installment list : product.getInstallments()) {
            System.out.printf(list.getDueDate() + " - R$%.2f\n", list.getAmount());
        }
    }
}
