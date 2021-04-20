package basiclogic.version2.operation;

public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        return getNumberA() / getNumberB();
    }
}
