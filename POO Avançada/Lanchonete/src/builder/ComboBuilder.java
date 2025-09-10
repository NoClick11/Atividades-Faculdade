package builder;


import abstractfactory.Bebida;
import factory.Lanche;

public class ComboBuilder {

    private Combo combo = new Combo();

    public ComboBuilder adicionarLanche(Lanche lanche) {
        combo.setLanche(lanche);
        return this;
    }

    public ComboBuilder adicionarBebida(Bebida bebida) {
        combo.setBebida(bebida);
        return this;
    }

    public ComboBuilder adicionarSobremesa(String sobremesa) {
        combo.setSobremesa(sobremesa);
        return this;
    }

    public Combo build() {
        return combo;
    }


}
