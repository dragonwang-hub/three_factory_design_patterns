package factorypattern.factory.concrete;

import factorypattern.factory.IFactory;
import factorypattern.product.Operation;
import factorypattern.product.concrete.OperationMul;

public class MulFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
