package abstractfactorypattern.product.strict.concrete;

import abstractfactorypattern.product.strict.StrictOperation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StrictOperationMul extends StrictOperation {
    @Override
    public double getResult() {
        BigDecimal bigDecimalA = BigDecimal.valueOf(getNumberA());
        BigDecimal bigDecimalB = BigDecimal.valueOf(getNumberB());
        return bigDecimalA.multiply(bigDecimalB).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
