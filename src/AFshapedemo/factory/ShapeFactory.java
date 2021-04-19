package AFshapedemo.factory;

// factory
interface ShapeFactory {
    Shape getShape();
}

// BlackRectangle factory
class BlackRectangleFactory {
}

// GreyRectangle factory
class GreyRectangleFactory {
}

// WhiteRectangle factory
class WhiteRectangleFactory {
}

// BlackCircle factory
class BlackCircleFactory {
}

// GreyCircle factory
class GreyCircleFactory {
}

// WhiteCircle factory
class WhiteCircleFactory {
}

// ... many factory for different product. because each factory just produce one product.