package Produto2.Aplication;

import Produto2.Entities.Produto;
import java.util.ArrayList;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        ArrayList<Produto> lista = new ArrayList<>();

        Produto produto1 = new Produto("sabão em pó", 19.99);
        Produto produto2 = new Produto("Macarrão", 7.99);
        Produto produto3 = new Produto("Fermento Biológico", 10.99);

        lista.add(produto1);
        lista.add(produto2);
        lista.add(produto3);

        System.out.println(produto.calculaMedia(lista));

    }
}
