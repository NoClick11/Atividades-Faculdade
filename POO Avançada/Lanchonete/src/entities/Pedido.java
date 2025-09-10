package entities;

import abstractfactory.Bebida;
import factory.Lanche;

public class Pedido {

    private static int contador=0;
    private final int id;
    private Lanche lanche;
    private Bebida bebida;
    private String sobremesa;
    private String observacoes;

    public Pedido(Lanche lanche, Bebida bebida, String sobremesa, String observacoes) {
        this.id = ++contador;
        this.lanche = lanche;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
        this.observacoes = observacoes;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Pedido.contador = contador;
    }

    public int getId() {
        return id;
    }

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

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String toString() {
        return "Pedido #" + id + ": "
                + (lanche != null ? lanche.getDescricao() : "")
                + (bebida != null ? " + " + bebida.getDescricao() : "")
                + (sobremesa != null ? " + " + sobremesa : "")
                + (observacoes != null && !observacoes.isEmpty() ? " [" + observacoes + "]" : "");
    }

}
