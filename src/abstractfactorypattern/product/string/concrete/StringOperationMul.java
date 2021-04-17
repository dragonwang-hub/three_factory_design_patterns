package abstractfactorypattern.product.string.concrete;

import abstractfactorypattern.product.string.StringOperation;

public class StringOperationMul extends StringOperation {
    @Override
    public String getResult() {
        return "getStringA() * getStringB() Mean: Take the Intersection of Two Strings";
    }
}
