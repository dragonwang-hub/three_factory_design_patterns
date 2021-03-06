package AFshapedemo.abstractfactory.factory;

import AFshapedemo.abstractfactory.product.Shape;
import AFshapedemo.abstractfactory.product.circle.BlackCircle;
import AFshapedemo.abstractfactory.product.rectange.BlackRectangle;

public class BlackFactory implements IFactory {
    @Override
    public Shape getCircle() {
        return new BlackCircle();
    }

    @Override
    public Shape getRectange() {
        return new BlackRectangle();
    }
}
