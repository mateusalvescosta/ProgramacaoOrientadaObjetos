package Payment.Services;

import Payment.Entities.Product;
import Payment.Entities.Installment;

import java.time.LocalDate;


public class ProductService {
    private OnlinePaymentService paymentService;

    public ProductService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processProduct(Product product, Integer months){

        Double installmentValue = product.getTotalValue() / months;

        for(int i=0; i < months; i++) {
           LocalDate datePayment = product.getDate().plusMonths(1+i);

           installmentValue = installmentValue + (paymentService.interest(installmentValue, i+1));
           Double dueAmount = installmentValue + paymentService.paymentFee(installmentValue);

           Installment installment = new Installment(datePayment, dueAmount);

           product.addInstallment(installment);
        }

    }

}
