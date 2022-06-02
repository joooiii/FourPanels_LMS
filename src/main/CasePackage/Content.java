package CasePackage;


import validation.Ensurer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Content
{
    private String title;
    private List<Section> sections;

    public Content(String title)
    {
        this.title=title;
        this.sections=new ArrayList<>();
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = Ensurer.ensureNonBlank(title, "Title");
    }

    public List<Section> getSections()
    {
        return sections;
    }

    public void setSections(List<Section> sections)
    {
        this.sections = sections;
    }

    public int getAnzahl()
    {
        return sections.size();
    }

    public void addSection(Section section)
    {
        Ensurer.checkState(!(sections.size() < 8), "Cant add more than 10 sections");
        sections.add(section);
    }

    public boolean deleteSection(Section sec)
    {
        if (!sections.isEmpty() && sections.contains(sec))
        {
            sections.remove(sec);
            return true;
        } else
        {
            System.out.println("Fehler: Section existiert nicht");
            return false;
        }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Number of Sections: %d\n", getAnzahl()));
        for (Section section : sections)
        {
            sb.append(section.toString()).append("\n");
        }
        return sb.toString();
    }

}


