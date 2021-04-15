package abstractfactorypattern;

import abstractfactorypattern.factory.IFactory;
import abstractfactorypattern.factory.concrete.AddFactory;
import abstractfactorypattern.product.normal.Operation;

public class MainClass {
    public static void main(String[] args) {
//        IFactory iFactory = new MulFactory();
        IFactory iFactory = new AddFactory();
        Operation operation = iFactory.createOperation();
        operation.setNumberA(9.11);
        operation.setNumberB(1.99);
        double result = operation.getResult();
        System.out.println("The result is:" + result);
    }
}
