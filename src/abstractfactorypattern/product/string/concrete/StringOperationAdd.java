package abstractfactorypattern.product.string.concrete;

import abstractfactorypattern.product.string.StringOperation;

public class StringOperationAdd extends StringOperation {
    @Override
    public String getResult() {
        return getStringA() + getStringB();
    }
}
