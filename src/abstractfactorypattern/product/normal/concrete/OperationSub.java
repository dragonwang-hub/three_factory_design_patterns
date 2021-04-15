package abstractfactorypattern.product.normal.concrete;

import abstractfactorypattern.product.normal.Operation;

public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
