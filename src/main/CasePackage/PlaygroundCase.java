package CasePackage;
import KeywordPackage.Keyword;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PlaygroundCase
{

    public static void main(String[] arg)
    {
        Case case1= new Case("Is it for OP", LocalDateTime.now().plus(3, ChronoUnit.DAYS));
        Answer a= new Answer("Yes");
        Answer b= new Answer("NO");
        case1.getCreatedAt();


    }
}
