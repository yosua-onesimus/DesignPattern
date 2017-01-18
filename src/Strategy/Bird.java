package Strategy;

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public abstract class Bird implements Animal {

    protected WalkWay walkWay;

    public Bird() {
        walkWay = new Fly();
    }

    @Override
    public WalkWay getWalkWay() {
        return walkWay;
    }
}