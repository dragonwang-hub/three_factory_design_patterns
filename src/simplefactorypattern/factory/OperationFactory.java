package simplefactorypattern.factory;

import simplefactorypattern.product.Operation;
import simplefactorypattern.product.concrete.OperationAdd;
import simplefactorypattern.product.concrete.OperationDiv;
import simplefactorypattern.product.concrete.OperationMul;
import simplefactorypattern.product.concrete.OperationSub;

public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation operation = new Operation();
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                System.out.println("Input operate is incorrect!");
        }
        return operation;
    }
}
