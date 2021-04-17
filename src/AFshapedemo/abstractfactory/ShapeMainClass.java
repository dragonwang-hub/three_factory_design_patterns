package AFshapedemo.abstractfactory;

import AFshapedemo.abstractfactory.factory.BlackFactory;
import AFshapedemo.abstractfactory.factory.IFactory;
import AFshapedemo.abstractfactory.product.Shape;

public class ShapeMainClass {
    public static void main(String[] args) {
        IFactory iFactory = new BlackFactory();
        Shape circle = iFactory.getCircle();
        circle.draw();
        Shape rectange = iFactory.getRectange();
        rectange.draw();
    }
}
