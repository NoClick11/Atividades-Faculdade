package entities;

import abstractfactory.Calcados;
import factory.Alimento;
import factory.Compras;
import factory.Eletronico;

public class Produto {

    private static int contador=0;
    private final int id;
    private Compras compras;
    private Calcados calcados;

    public Produto(Compras compras, Calcados calcados) {
        this.id = contador++;
        this.compras = compras;
        this.calcados = calcados;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Produto.contador = contador;
    }

    public int getId() {
        return id;
    }

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
        calcados = calcados;
    }

    public String toString() {
        return "Pedido #" + id + ": "
                + (compras != null ? compras.getDescricao() : "")
                + (calcados != null ? " + " + calcados.getDescricao() : "");
    }

}
