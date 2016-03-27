
public class TennisGame3 implements TennisGame {

    private final Player p1;
    private final Player p2;

    public TennisGame3(String p1N, String p2N) {
        this.p1 = new Player(p1N);
        this.p2 = new Player(p2N);
    }

    public String getScore() {
        if (p1.getPoint() < 4 && p2.getPoint() < 4 && p1.getPoint() + p2.getPoint() != 6) {
            Res[] p = new Res[]{Res.LOVE, Res.FIFTEEN, Res.THIRTY, Res.FORTY};
            String s = p[p1.getPoint()].getDescription();
            return (p1.getPoint() == p2.getPoint()) ? s + "-All" : s + "-" + p[p2.getPoint()].getDescription();
        } else {
            if (p1.getPoint() == p2.getPoint()) {
                return "Deuce";
            }
            String s = p1.getPoint() > p2.getPoint() ? p1.getName() : p2.getName();
            return Math.abs(p1.getPoint() - p2.getPoint()) == 1 ? "Advantage " + s : "Win for " + s;
        }
    }

    public void wonPoint(String playerName) {
        if (p1.getName().equals(playerName)) {
            p1.score();
        } else {
            p2.score();
        }
    }

}
