package abstractfactorypattern.factory.concrete;

import abstractfactorypattern.factory.IFactory;
import abstractfactorypattern.product.normal.Operation;
import abstractfactorypattern.product.normal.concrete.OperationSub;
import abstractfactorypattern.product.strict.StrictOperation;
import abstractfactorypattern.product.strict.concrete.StrictOperationSub;

public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }

    @Override
    public StrictOperation createStrictOperation() {
        return new StrictOperationSub();
    }
}
