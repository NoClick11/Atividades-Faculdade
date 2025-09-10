package factory;

public class PizzaFactory extends LancheFactory{
    @Override
    public Lanche criarLanche() {
        return new Pizza();
    }
}
