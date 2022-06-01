import CasePackage.*;
import KeywordPackage.Keyword;
import UserPackage.*;
import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.Text;

import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDate;
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




    }
}
