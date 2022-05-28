package UserPackage;

import validation.Ensurer;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ScoreEvent
{
    private int point;
    private LocalDate date;
    private boolean expert;
    private String scoreMessage;
    private String title;

    public ScoreEvent(int point, LocalDate date, boolean expert, String scoreMessage, String title)
    {
        this.point = Ensurer.ensureValueInRangeInt(point,5,250, "points");
        this.date = date;
        this.expert = expert;
        this.scoreMessage = Ensurer.ensureNonBlank(scoreMessage, "Score Message");
        this.title = Ensurer.ensureNonBlank(title, "Title");
    }

    public int getPoint()
    {
        return point;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public boolean isExpert()
    {
        return expert;
    }

    public String getScoreMessage()
    {
        return scoreMessage;
    }

    public String getTitle()
    {
        return title;
    }

    @Override
    public String toString()
    {
        return title + "\n" + date + "Punkte: " + getPoint() + "\n" + scoreMessage + "\n";
    }

}
