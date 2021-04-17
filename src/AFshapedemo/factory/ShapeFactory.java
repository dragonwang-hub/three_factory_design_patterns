package AFshapedemo.factory;

// factory
interface ShapeFactory {
    Shape getShape();
}

// BlackRectange factory
class BlackRectangeFactory {
}

// GreyRectange factory
class GreyRectangeFactory {
}

// WhiteRectange factory
class WhiteRectangeFactory {
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