package Pedido.Entities;

import Pedido.Enums.StatusPedido;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDateTime momento;
    private StatusPedido status;

    private List<PedidoItem> pedidoItem = new ArrayList<>();
    private Cliente cliente;

    public Pedido(){
    }

    public Pedido(LocalDateTime momento, StatusPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public List<PedidoItem> getItem() {
        return pedidoItem;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(PedidoItem item) {
        pedidoItem.add(item);
    }
    public void removerItem(PedidoItem item) {
        pedidoItem.remove(item);
    }

    public double Total() {
        Double total = 0.0;
        for(PedidoItem i : pedidoItem) {
           total += i.subTotal();
        }
        return total;
    }
}
