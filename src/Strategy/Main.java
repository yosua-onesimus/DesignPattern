package Strategy;

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.display() + " -> " + dog.getWalkWay());
        Duck duck = new Duck();
        System.out.println(duck.display() + " -> " + duck.getWalkWay());
    }
}