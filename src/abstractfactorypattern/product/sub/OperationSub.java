package abstractfactorypattern.product.sub;

public class OperationSub extends Sub {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
