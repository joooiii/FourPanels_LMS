package CasePackage;

import java.util.Scanner;

public class TextSection extends Section
{
    private String text;

    public TextSection()
    {
        this.text = addText();
    }


    public String addText()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Emter your Text");
        text = scanner.next();
        scanner.close();
        return text;
    }

}
