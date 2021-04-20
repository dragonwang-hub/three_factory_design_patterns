package basiclogic.version2.operation;

public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
