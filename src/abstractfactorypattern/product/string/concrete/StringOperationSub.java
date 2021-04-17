package abstractfactorypattern.product.string.concrete;

import abstractfactorypattern.product.string.StringOperation;

public class StringOperationSub extends StringOperation {
    @Override
    public String getResult() {
        return "getStringA() - getStringB() Mean: Removing the Intersection of Two Strings";
    }
}
