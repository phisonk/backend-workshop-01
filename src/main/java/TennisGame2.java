import java.util.HashMap;
import java.util.Map;

public class TennisGame2 {
    private int player1Point;
    private int player2Point;

    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }


    public String getScore(){
        Map<Integer,String> scoreMap = new HashMap<>();
        scoreMap.put(0,"Love");
        scoreMap.put(1,"Fifteen");
        scoreMap.put(2,"Thirty");
        scoreMap.put(3,"Forty");
        //Deuce
        if (player1Point == player2Point && player1Point >=3) {
            return "Deuce";
        }

        boolean equalScoreButNotDeuce = player1Point == player2Point;
        //Equal score
        if (equalScoreButNotDeuce)
        {
            return scoreMap.get(player1Point)+"-All";
        }

        //Advantage
        if (player1Point > player2Point && player2Point >= 3 && (player1Point - player2Point)==1)
        {
            return "Advantage " + player1Name;
        }

        if (player2Point > player1Point && player1Point >= 3 && (player2Point - player1Point)==1)
        {
            return "Advantage " + player2Name;
        }

        //Winner
        if (player1Point >=4 && player2Point >=0 && (player1Point - player2Point)>=2)
        {
            return "Win for " + player1Name;
        }
        if (player2Point >=4 && player1Point >=0 && (player2Point - player1Point)>=2)
        {
            return "Win for " + player2Name;
        }

        return scoreMap.get(player1Point) + "-" + scoreMap.get(player2Point);
    }

    public void p1Score(){
        player1Point++;
    }

    public void p2Score(){
        player2Point++;
    }

    public void wonPoint(String player) {
        if ("player1".equals(player))
            p1Score();
        else
            p2Score();
    }
}
