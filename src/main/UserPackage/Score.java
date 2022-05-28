package UserPackage;

import validation.Ensurer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import static java.util.Comparator.naturalOrder;

public class Score
{
//    private HashMap<LocalDateTime, ScoreEvent> scores;
//
//
//
//    public Score(HashMap<LocalDateTime, ScoreEvent> scores)
//    {
//        this.scores = scores;
//    }
//
//    public HashMap<LocalDateTime, ScoreEvent> getScores()
//    {
//        return scores;
//    }
//
//    public void setScores(HashMap<LocalDateTime, ScoreEvent> scores)
//    {
//        this.scores = scores;
//    }

    private List<ScoreEvent> scores;

    public List<ScoreEvent> getScores()
    {
        return scores;
    }


    public void addScore(ScoreEvent score)
    {
        scores.add(score);

    }


    public int berechneGesamtScore()
    {
        int summe = 0;
        for (ScoreEvent scoreEvent : scores)
        {
            summe += scoreEvent.getPoint();
        }
        return summe;
    }

    public int countEvents()
    {
        int anz = 0;
        for (ScoreEvent scoreEvent : scores)
        {
            anz++;
        }
        return anz;
    }


    public double avgPoints()
    {
        double gehalt = 0;
        int anz = 0;
        for (ScoreEvent scoreEvent : scores)
        {
            gehalt += scoreEvent.getPoint();
            anz++;
        }
        if (anz > 0)
        {
            return gehalt / anz;
        } else
        {
            return 0;
        }
    }

    public List<ScoreEvent> getExpertPoints()
    {
        List<ScoreEvent> scr = new ArrayList<>();
        for (ScoreEvent scoreEvent : scores)
        {
            if (scoreEvent.isExpert())
            {
                scr.add(scoreEvent);
            }
        }
        return scr;
    }

    public List<ScoreEvent> getActivityPoints()
    {
        List<ScoreEvent> scr = new ArrayList<>();
        for (ScoreEvent scoreEvent : scores)
        {
            if (!scoreEvent.isExpert())
            {
                scr.add(scoreEvent);
            }
        }
        return scr;
    }

    public void sortByPointsUp()
    {
        scores.sort(new PointsComperator());
    }

    public void sortByPointsDown()
    {
        scores.sort(new PointsComperator().reversed());
    }

    public void sortByDate()
    {
        scores.sort(new DateComperator());
    }

    public void sortByDateDown()
    {
        scores.sort(new DateComperator().reversed());
    }


    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Scores: ");
        sb.append(String.format("Anzahl: %d\n", countEvents()));
        sb.append(String.format("Gesamtpunkte: %.2f\n", berechneGesamtScore()));
        sb.append(String.format("Durchschnittliche Punkte: %.2f\n", avgPoints()));
        for (ScoreEvent scoreEvent : scores)
        {
            sb.append(scoreEvent.toString()).append("\n");
        }
        return sb.toString();
    }

}


