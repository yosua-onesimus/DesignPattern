package Decorator;

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        System.out.println("");
        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();
    }
}