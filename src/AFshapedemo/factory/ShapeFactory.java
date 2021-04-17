package AFshapedemo.factory;

// factory
interface ShapeFactory {
    Shape getShape();
}

// BlackTriangle factory
class BlackTriangleFactory {
}

// GreyTriangle factory
class GreyTriangleFactory {
}

// WhiteTriangle factory
class WhiteTriangleFactory {
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