package abstractfactorypattern.product.string.concrete;

import abstractfactorypattern.product.string.StringOperation;

public class StringOperationDiv extends StringOperation {
    @Override
    public String getResult() {
        return "getStringA() / getStringB() Mean: Splicing and de-duplication";
    }
}
