package factorypattern;

import factorypattern.factory.IFactory;
import factorypattern.factory.concrete.AddFactory;
import factorypattern.factory.concrete.MulFactory;
import factorypattern.product.Operation;

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
