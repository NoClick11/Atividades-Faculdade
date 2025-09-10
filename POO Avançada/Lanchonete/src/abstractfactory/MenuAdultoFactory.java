package abstractfactory;

import factory.Lanche;
import factory.Pizza;

import java.awt.*;

public class MenuAdultoFactory implements MenuFactory {
    @Override
    public Lanche criarLanche() {
        return new Pizza();
    }

    @Override
    public Bebida criarBebida() {
        return new Refrigerante();
    }
}
