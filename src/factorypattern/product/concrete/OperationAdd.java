package factorypattern.product.concrete;

import factorypattern.product.Operation;

public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
