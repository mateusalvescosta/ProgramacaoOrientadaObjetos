package Imposto.Entities;

public final class PessoaFisica extends Contribuinte{
    private Double gastoSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public Double impostoPago(){
        Double imposto = 0.0;
        if(getRendaAnual() < 20000.00){
            if(getGastoSaude() > 0) {
                imposto += (getRendaAnual() * 0.15) - (getGastoSaude() / 2);
            } else {
                imposto += getRendaAnual() * 0.15;
            }
        }

        else {
            if(getGastoSaude() > 0) {
                imposto += (getRendaAnual() * 0.25) - (getGastoSaude() / 2);
            } else {
                imposto += getRendaAnual() * 0.25;
            }
        }

        return imposto;
    }
}
