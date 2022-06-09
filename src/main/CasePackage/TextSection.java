package CasePackage;

import validation.Ensurer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class TextSection extends Section
{
    private String text;

    public TextSection(String txt, String title)
    {
        super(title);
        this.text = txt;
    }


//    public String addText()
//    {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Emter your Text");
//        text = scanner.next();
//        scanner.close();
//        return text;
//    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = Ensurer.ensureNonBlank(text, "text");
    }

    public void addToExcistingSection()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("add your text here");

        StringBuilder sb = new StringBuilder();
        sb.append(text + "\n");
        sb.append(sc.nextLine());
        setText(sb.toString());


    }

//    public void addfromtextDocument(String path)
//    {
//        Path filePath = Path.of(path);
//
//        try
//        {
//            text += Files.readString(filePath);
//        } catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//    }

    @Override
    public String toString()
    {
        return super.toString() +
                "\n" + text;
    }
}
