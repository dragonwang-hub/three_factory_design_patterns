package factorypattern.factory.concrete;

import factorypattern.factory.IFactory;
import factorypattern.product.Operation;
import factorypattern.product.concrete.OperationSub;

public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
