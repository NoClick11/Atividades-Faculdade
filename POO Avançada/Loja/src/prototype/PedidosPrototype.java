package prototype;

public abstract class PedidosPrototype implements Cloneable{

    private String descricao;

    public PedidosPrototype(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract PedidosPrototype clone();

}