package factorypattern.product.concrete;

import factorypattern.product.Operation;

public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        return getNumberA() / getNumberB();
    }
}
