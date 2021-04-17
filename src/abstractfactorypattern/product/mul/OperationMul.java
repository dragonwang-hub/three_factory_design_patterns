package abstractfactorypattern.product.mul;

public class OperationMul extends Mul {
    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
