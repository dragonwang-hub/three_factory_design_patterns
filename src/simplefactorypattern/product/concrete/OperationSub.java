package simplefactorypattern.product.concrete;

import simplefactorypattern.product.Operation;

public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
