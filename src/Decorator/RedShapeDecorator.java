package Decorator;

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        decoratodShape.draw();
        setRedBorder(decoratodShape);
    }

    private void setRedBorder(Shape decoratodShape) {
        System.out.println("Border Color: Red");
    }
}