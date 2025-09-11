package factory;

public class EletronicoFactory extends ComprasFactory {

    @Override
    public Compras criarCompras() {
        return new Eletronico();
    }
}
