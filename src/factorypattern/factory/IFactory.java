package factorypattern.factory;

import factorypattern.product.Operation;

public interface IFactory {
    Operation createOperation();
}
