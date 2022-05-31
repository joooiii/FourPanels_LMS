package CasePackage;
import KeywordPackage.Keyword;
import UserPackage.User;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import static validation.Ensurer.checkState;

public class PlaygroundCase
{

    public static void main(String[] arg)
    {
        Case case1= new Case("Back pain");

       case1.setKeywordsProcedure(Keyword.Procedure.BIOTIN_ERGAENZUNG);
       case1.setKeywordsProcedure(Keyword.Procedure.BURCH_VERFAHREN);
       case1.setKeywordsSymptoms(Keyword.Symptom.BIOSPSIE_DES_OMENTUMS);
       case1.setKeywordsSymptoms(Keyword.Symptom.BILIRUBIN_IM_BLUT_DIREKT_ERNIEDRIGT);
       case1.setKeywordProfesions(Keyword.Profession.ANAESTHESIOLOGIE);
       case1.setKeywordProfesions(Keyword.Profession.CHIRUGIE);
       // case1.addMember();

        Voting voting= new Voting("Is it for OP?", LocalDateTime.now().plus(1,ChronoUnit.DAYS));

        System.out.println(case1.getContent().getTitle());
        System.out.println(voting.getQuestion());
        System.out.println(case1.getKeywordsProcedure());
        System.out.println(case1.getKeywordsSymptoms());
        System.out.println(case1.getKeywordsProfession());

        Answer a= new Answer("Yes");
        Answer b= new Answer("NO");
        Answer c= new Answer("Egal");
        // Muss mindest 2 Antowrt sein
        checkState(voting.getAnswers().size() < 2, "Es muss mindest 2 Antwort sein");
        voting.setAnswers(a);
        voting.setAnswers(b);
        voting.setAnswers(c);

        voting.voting(1,1, case1);
        voting.voting(3,2, case1);
        voting.voting(2,3, case1);
        voting.voting(4,1, case1);
        voting.voting(0, 1, case1);
        System.out.println(voting.getResults());
        System.out.println("Votet " + voting.berechneSummeResults() + " People");
        System.out.println("Maximum votes have answer: " + voting.corectAnswer());
        voting.corectAnswersList();
        voting.addScoreForRightAnswer();

    }
}
