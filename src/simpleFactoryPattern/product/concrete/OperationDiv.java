package simpleFactoryPattern.product.concrete;

import simpleFactoryPattern.product.Operation;

public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        return getNumberA() / getNumberB();
    }
}
