package abstractfactory;

import factory.Hamburguer;
import factory.Lanche;

public class MenuInfantilFactory implements MenuFactory{
    @Override
    public Lanche criarLanche() {
        return new Hamburguer();
    }

    @Override
    public Bebida criarBebida() {
        return new Suco() {
        };
    }
}
