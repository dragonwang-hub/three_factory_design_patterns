package factorypattern.product.concrete;

import factorypattern.product.Operation;

public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
