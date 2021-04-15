package abstractfactorypattern.factory;

import abstractfactorypattern.product.normal.Operation;
import abstractfactorypattern.product.strict.StrictOperation;

public interface IFactory {
    Operation createOperation();

    StrictOperation createStrictOperation();
}
