package abstractfactorypattern.product.strict.concrete;

import abstractfactorypattern.product.strict.StrictOperation;

public class StrictOperationDiv extends StrictOperation {
    @Override
    public double getResult() {
        return getNumberA() / getNumberB();
    }
}
