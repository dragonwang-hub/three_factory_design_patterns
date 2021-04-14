package basiclogic;

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
//           when need add new operate
//            case "^":
//                result = "numberA ^ numberB";
//                break;
            default:
                System.out.println("Input operate is incorrect!");
        }
        return result;
    }
}
