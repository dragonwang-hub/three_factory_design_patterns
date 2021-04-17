package abstractfactorypattern;

import abstractfactorypattern.factory.IFactory;
import abstractfactorypattern.factory.concrete.AddFactory;
import abstractfactorypattern.factory.concrete.DivFactory;
import abstractfactorypattern.factory.concrete.MulFactory;
import abstractfactorypattern.product.normal.Operation;
import abstractfactorypattern.product.strict.StrictOperation;
import abstractfactorypattern.product.string.StringOperation;

public class MainClass {
    public static void main(String[] args) {
//        IFactory iFactory = new MulFactory();
//        IFactory iFactory = new AddFactory();
        IFactory iFactory = new DivFactory();
        Operation operation = iFactory.createOperation();
        operation.setNumberA(9.1111);
        operation.setNumberB(1.9999);
        double result = operation.getResult();
        System.out.println("The result is:" + result);

        StrictOperation strictOperation = iFactory.createStrictOperation();
        strictOperation.setNumberA(9.1111);
        strictOperation.setNumberB(1.9999);
        double strictResult = strictOperation.getResult();
        System.out.println("The strictResult is:" + strictResult);

        StringOperation stringOperation = iFactory.createStringOperation();
        stringOperation.setStringA("It is String A");
        stringOperation.setStringB("It is String B");
        String stringResult = stringOperation.getResult();
        System.out.println("The stringResult is:" + stringResult);
    }
}
