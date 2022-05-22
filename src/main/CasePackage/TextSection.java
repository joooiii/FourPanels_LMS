package CasePackage;

import java.util.Scanner;

public class TextSection extends Section
{
    private String text;

    public TextSection(String text)
    {
        this.text = text;
    }


    public String addText()
    {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String s = scanner.next();
            if(s.equals("q")) break;
            return s;
        }
        scanner.close();
        return "end of Text Section";
    }

}
