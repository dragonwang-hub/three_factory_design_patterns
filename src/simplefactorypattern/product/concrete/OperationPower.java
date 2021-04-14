package simplefactorypattern.product.concrete;

import simplefactorypattern.product.Operation;

public class OperationPower extends Operation {
    @Override
    public double getResult() {
        return Math.pow(getNumberA(),getNumberB());
    }
}
