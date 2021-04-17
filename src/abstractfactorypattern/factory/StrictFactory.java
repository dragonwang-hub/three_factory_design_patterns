package abstractfactorypattern.factory;

import abstractfactorypattern.product.add.Add;
import abstractfactorypattern.product.add.StrictOperationAdd;
import abstractfactorypattern.product.div.Div;
import abstractfactorypattern.product.div.StrictOperationDiv;
import abstractfactorypattern.product.mul.Mul;
import abstractfactorypattern.product.mul.StrictOperationMul;
import abstractfactorypattern.product.sub.StrictOperationSub;
import abstractfactorypattern.product.sub.Sub;

public class StrictFactory implements IFactory {

    @Override
    public Add createAdd() {
        return new StrictOperationAdd();
    }

    @Override
    public Sub createSub() {
        return new StrictOperationSub();
    }

    @Override
    public Div createDiv() {
        return new StrictOperationDiv();
    }

    @Override
    public Mul createMul() {
        return new StrictOperationMul();
    }
}
