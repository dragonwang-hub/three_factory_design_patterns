package abstractfactorypattern.factory.concrete;

import abstractfactorypattern.factory.IFactory;
import abstractfactorypattern.product.normal.Operation;
import abstractfactorypattern.product.normal.concrete.OperationMul;
import abstractfactorypattern.product.strict.StrictOperation;
import abstractfactorypattern.product.strict.concrete.StrictOperationMul;

public class MulFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }

    @Override
    public StrictOperation createStrictOperation() {
        return new StrictOperationMul();
    }
}
