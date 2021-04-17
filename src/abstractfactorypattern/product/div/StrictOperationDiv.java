package abstractfactorypattern.product.div;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StrictOperationDiv extends Div {
    @Override
    public double getResult() {
        BigDecimal bigDecimalA = BigDecimal.valueOf(getNumberA());
        BigDecimal bigDecimalB = BigDecimal.valueOf(getNumberB());
        return bigDecimalA.divide(bigDecimalB, 2, RoundingMode.HALF_UP).doubleValue();
    }
}
