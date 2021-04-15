package abstractfactorypattern.product.normal.concrete;

import abstractfactorypattern.product.normal.Operation;

public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        return getNumberA() / getNumberB();
    }
}
