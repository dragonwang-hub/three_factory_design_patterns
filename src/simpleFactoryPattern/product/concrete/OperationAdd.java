package simpleFactoryPattern.product.concrete;

import simpleFactoryPattern.product.Operation;

public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
