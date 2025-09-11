import abstractfactory.FornecedorFactory;
import abstractfactory.FornecedorInternacionalFactory;
import abstractfactory.Salto;
import abstractfactory.Tenis;
import builder.Pedidos;
import builder.PedidosBuilder;
import entities.Produto;
import factory.Alimento;
import factory.AlimentoFactory;
import factory.Compras;
import factory.Eletronico;
import prototype.PedidoPromocao;
import prototype.PedidosPrototype;
import singleton.GerenciadorCarrinho;

public class Main {
    public static void main(String[] args) {
        GerenciadorCarrinho gerenciador = GerenciadorCarrinho.getInstance();

        Compras c1 = new AlimentoFactory().criarCompras();
        Compras c2 = new AlimentoFactory().criarCompras();

        Produto p1 = new Produto(new Eletronico(), new Tenis());
        Produto p2 = new Produto(new Alimento(), new Salto());

        gerenciador.adicionarCompras(p1);
        gerenciador.adicionarCompras(p2);

        FornecedorFactory internacional = new FornecedorInternacionalFactory();

        Produto p3 = new Produto(internacional.criarCompras(), internacional.criarCalcados());
        gerenciador.adicionarCompras(p3);

        Pedidos pedido = new PedidosBuilder().adicionarCompras(new Eletronico()).adicionarCalcados(new Tenis()).build();
        System.out.println(pedido);

        PedidosPrototype pedidoBase = new PedidoPromocao("Roupa promocional");
        PedidosPrototype pedidoClone = pedidoBase.clone();
        System.out.println("Clonado: " + pedidoClone.getDescricao());

        gerenciador.listarProdutos();

    }
}