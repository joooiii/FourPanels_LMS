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
            text = scanner.next();
            if(text.equals("q")) break;
            return text;
        }
        scanner.close();
        return "end of Text Section";
    }

}
