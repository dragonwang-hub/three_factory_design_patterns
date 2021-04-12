package basicLogic;

/**
 * @author yunlong.wang
 */
public class Opertation {
    static double getResult(double numberA, double numberB, String operate) {
        double result = 0d;

        switch (operate) {
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                result = numberA / numberB;
                break;
            default:
                System.out.println("Input operate is incorrect!");
                break;
        }
        return result;
    }
}
