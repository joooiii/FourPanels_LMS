import CasePackage.Content;
import CasePackage.MediaSection;
import CasePackage.Section;
import CasePackage.TextSection;
import KeywordPackage.Keyword;
import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.Text;

public class Playground
{


    public static void main(String[] args)
    {
//        System.out.println(Keyword.Profession.ALLERGOLOGIE);
//
//        System.out.println(Keyword.Symptom.BILIRUBIN_IM_BLUT_DIREKT_ERNIEDRIGT);
//        System.out.println(Keyword.Procedure.DERMIS_FETT_TRANSPLANAT);

//        Section sec1 = new Section();
//        sec1.addTextSection();
//
//        Section sec2 = new Section();
//        sec2.addTextSection();
//
//        Content con = new Content("erster Beitrag");
//
//        con.addSection(sec1);
//        con.addSection(sec2);
//
//        System.out.println(con);
//
//        TextSection text = new TextSection();
//
//        System.out.println(text);

        TextSection txt = new TextSection("Mein Patient hört nicht auf aus seinen Ohren zu bluten Hilfeee!!! ", "OhrenBluten");
        Content con = new Content("AUA");
        TextSection txt2= new TextSection("Wenn er seinen Kopf bewegt fangt es wieder zum Bluten an auch wenn ich die Wunde schon zugenäht habe", "help");
        txt2.addToExcistingSection();
        con.addSection(txt);
        con.addSection(txt2);



        System.out.println(con.toString());
    }
}
