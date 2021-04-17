package abstractfactorypattern.factory;

import abstractfactorypattern.product.add.Add;
import abstractfactorypattern.product.add.OperationAdd;
import abstractfactorypattern.product.div.Div;
import abstractfactorypattern.product.div.OperationDiv;
import abstractfactorypattern.product.mul.Mul;
import abstractfactorypattern.product.mul.OperationMul;
import abstractfactorypattern.product.sub.OperationSub;
import abstractfactorypattern.product.sub.Sub;

public class NormalFactory implements IFactory {

    @Override
    public Add createAdd() {
        return new OperationAdd();
    }

    @Override
    public Sub createSub() {
        return new OperationSub();
    }

    @Override
    public Div createDiv() {
        return new OperationDiv();
    }

    @Override
    public Mul createMul() {
        return new OperationMul();
    }
}
