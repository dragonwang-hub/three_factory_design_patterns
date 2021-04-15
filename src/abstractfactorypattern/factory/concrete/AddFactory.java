package abstractfactorypattern.factory.concrete;

import abstractfactorypattern.factory.IFactory;
import abstractfactorypattern.product.normal.Operation;
import abstractfactorypattern.product.normal.concrete.OperationAdd;
import abstractfactorypattern.product.strict.StrictOperation;
import abstractfactorypattern.product.strict.concrete.StrictOperationAdd;

public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }

    @Override
    public StrictOperation createStrictOperation() {
        return new StrictOperationAdd();
    }
}
