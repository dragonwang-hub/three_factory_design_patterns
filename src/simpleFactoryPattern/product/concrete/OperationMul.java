package simpleFactoryPattern.product.concrete;

import simpleFactoryPattern.product.Operation;

public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
