package factory;

public class AlimentoFactory extends ComprasFactory{


    @Override
    public Compras criarCompras() {
        return new Alimento();
    }
}
