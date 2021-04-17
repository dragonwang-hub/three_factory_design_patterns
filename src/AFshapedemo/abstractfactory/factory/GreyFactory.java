package AFshapedemo.abstractfactory.factory;

import AFshapedemo.abstractfactory.product.Shape;
import AFshapedemo.abstractfactory.product.circle.GreyCircle;
import AFshapedemo.abstractfactory.product.rectange.GreyRectange;

public class GreyFactory implements IFactory {
    @Override
    public Shape getCircle() {
        return new GreyCircle();
    }

    @Override
    public Shape getRectange() {
        return new GreyRectange();
    }
}
