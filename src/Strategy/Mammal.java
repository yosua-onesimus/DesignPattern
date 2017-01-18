package Strategy;

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public abstract class Mammal implements Animal {

    protected WalkWay walkWay;

    public Mammal() {
        walkWay = new Walk();
    }

    @Override
    public WalkWay getWalkWay() {
        return walkWay;
    }
}