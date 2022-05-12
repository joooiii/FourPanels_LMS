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
        this.point = point;
        this.time = time;
        this.type = type;
        this.scoreMessage = scoreMessage;
        this.title = title;
    }

    public int getPoint()
    {
        return point;
    }

    public void setPoint(int point)
    {
        this.point = point;
    }

    public LocalDateTime getTime()
    {
        return time;
    }

    public void setTime(LocalDateTime time)
    {
        this.time = time;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getScoreMessage()
    {
        return scoreMessage;
    }

    public void setScoreMessage(String scoreMessage)
    {
        this.scoreMessage = scoreMessage;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
}
