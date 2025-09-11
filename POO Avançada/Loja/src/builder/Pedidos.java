package builder;

import abstractfactory.Calcados;
import factory.Compras;
import factory.Eletronico;

public class Pedidos {

    private Compras compras;
    private Calcados calcados;

    public Compras getCompras() {
        return compras;
    }

    public void setCompras(Compras compras) {
        this.compras = compras;
    }

    public Calcados getCalcados() {
        return calcados;
    }

    public void setCalcados(Calcados calcados) {
        this.calcados = calcados;
    }

    @Override
    public String toString() {
        return "Combo: "
                + (compras != null ? compras.getDescricao() : "")
                + (calcados != null ? " + " + calcados.getDescricao() : "");
    }
}
