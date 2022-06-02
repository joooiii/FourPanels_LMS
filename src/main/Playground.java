import CasePackage.*;
import KeywordPackage.Keyword;
import UserPackage.*;
import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.Text;

import java.io.IOException;
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


    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Database db = new Database();

        //CREATING USERS----------------------------------------------------------------
        User denis = new User("denis@yolo.at", "Password1!", Instant.now(), Instant.now(), new Personal("Denis", "Mehicic", LocalDate.of(1992, 5, 30), "Dr."));
        User ana = new User("ana@yolo.at", "Password2!", Instant.now(), Instant.now(), new Personal("Ana", "Susa", LocalDate.of(1990, 7, 11), "Prim. Dr."));
        User jo = new User("jo@yolo.at", "Password3!", Instant.now(), Instant.now(), new Personal("Jo", "Lackner", LocalDate.of(1996, 11, 15), "Prof. Dr."));
        User amber = new User("amber@yolo.at", "Password4!", Instant.now(), Instant.now(), new Personal("Amber", "Heard", LocalDate.of(2000, 1, 1), "Dr. Phil."));
        User depp = new User("johnny@yolo.at", "Password5!", Instant.now(), Instant.now(), new Personal("Johnny", "Depp", LocalDate.of(1970, 5, 30), "Prim. Prof. Dr. Dr."));
        db.aufnehmenUser(denis);
        db.aufnehmenUser(ana);
        db.aufnehmenUser(jo);
        db.aufnehmenUser(amber);
        db.aufnehmenUser(depp);

        //ADDING KEYWORDS TO USERS-----------------------------------------------------
        denis.addKeywordProfession(Keyword.Profession.ALLGEMEINMEDIZIN);
        denis.addKeywordProfession(Keyword.Profession.ALLERGOLOGIE);
        denis.addKeywordLanguage(Keyword.Language.DUTCH);
        denis.addKeywordLanguage(Keyword.Language.BULGARIAN);

        ana.addKeywordProfession(Keyword.Profession.CHIRUGIE);
        ana.addKeywordProfession(Keyword.Profession.ANATOMIE);
        ana.addKeywordLanguage(Keyword.Language.GREEK);
        ana.addKeywordLanguage(Keyword.Language.HINDI);

        jo.addKeywordProfession(Keyword.Profession.ARBEITSMEDIZIN);
        jo.addKeywordProfession(Keyword.Profession.ALTERNATIVE_MEDIZIN);
        jo.addKeywordLanguage(Keyword.Language.KOREAN);
        jo.addKeywordLanguage(Keyword.Language.GERMAN);

        amber.addKeywordProfession(Keyword.Profession.GYNAEKOLOGIE_UND_GEBURTSHILFE);
        amber.addKeywordProfession(Keyword.Profession.UROLOGIE);
        amber.addKeywordLanguage(Keyword.Language.ENGLISH);
        amber.addKeywordLanguage(Keyword.Language.CZECH);

        depp.addKeywordProfession(Keyword.Profession.ANAESTHESIOLOGIE);
        depp.addKeywordProfession(Keyword.Profession.HAEMATOLOGIE);
        depp.addKeywordLanguage(Keyword.Language.ENGLISH);
        depp.addKeywordLanguage(Keyword.Language.ITALIAN);

        // FRIENDING---------------------------------------------------------------------
        denis.sendRequest(ana);
        ana.acceptRequest(denis);
        jo.sendRequest(ana);
        ana.acceptRequest(jo);
        denis.sendRequest(depp);

        //PRINTING USERS--------------------------------------------------------------
        System.out.println(denis.toString());
        System.out.println(ana.toString());
        System.out.println(jo.toString());
        System.out.println(amber.toString());
        System.out.println(depp.toString());
        System.out.println();

        //DENIS CASE-----------------------------------------------------------------
        Case denisCase = denis.createCase("Patient bleeding from Anus");
        denisCase.setKeywordsProcedure(Keyword.Procedure.BIOTIN_ERGAENZUNG);
        denisCase.setKeywordProfesions(Keyword.Profession.CHIRUGIE);
        denisCase.setKeywordsSymptoms(Keyword.Symptom.BETA_CROSSLAPS);
        TextSection text= new TextSection("Mein Patient leided","AUA,");
        //text.addToExcistingSection();
        MediaSection media = new MediaSection(Path.of("C:\\Users\\Johanna\\Documents\\Kolleg\\uiuiui.jpeg"),"Gehirn");
        denisCase.getContent().addSection(text);
        denisCase.getContent().addSection(media);
        System.out.println(denisCase.toString());
        System.out.println(denisCase.getContent().toString());
        System.out.println();

        Voting votingDenisCase= new Voting("Is it for OP?", LocalDateTime.now().plus(1, ChronoUnit.DAYS));
        Answer aDenisCase= new Answer("yes");
        Answer bDenisCase=new Answer("no");
        Answer cDenisCase= new Answer("maybe");

        votingDenisCase.setAnswers(aDenisCase);
        votingDenisCase.setAnswers(bDenisCase);
        votingDenisCase.setAnswers(cDenisCase);
        denisCase.addMember(ana);
        denisCase.addMember(jo);
        votingDenisCase.corectAnswersList();

        votingDenisCase.voting(ana, 1,denisCase);
        votingDenisCase.voting(jo,2,denisCase);

        votingDenisCase.addScoreForRightAnswer(1,denis,denisCase);
        System.out.println(votingDenisCase.toString());

        System.out.println(denis.toString());
        System.out.println(ana.toString());
        System.out.println(jo.toString());
        System.out.println(amber.toString());
        System.out.println(depp.toString());
        ana.getScore().sortByPointsUp();
        System.out.println(ana.getScore().toString());
        System.out.println();

        System.out.println("--------- Speichern von Usern Und Cases --------");
        db.saveUsers("C:\\Users\\Johanna\\Documents\\Kolleg\\users.ser");
        db.saveCases("C:\\Users\\Johanna\\Documents\\cases.ser");
        System.out.println("--------- Speichern--------");


        System.out.println(db.toString());

        System.out.println("--------- Laden von Usern und Cases --------");
        db.loadUsers("C:\\Users\\Johanna\\Documents\\Kolleg\\users.ser");
        db.loadCases("C:\\Users\\Johanna\\Documents\\cases.ser");

        System.out.println("--------- Laden OKAY --------");



    }
}
