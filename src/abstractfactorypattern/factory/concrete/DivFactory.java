package abstractfactorypattern.factory.concrete;

import abstractfactorypattern.factory.IFactory;
import abstractfactorypattern.product.normal.Operation;
import abstractfactorypattern.product.normal.concrete.OperationDiv;

public class DivFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
