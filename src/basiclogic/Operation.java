package basiclogic;

/**
 * @author yunlong.wang
 */
public class Operation {
    private double numberA;
    private double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    double getResult(String operate) {
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
