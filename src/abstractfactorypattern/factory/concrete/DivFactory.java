package abstractfactorypattern.factory.concrete;

import abstractfactorypattern.factory.IFactory;
import abstractfactorypattern.product.normal.Operation;
import abstractfactorypattern.product.normal.concrete.OperationDiv;
import abstractfactorypattern.product.strict.StrictOperation;
import abstractfactorypattern.product.strict.concrete.StrictOperationDiv;
import abstractfactorypattern.product.string.StringOperation;
import abstractfactorypattern.product.string.concrete.StringOperationAdd;
import abstractfactorypattern.product.string.concrete.StringOperationDiv;

public class DivFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }

    @Override
    public StrictOperation createStrictOperation() {
        return new StrictOperationDiv();
    }

    @Override
    public StringOperation createStringOperation() {
        return new StringOperationDiv();
    }
}
