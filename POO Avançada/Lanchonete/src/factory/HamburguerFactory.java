package factory;

public class HamburguerFactory extends LancheFactory{

    @Override
    public Lanche criarLanche() {
        return new Hamburguer();
    }
}
