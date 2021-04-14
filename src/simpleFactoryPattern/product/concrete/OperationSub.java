package simpleFactoryPattern.product.concrete;

import simpleFactoryPattern.product.Operation;

public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
