package Produto2.Entities;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;

    public Produto() {

    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double calculaMedia(ArrayList<Produto> lista) {
        double somaPreco = 0;
        for (int i = 0; i < lista.size(); i++) {
                somaPreco += lista.get(i).getPreco();
        }
        return somaPreco/lista.size();
    }
}
