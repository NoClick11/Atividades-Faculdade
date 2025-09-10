import Prototype.PedidoPadrao;
import Prototype.PedidoPrototype;
import abstractfactory.*;
import builder.Combo;
import builder.ComboBuilder;
import entities.Pedido;
import factory.Hamburguer;
import factory.HamburguerFactory;
import factory.Lanche;
import factory.PizzaFactory;
import singleton.GerenciadorPedidos;

public class Main {
    public static void main(String[] args) {
        GerenciadorPedidos gerenciador = GerenciadorPedidos.getInstance();

        Lanche lanche1 = new HamburguerFactory().criarLanche();
        Lanche lanche2 = new PizzaFactory().criarLanche();

        Pedido p1 = new Pedido(lanche1, new Refrigerante(), null, "sem cebola");
        Pedido p2 = new Pedido(lanche2, null, "Pudim", "");

        gerenciador.adicionarPedido(p1);
        gerenciador.adicionarPedido(p2);

        MenuFactory infantil = new MenuInfantilFactory();
        Pedido p3 = new Pedido(infantil.criarLanche(), infantil.criarBebida(), null, "Brinquedo incluso");
        gerenciador.adicionarPedido(p3);

        Combo combo = new ComboBuilder().adicionarLanche(new Hamburguer()).adicionarBebida(new Suco()).adicionarSobremesa("Sorvete").build();
        System.out.println(combo);

        PedidoPrototype pedidoBase = new PedidoPadrao("Pedido padrão: X-Salada + Refri");
        PedidoPrototype pedidoClone = pedidoBase.clone();
        System.out.println("Clonado: " + pedidoClone.getDescricao());

        gerenciador.listarPedidos();
    }
}