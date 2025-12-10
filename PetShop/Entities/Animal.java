package Entities;

public class Animal {
    private String nome;
    private int idade;
    private double peso;

    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "O pet de nome " + nome + " possui " + idade + " anos e pesa " + peso + " quilos";
    }

}
