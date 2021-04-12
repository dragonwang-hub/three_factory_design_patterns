package basicLogic;

import java.util.Scanner;

/**
 * @author yunlong.wang
 */
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
        scanner.close();
        double result = Opertation.getResult(numberA, numberB, operate);
        System.out.println("The result is:" + result);
    }
}
