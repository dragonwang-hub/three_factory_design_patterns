package simpleFactoryPattern;

import simpleFactoryPattern.factory.OperationFactory;
import simpleFactoryPattern.product.Operation;

/**
 * @author yunlong.wang
 */
public class MainClass {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperate("+");
        operation.setNumberA(1.23);
        operation.setNumberB(3.21);
        double result = operation.getResult();
        System.out.println("The result is:" + result);
    }
}
