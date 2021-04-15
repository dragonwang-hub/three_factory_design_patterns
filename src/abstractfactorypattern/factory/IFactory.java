package abstractfactorypattern.factory;

import abstractfactorypattern.product.normal.Operation;

public interface IFactory {
    Operation createOperation();
}
