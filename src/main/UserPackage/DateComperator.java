package UserPackage;

import java.time.LocalDate;
import java.util.Comparator;

public class DateComperator implements Comparator<ScoreEvent>
{
    public int compare(ScoreEvent o1, ScoreEvent o2)
    {
        return o1.getDate().compareTo(o2.getDate());
    }

}
