package Payment.Services;

public class PaypalService implements OnlinePaymentService{

    @Override
    public Double interest(Double amount, Integer months) {
        return amount * 0.01;
    }
    @Override
    public Double paymentFee(Double amount) {
        return amount * 0.02;
    }


}
