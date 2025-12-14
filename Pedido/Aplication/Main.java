package Pedido.Aplication;

import Pedido.Entities.Cliente;
import Pedido.Enums.StatusPedido;
import Pedido.Entities.Pedido;
import Pedido.Entities.PedidoItem;
import Pedido.Entities.Produto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        LocalDateTime dataHoraBrasil = LocalDateTime.now();

        System.out.println("Insira as informações do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        Cliente cliente = new Cliente(nome, email);

        System.out.println("Insira as informações do pedido: ");
        System.out.print("Status: ");
        StatusPedido status = StatusPedido.valueOf(sc.next());

        Pedido pedido = new Pedido(dataHoraBrasil, status, cliente);

        System.out.print("Quantos produtos terão no pedido: ");
        int numeroProdutos = sc.nextInt();

        System.out.println(" ");
        for(int i =0; i < numeroProdutos; i++) {
            System.out.println("Insira a informação do #" + (i + 1) + " produto:");
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            Double precoProduto = (sc.nextDouble());
            System.out.print("Quantidade do produto: ");
            Integer quantidade = sc.nextInt();
            System.out.println(" ");

            Produto produto = new Produto(nomeProduto, precoProduto);
            PedidoItem item = new PedidoItem(quantidade, produto);
            pedido.adicionarItem(item);
        }

        System.out.println("Resumo do pedido:");
        System.out.println("Realizado em: " + pedido.getMomento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println("Status: " + pedido.getStatus());
        System.out.println("Cliente: " + cliente.getNome() + " - " + cliente.getEmail());

        System.out.println("\nProdutos do pedido:");
        for(PedidoItem p : pedido.getItem()) {
            int posicao = 1;
            System.out.printf(p.getProduto().getNome() + ", Quantidade: " + p.getQuantidade() + ", Subtotal: R$%.2f\n", p.subTotal());
        }
        System.out.println("\nPreço total do pedido: R$" + pedido.Total());

    }
}
