package UserPackage;

import java.util.Comparator;

public class PointsComperator implements Comparator<ScoreEvent>
{
    public int compare(ScoreEvent o1, ScoreEvent o2)
    {
        return Integer.compare(o1.getPoint(), o2.getPoint());
    }
}
