package abstractfactorypattern.product.add;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StrictOperationAdd extends Add {
    @Override
    public double getResult() {
        BigDecimal bigDecimalA = BigDecimal.valueOf(getNumberA());
        BigDecimal bigDecimalB = BigDecimal.valueOf(getNumberB());
        return bigDecimalA.add(bigDecimalB).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
