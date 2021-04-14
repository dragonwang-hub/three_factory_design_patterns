package factorypattern.factory.concrete;

import factorypattern.factory.IFactory;
import factorypattern.product.Operation;
import factorypattern.product.concrete.OperationDiv;

public class DivFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
