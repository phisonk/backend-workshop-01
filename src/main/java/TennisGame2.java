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
        String player1Result = "";
        String player2Result = "";
        String score = "";
        Map<Integer,String> scoreMap = new HashMap<>();
        scoreMap.put(0,"Love");
        scoreMap.put(1,"Fifteen");
        scoreMap.put(2,"Thirty");
        scoreMap.put(3,"Forty");
        if (player1Point == player2Point && player1Point < 3)
        {
            score = scoreMap.get(player1Point)+"-All";
        }
        if (player1Point == player2Point && player1Point >=3)
            score = "Deuce";

        if (player1Point > 0 && player2Point ==0)
        {
            score = scoreMap.get(player1Point) + "-" + scoreMap.get(player2Point);
        }
        if (player2Point > 0 && player1Point ==0)
        {
            score = scoreMap.get(player1Point) + "-" + scoreMap.get(player2Point);
        }

        if (player1Point > player2Point && player1Point < 4)
        {
            score = scoreMap.get(player1Point) + "-" + scoreMap.get(player2Point);
        }
        if (player2Point > player1Point && player2Point < 4)
        {
            score = scoreMap.get(player1Point) + "-" + scoreMap.get(player2Point);
        }

        if (player1Point > player2Point && player2Point >= 3)
        {
            score = "Advantage player1";
        }

        if (player2Point > player1Point && player1Point >= 3)
        {
            score = "Advantage player2";
        }

        if (player1Point >=4 && player2Point >=0 && (player1Point - player2Point)>=2)
        {
            score = "Win for player1";
        }
        if (player2Point >=4 && player1Point >=0 && (player2Point - player1Point)>=2)
        {
            score = "Win for player2";
        }
        return score;
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
