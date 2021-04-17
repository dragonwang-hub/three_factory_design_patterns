package AFshapedemo.abstractfactory.factory;

import AFshapedemo.abstractfactory.product.Shape;

public interface IFactory {
    Shape getCircle();
    Shape getRectange();
}
