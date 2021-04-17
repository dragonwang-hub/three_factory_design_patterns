package abstractfactorypattern.factory.concrete;

import abstractfactorypattern.factory.IFactory;
import abstractfactorypattern.product.normal.Operation;
import abstractfactorypattern.product.normal.concrete.OperationAdd;
import abstractfactorypattern.product.strict.StrictOperation;
import abstractfactorypattern.product.strict.concrete.StrictOperationAdd;
import abstractfactorypattern.product.string.StringOperation;
import abstractfactorypattern.product.string.concrete.StringOperationAdd;

public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }

    @Override
    public StrictOperation createStrictOperation() {
        return new StrictOperationAdd();
    }

    @Override
    public StringOperation createStringOperation() {
        return new StringOperationAdd();
    }
}
