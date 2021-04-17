package abstractfactorypattern.factory;

import abstractfactorypattern.product.normal.Operation;
import abstractfactorypattern.product.strict.StrictOperation;
import abstractfactorypattern.product.string.StringOperation;

public interface IFactory {
    Operation createOperation();

    StrictOperation createStrictOperation();

    StringOperation createStringOperation();
}
