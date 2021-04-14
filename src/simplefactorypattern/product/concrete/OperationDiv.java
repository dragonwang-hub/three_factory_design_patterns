package simplefactorypattern.product.concrete;

import simplefactorypattern.product.Operation;

public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        return getNumberA() / getNumberB();
    }
}
