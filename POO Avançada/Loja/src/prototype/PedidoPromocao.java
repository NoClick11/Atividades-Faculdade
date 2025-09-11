package prototype;

public class PedidoPromocao extends PedidosPrototype {

    public PedidoPromocao(String descricao) {
        super(descricao);
    }

    @Override
    public PedidosPrototype clone() {
        return new PedidoPromocao(this.getDescricao());
    }
}
