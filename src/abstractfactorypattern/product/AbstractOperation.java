package abstractfactorypattern.product;

/**
 * @author yunlong.wang
 */
public abstract class AbstractOperation {
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

    public abstract double getResult();
}
