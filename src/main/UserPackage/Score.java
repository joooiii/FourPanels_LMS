package UserPackage;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Score
{
    private HashMap<LocalDateTime, ScoreEvent> scores;

    public Score(HashMap<LocalDateTime, ScoreEvent> scores)
    {
        this.scores = scores;
    }

    public HashMap<LocalDateTime, ScoreEvent> getScores()
    {
        return scores;
    }

    public void setScores(HashMap<LocalDateTime, ScoreEvent> scores)
    {
        this.scores = scores;
    }
}
