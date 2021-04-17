package abstractfactorypattern.product.mul;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StrictOperationMul extends Mul {
    @Override
    public double getResult() {
        BigDecimal bigDecimalA = BigDecimal.valueOf(getNumberA());
        BigDecimal bigDecimalB = BigDecimal.valueOf(getNumberB());
        return bigDecimalA.multiply(bigDecimalB).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
