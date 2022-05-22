package CasePackage;

import KeywordPackage.Keyword;

import java.util.List;
import java.util.Scanner;

public class Content
{
    private String title;
    private List<Section> sections;

    public Content()
    {

    }

    public void addKeywords()
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public List<Section> getSections()
    {
        return sections;
    }

    public void setSections(List<Section> sections)
    {
        this.sections = sections;
    }
}
