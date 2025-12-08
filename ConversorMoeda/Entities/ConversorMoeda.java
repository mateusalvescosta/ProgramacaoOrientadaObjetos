package Entities;

public class ConversorMoeda implements ConversãoFinanceira{

    @Override
    public double converterDolarParaReal(double dolar, double real) {
        return dolar * real;
    }

}



