
/**
 *
 * @author Douglas
 */
public class Player {

    private int point = 0;
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void score() {
        point++;
    }

}
