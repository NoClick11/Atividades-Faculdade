package Prototype;

public class PedidoPadrao extends PedidoPrototype {

    public PedidoPadrao(String descricao) {
        super(descricao);
    }

    @Override
    public PedidoPrototype clone() {
        return new PedidoPadrao(this.getDescricao());
    }
}
