package Imposto.Entities;

public final class PessoaJuridica extends Contribuinte{
    private Integer numeroDeEmpregados;

    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeEmpregados) {
        super(nome, rendaAnual);
        this.numeroDeEmpregados = numeroDeEmpregados;
    }

    public Integer getNumeroDeEmpregados() {
        return numeroDeEmpregados;
    }

    public void setNumeroDeEmpregados(Integer numeroDeEmpregados) {
        this.numeroDeEmpregados = numeroDeEmpregados;
    }

    @Override
    public Double impostoPago(){
        Double imposto = 0.0;
        if(getNumeroDeEmpregados() > 10) {
            imposto += getRendaAnual() * 0.14;
        }

        else{
            imposto += getRendaAnual() * 0.16;
        }

        return imposto;
    }
}
