
public class TennisGame1 implements TennisGame {

    private final Player p1;
    private final Player p2;

    public TennisGame1(String player1Name, String player2Name) {
        this.p1 = new Player(player1Name);
        this.p2 = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            p1.score();
        } else {
            p2.score();
        }
    }

    public String getScore() {
        String score;
        if (p1.getPoint() == p2.getPoint()) {
            if (p1.getPoint() <= 2) {
                score = getRes(p1).getDescription() + "-All";
            } else {
                score = "Deuce";
            }
        } else if (p1.getPoint() >= 4 || p2.getPoint() >= 4) {
            int minusResult = p1.getPoint() - p2.getPoint();
            if (minusResult == 1) {
                score = "Advantage player1";
            } else if (minusResult == -1) {
                score = "Advantage player2";
            } else if (minusResult >= 2) {
                score = "Win for player1";
            } else {
                score = "Win for player2";
            }
        } else {
            score = getRes(p1).getDescription() + "-" + getRes(p2).getDescription();
        }
        return score;
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
