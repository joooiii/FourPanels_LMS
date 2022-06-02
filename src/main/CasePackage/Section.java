package CasePackage;

import validation.Ensurer;

public class Section
{
    private String secTitle;


    public Section(String secTitle)
    {
        this.secTitle = Ensurer.ensureNonBlank(secTitle, "Title of section");
    }

//    public void addTextAndMedia(String media)
//    {
//        text.addText();
//        this.media.addNewFile(media);
//    }
//
//    public void addTextSection()
//    {
//        text.addText();
//    }
//
//    public void addMediaSection(String media)
//    {
//        this.media.addNewFile(media);
//    }


    public String getSecTitle()
    {
        return secTitle;
    }

    public void setSecTitle(String secTitle)
    {
        this.secTitle = Ensurer.ensureNonBlank(secTitle, "section Title");
    }


    @Override
    public String toString()
    {
        return secTitle;
    }




}
