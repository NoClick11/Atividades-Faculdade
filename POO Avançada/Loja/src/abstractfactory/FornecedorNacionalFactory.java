package abstractfactory;

import factory.Alimento;
import factory.Compras;

public class FornecedorNacionalFactory implements FornecedorFactory{
    @Override
    public Compras criarCompras() {
        return new Alimento();
    }

    @Override
    public Calcados criarCalcados() {
        return new Tenis();
    }
}
