package Aplication;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> pessoa = new ArrayList<>();
        
        String escolha = "";
        while(pessoa.size() < 3) {
            System.out.println("digite um nome: ");
            escolha = sc.nextLine();
            pessoa.add(escolha);
        }

        System.out.println("O tamanho da lista é: " + pessoa.size() + "\nE o primeiro da lista é: " + pessoa.get(0));

        for(int i=0; i < pessoa.size(); i++) {
            System.out.println(pessoa.get(i));
        }


    }

}
