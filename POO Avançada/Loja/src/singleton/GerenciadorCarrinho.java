package singleton;

import entities.Produto;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorCarrinho {

    private List<Produto> carrinho = new ArrayList<>();

    private GerenciadorCarrinho() {}

    private static class Holder {
        private static final GerenciadorCarrinho INSTANCE = new GerenciadorCarrinho();
    }

    public static GerenciadorCarrinho getInstance() {
        return Holder.INSTANCE;
    }

    public void adicionarCompras(Produto produto) {
        carrinho.add(produto);
        System.out.println("Produto adicionado: " + produto);
    }

    public void listarProdutos() {
        System.out.println("=== Pedidos Registrados ===");
        carrinho.forEach(System.out::println);
    }



}
