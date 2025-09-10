package Prototype;

public abstract class PedidoPrototype implements Cloneable{

    private String descricao;

    public PedidoPrototype(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract PedidoPrototype clone();

}
