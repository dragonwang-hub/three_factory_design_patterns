package abstractfactorypattern.product.add;

public class OperationAdd extends Add {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
