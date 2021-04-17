package abstractfactorypattern.product.sub;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StrictOperationSub extends Sub {
    @Override
    public double getResult() {
        BigDecimal bigDecimalA = BigDecimal.valueOf(getNumberA());
        BigDecimal bigDecimalB = BigDecimal.valueOf(getNumberB());
        return bigDecimalA.subtract(bigDecimalB).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
