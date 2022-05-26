package CasePackage;
import KeywordPackage.Keyword;
import UserPackage.User;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PlaygroundCase
{

    public static void main(String[] arg)
    {
        Case case1= new Case("Is it for OP", LocalDateTime.now().plus(1,ChronoUnit.DAYS));
        Answer a= new Answer("Yes");
        Answer b= new Answer("NO");
        Answer c= new Answer("Egal");
        System.out.println(case1.getCreatedAt());
        Voting voting= new Voting("Is it for OP", LocalDateTime.now().plus(1,ChronoUnit.DAYS));
        voting.setAnswers(a);
        voting.setAnswers(b);
        voting.setAnswers(c);
        System.out.println(voting.getAnswers().size());
        voting.voting(1);
        voting.voting(1);
        voting.voting(2);
        voting.voting(1);
        voting.voting(0);
        System.out.println(voting.getResults());
        System.out.println(voting.berechneSummeResults());
        System.out.println(voting.corectAnswer());
        voting.corectAnswersList();

    }
}
