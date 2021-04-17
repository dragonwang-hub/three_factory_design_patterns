package abstractfactorypattern.product.div;

public class OperationDiv extends Div {
    @Override
    public double getResult() {
        return getNumberA() / getNumberB();
    }
}
