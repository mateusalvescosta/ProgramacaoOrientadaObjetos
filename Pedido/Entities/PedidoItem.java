package Pedido.Entities;

public class PedidoItem {
    private Integer quantidade;
    private Produto produto;

    public PedidoItem() {
    }

    public PedidoItem(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double subTotal(){
        double subTotal = 0;
        subTotal = quantidade * produto.getPreco();
        return subTotal;
    }

}

