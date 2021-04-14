package simplefactorypattern.product.concrete;

import simplefactorypattern.product.Operation;

public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
