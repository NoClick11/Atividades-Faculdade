package abstractfactory;

import factory.Compras;
import factory.Eletronico;

public class FornecedorInternacionalFactory implements FornecedorFactory {
    @Override
    public Compras criarCompras() {
        return new Eletronico();
    }

    @Override
    public Calcados criarCalcados() {
        return new Salto();
    }
}
