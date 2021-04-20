package basiclogic.version2.operation;

public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
