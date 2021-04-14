package factorypattern.factory.concrete;

import factorypattern.factory.IFactory;
import factorypattern.product.Operation;
import factorypattern.product.concrete.OperationAdd;

public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
