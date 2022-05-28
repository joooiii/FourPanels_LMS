package UserPackage;

import validation.Ensurer;

import java.time.LocalDateTime;

public class ScoreEvent
{
    private int point;
    private LocalDateTime time;
    private String type;
    private String scoreMessage;
    private String title;

    public ScoreEvent(int point, LocalDateTime time, String type, String scoreMessage, String title)
    {
        this.point = Ensurer.ensureValueInRangeInt(point,5,250, "points");
        this.time = time;
        this.type = Ensurer.ensureNonBlank(type,"Type");
        this.scoreMessage = Ensurer.ensureNonBlank(scoreMessage, "Score Message");
        this.title = Ensurer.ensureNonBlank(title, "Title");
    }

    public int getPoint()
    {
        return point;
    }

    public LocalDateTime getTime()
    {
        return time;
    }

    public String getType()
    {
        return type;
    }

    public String getScoreMessage()
    {
        return scoreMessage;
    }

    public String getTitle()
    {
        return title;
    }

}
