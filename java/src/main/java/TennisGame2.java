
public class TennisGame2 implements TennisGame {

    private final Player p1;
    private final Player p2;

    public TennisGame2(String player1Name, String player2Name) {
        this.p1 = new Player(player1Name);
        this.p2 = new Player(player2Name);
    }

    public String getScore() {
        if (p1.getPoint() == p2.getPoint() && p1.getPoint() < 3) {
            return getRes(p1).getDescription() + "-All";
        }
        if (p1.getPoint() == p2.getPoint() && p1.getPoint() >= 3) {
            return "Deuce";
        }
        if (p1.getPoint() >= 4 && p2.getPoint() >= 0 && (p1.getPoint() - p2.getPoint()) >= 2) {
            return "Win for " + p1.getName();
        }
        if (p2.getPoint() >= 4 && p1.getPoint() >= 0 && (p2.getPoint() - p1.getPoint()) >= 2) {
            return "Win for " + p2.getName();
        }
        if (p1.getPoint() > p2.getPoint() && p2.getPoint() >= 3) {
            return "Advantage " + p1.getName();
        }
        if (p2.getPoint() > p1.getPoint() && p1.getPoint() >= 3) {
            return "Advantage " + p2.getName();
        }
        return getRes(p1).getDescription() + "-" + getRes(p2).getDescription();
    }

    public void wonPoint(String player) {
        if (p1.getName().equals(player)) {
            p1.score();
        } else {
            p2.score();
        }
    }

    public static Res getRes(Player player) {
        switch (player.getPoint()) {
            case 0:
                return Res.LOVE;
            case 1:
                return Res.FIFTEEN;
            case 2:
                return Res.THIRTY;
            case 3:
                return Res.FORTY;
            default:
                return null;
        }
    }
}
