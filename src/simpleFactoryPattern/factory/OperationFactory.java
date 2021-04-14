package simpleFactoryPattern.factory;

import simpleFactoryPattern.product.Operation;
import simpleFactoryPattern.product.concrete.OperationAdd;
import simpleFactoryPattern.product.concrete.OperationDiv;
import simpleFactoryPattern.product.concrete.OperationMul;
import simpleFactoryPattern.product.concrete.OperationSub;

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
