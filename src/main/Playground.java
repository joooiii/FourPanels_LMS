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
//
    /*    MediaSection med = new MediaSection(Paths.get("c:\\user\\help.jpeg"), "lululul");
        TextSection txt = new TextSection("Mein Patient hört nicht auf aus seinen Ohren zu bluten Hilfeee!!! ", "OhrenBluten");
        Content con = new Content("AUA");
        TextSection txt2= new TextSection("Wenn er seinen Kopf bewegt fangt es wieder zum Bluten an auch wenn ich die Wunde schon zugenäht habe", "help");
        txt2.addToExcistingSection();
        con.addSection(txt);

        con.addSection(txt2);
//
          con.addSection(med);
//
        System.out.println(con.toString());

//        ScoreEvent sorc = new ScoreEvent(10,'2022-05-25',false,"You voted!", "Points" );*/

        User u = new User("denis@yolo.at", "Password1!", Instant.now(), Instant.now(), new Personal("Denis", "Mehicic", LocalDate.of(1992, 5, 30), "Dr."), new Social(new HashMap<>()), new Score(), new ArrayList<Keyword.Profession>(), new ArrayList<Keyword.Language>());
        User o = new User("ana@yolo.at", "Password1!", Instant.now(), Instant.now(), new Personal("Ana", "Susa", LocalDate.of(1992, 5, 30), "Prim."), new Social(new HashMap<>()), new Score(), new ArrayList<Keyword.Profession>(), new ArrayList<Keyword.Language>());
        User j = new User("jo@yolo.at", "Password1!", Instant.now(), Instant.now(), new Personal("Jo", "Lackner", LocalDate.of(1992, 5, 30), "Prof."), new Social(new HashMap<>()), new Score(), new ArrayList<Keyword.Profession>(), new ArrayList<Keyword.Language>());

        u.addKeywordProfession(Keyword.Profession.ALLGEMEINMEDIZIN);
        u.addKeywordProfession(Keyword.Profession.ALLERGOLOGIE);
        u.addKeywordLanguage(Keyword.Language.DUTCH);

        u.sendRequest(o);
        o.acceptRequest(u);
        j.sendRequest(o);
        o.acceptRequest(j);
        u.sendRequest(j);

        System.out.println(u.toString());
        System.out.println(o.toString());
        System.out.println(j.toString());



    }
}
