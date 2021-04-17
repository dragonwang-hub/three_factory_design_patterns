package abstractfactorypattern;

import abstractfactorypattern.factory.IFactory;
import abstractfactorypattern.factory.NormalFactory;
import abstractfactorypattern.factory.StrictFactory;
import abstractfactorypattern.product.AbstractOperation;

public class MainClass {
    public static void main(String[] args) {
        IFactory iFactory = new StrictFactory();
        AbstractOperation operation = iFactory.createAdd();
        operation.setNumberA(9.1111);
        operation.setNumberB(1.9999);
        double result = operation.getResult();
        System.out.println("The result is:" + result);
    }
}
