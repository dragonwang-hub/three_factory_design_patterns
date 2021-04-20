package basiclogic.version2;

import basiclogic.version2.operation.Operation;
import basiclogic.version2.operation.OperationAdd;
import basiclogic.version2.operation.OperationDiv;
import basiclogic.version2.operation.OperationMul;
import basiclogic.version2.operation.OperationSub;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input number A:");
        double numberA = 0d;
        if (scanner.hasNextDouble()) {
            numberA = scanner.nextDouble();
        }

        System.out.println("Please choose operators:(+,-,*,/)");
        String operate = "";
        if (scanner.hasNext()) {
            operate = scanner.next();
        }

        System.out.println("Please input number B:");
        double numberB = 0d;
        if (scanner.hasNextDouble()) {
            numberB = scanner.nextDouble();
        }

        Operation operation = null;
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
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        double result = operation.getResult();
        System.out.println("The result is :" + result);
    }
}
