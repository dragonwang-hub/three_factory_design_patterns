package abstractfactorypattern.factory.concrete;

import abstractfactorypattern.factory.IFactory;
import abstractfactorypattern.product.normal.Operation;
import abstractfactorypattern.product.normal.concrete.OperationMul;
import abstractfactorypattern.product.strict.StrictOperation;
import abstractfactorypattern.product.strict.concrete.StrictOperationMul;
import abstractfactorypattern.product.string.StringOperation;
import abstractfactorypattern.product.string.concrete.StringOperationAdd;
import abstractfactorypattern.product.string.concrete.StringOperationMul;

public class MulFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }

    @Override
    public StrictOperation createStrictOperation() {
        return new StrictOperationMul();
    }

    @Override
    public StringOperation createStringOperation() {
        return new StringOperationMul();
    }
}
