package builder;

import abstractfactory.Bebida;
import factory.Lanche;

public class Combo {

    private Lanche lanche;
    private Bebida bebida;
    private String sobremesa;

    public Lanche getLanche() {
        return lanche;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
    }

    @Override
    public String toString() {
        return "Combo: "
                + (lanche != null ? lanche.getDescricao() : "")
                + (bebida != null ? " + " + bebida.getDescricao() : "")
                + (sobremesa != null ? " + " + sobremesa : "");
    }

}
