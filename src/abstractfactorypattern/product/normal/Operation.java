package abstractfactorypattern.product.normal;

/**
 * @author yunlong.wang
 */
public class Operation {
    private double numberA = 0d;
    private double numberB = 0d;

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

    public double getResult() {
        return 0d;
    }
}
