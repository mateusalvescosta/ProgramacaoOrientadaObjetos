package Imposto.Aplication;

import Imposto.Entities.Contribuinte;
import Imposto.Entities.PessoaFisica;
import Imposto.Entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Insira o número de contribuintes: ");
        int numero = sc.nextInt();
        System.out.println(" ");

        for(int i=0; i < numero; i++) {
            System.out.println("Insira o #" + (i+1) + " contribuinte: ");
            System.out.print("Pessoa física ou jurídica (f/j): ");
            char escolha = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Informe o nome: ");
            String nome = sc.nextLine();
            System.out.print("Informe a renda anual:");
            Double rendaAnual = sc.nextDouble();

            if(escolha == 'f' || escolha == 'F'){
                System.out.print("Informe o gastos médicos: ");
                Double gastoSaude = sc.nextDouble();
                System.out.println(" ");

                PessoaFisica pf = new PessoaFisica(nome, rendaAnual, gastoSaude);
                list.add(pf);
            } else{
                System.out.print("Informe o número de funcionários: ");
                Integer numeroDeFuncionarios = sc.nextInt();
                System.out.println(" ");

                PessoaJuridica pj = new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios);
                list.add(pj);
            }

        }
        Double soma = 0.0;
        System.out.println("Contribuintes: ");
        for(Contribuinte c : list){
            System.out.printf(c.getNome() + ": R$%.2f\n", c.impostoPago());
            soma += c.impostoPago();
        }

        System.out.println("\nTotal de impostos arrecadado: R$" + soma);
    }
}
