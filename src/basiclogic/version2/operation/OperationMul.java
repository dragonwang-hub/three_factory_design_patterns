package basiclogic.version2.operation;

public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
