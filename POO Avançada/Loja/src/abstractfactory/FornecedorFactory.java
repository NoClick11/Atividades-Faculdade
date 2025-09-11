package abstractfactory;

import factory.Compras;

public interface FornecedorFactory {
    Compras criarCompras();
    Calcados criarCalcados();
}
