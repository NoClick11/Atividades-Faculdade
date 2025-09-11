package builder;

import abstractfactory.Calcados;
import factory.Compras;

public class PedidosBuilder {

    Pedidos pedido = new Pedidos();

    public PedidosBuilder adicionarCalcados(Calcados calcados){
        pedido.setCalcados(calcados);
        return this;
    }

    public PedidosBuilder adicionarCompras(Compras compras) {
        pedido.setCompras(compras);
        return this;
    }

    public Pedidos build() {
        return pedido;
    }

}
