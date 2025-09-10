package singleton;

import entities.Pedido;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPedidos {
    private List<Pedido> pedidos = new ArrayList<>();

    private GerenciadorPedidos() {}

    private static class Holder {
        private static final  GerenciadorPedidos INSTANCE = new GerenciadorPedidos();
    }

    public static GerenciadorPedidos getInstance() {
        return Holder.INSTANCE;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido adicionado: " + pedido);
    }

    public void listarPedidos() {
        System.out.println("=== Pedidos Registrados ===");
        pedidos.forEach(System.out::println);
    }



}
