package abstractfactorypattern.factory;

import abstractfactorypattern.product.add.Add;
import abstractfactorypattern.product.div.Div;
import abstractfactorypattern.product.mul.Mul;
import abstractfactorypattern.product.sub.Sub;

public interface IFactory {
    Add createAdd();

    Sub createSub();

    Div createDiv();

    Mul createMul();
}
