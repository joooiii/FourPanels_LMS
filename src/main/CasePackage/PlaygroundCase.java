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
       case1.setKeywordsProcedure(Keyword.Procedure.BIOTIN_ERGAENZUNG);
       case1.setKeywordsProcedure(Keyword.Procedure.BURCH_VERFAHREN);
       case1.setKeywordsSymptoms(Keyword.Symptom.BIOSPSIE_DES_OMENTUMS);
       case1.setKeywordsSymptoms(Keyword.Symptom.BILIRUBIN_IM_BLUT_DIREKT_ERNIEDRIGT);
        System.out.println(case1.getKeywordsProcedure());
        System.out.println(case1.getKeywordsSymptoms());
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
        System.out.println("Votet " + voting.berechneSummeResults() + " People");
        System.out.println("Maximum votes have answer: " + voting.corectAnswer());
        voting.corectAnswersList();
    }
}
