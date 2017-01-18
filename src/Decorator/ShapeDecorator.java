package Decorator;

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratodShape;

    public ShapeDecorator(Shape shape) {
        this.decoratodShape = shape;
    }
}