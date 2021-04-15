package abstractfactorypattern.product.normal.concrete;

import abstractfactorypattern.product.normal.Operation;

public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
