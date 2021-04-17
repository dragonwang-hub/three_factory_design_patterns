package AFshapedemo.abstractfactory.factory;

import AFshapedemo.abstractfactory.product.Shape;
import AFshapedemo.abstractfactory.product.circle.WhiteCircle;
import AFshapedemo.abstractfactory.product.rectange.WhiteRectange;

public class WhiteFactory implements IFactory {
    @Override
    public Shape getCircle() {
        return new WhiteCircle();
    }

    @Override
    public Shape getRectange() {
        return new WhiteRectange();
    }
}
