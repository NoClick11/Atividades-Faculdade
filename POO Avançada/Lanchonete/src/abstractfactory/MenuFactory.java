package abstractfactory;

import factory.Lanche;

public interface MenuFactory {
    Lanche criarLanche();
    Bebida criarBebida();
}
