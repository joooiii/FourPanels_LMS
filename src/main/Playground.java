import CasePackage.*;
import KeywordPackage.Keyword;
import UserPackage.*;
import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.Text;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;

public class Playground
{


    public static void main(String[] args)
    {

        User d = new User("denis@yolo.at", "Password1!", Instant.now(), Instant.now(), new Personal("Denis", "Mehicic", LocalDate.of(1992, 5, 30), "Dr."));
        User a = new User("ana@yolo.at", "Password2!", Instant.now(), Instant.now(), new Personal("Ana", "Susa", LocalDate.of(1990, 7, 11), "Prim. Dr."));
        User j = new User("jo@yolo.at", "Password3!", Instant.now(), Instant.now(), new Personal("Jo", "Lackner", LocalDate.of(1996, 11, 15), "Prof. Dr."));
        User h = new User("amber@yolo.at", "Password4!", Instant.now(), Instant.now(), new Personal("Amber", "Heard", LocalDate.of(2000, 1, 1), "Dr. Phil."));
        User x = new User("johnny@yolo.at", "Password5!", Instant.now(), Instant.now(), new Personal("Johnny", "Depp", LocalDate.of(1970, 5, 30), "Prim. Prof. Dr. Dr."));


        d.addKeywordProfession(Keyword.Profession.ALLGEMEINMEDIZIN);
        d.addKeywordProfession(Keyword.Profession.ALLERGOLOGIE);
        d.addKeywordLanguage(Keyword.Language.DUTCH);
        d.addKeywordLanguage(Keyword.Language.BULGARIAN);

        a.addKeywordProfession(Keyword.Profession.CHIRUGIE);
        a.addKeywordProfession(Keyword.Profession.ANATOMIE);
        a.addKeywordLanguage(Keyword.Language.GREEK);
        a.addKeywordLanguage(Keyword.Language.HINDI);

        j.addKeywordProfession(Keyword.Profession.ARBEITSMEDIZIN);
        j.addKeywordProfession(Keyword.Profession.ALTERNATIVE_MEDIZIN);
        j.addKeywordLanguage(Keyword.Language.KOREAN);
        j.addKeywordLanguage(Keyword.Language.GERMAN);

        h.addKeywordProfession(Keyword.Profession.GYNAEKOLOGIE_UND_GEBURTSHILFE);
        h.addKeywordProfession(Keyword.Profession.UROLOGIE);
        h.addKeywordLanguage(Keyword.Language.ENGLISH);
        h.addKeywordLanguage(Keyword.Language.CZECH);

        x.addKeywordProfession(Keyword.Profession.ANAESTHESIOLOGIE);
        x.addKeywordProfession(Keyword.Profession.HAEMATOLOGIE);
        x.addKeywordLanguage(Keyword.Language.ENGLISH);
        x.addKeywordLanguage(Keyword.Language.ITALIAN);

        d.sendRequest(a);
        a.acceptRequest(d);
        j.sendRequest(a);
        a.acceptRequest(j);
        d.sendRequest(x);


        System.out.println(d.toString());
        System.out.println(a.toString());
        System.out.println(j.toString());
        System.out.println(h.toString());
        System.out.println(x.toString());

        Case c = d.createCase("Patient bleeding from Anus");

        c.setKeywordsProcedure(Keyword.Procedure.BIOTIN_ERGAENZUNG);
        c.setKeywordProfesions(Keyword.Profession.CHIRUGIE);
        c.setKeywordsSymptoms(Keyword.Symptom.BETA_CROSSLAPS);
        TextSection text= new TextSection("Mein Patient leided","AUA,");
        //text.addToExcistingSection();
        MediaSection media = new MediaSection(Path.of("C:\\Users\\Johanna\\Documents\\Kolleg\\uiuiui.jpeg"),"Gehirn");
        c.getContent().addSection(text);
        c.getContent().addSection(media);
        System.out.println(c.toString());
        System.out.println(c.getContent().toString());
        Voting votigC= new Voting("Is it for OP?", LocalDateTime.now().plus(1, ChronoUnit.DAYS));

        Answer a1= new Answer("yes");
        Answer b1=new Answer("no");
        Answer c1= new Answer("maybe");
        votigC.setAnswers(a1);
        votigC.setAnswers(b1);
        votigC.setAnswers(c1);
        c.addMember(a);
        c.addMember(j);
        votigC.corectAnswersList();
        //System.out.println(c.getMembers());
        votigC.voting(a, 1,c);
        votigC.voting(j,2,c);
        //votigC.voting(d,0,c);
        //votigC.voting(x,1,c);
        votigC.addScoreForRightAnswer(1,d,c);
        System.out.println(votigC.toString());
        //votigC.corectAnswersList();
        System.out.println(d.toString());
        System.out.println(a.toString());
        System.out.println(j.toString());
        System.out.println(h.toString());
        System.out.println(x.toString());
        a.getScore().sortByPointsUp();
        System.out.println(a.getScore().toString());


    }
}
