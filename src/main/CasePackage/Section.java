package CasePackage;

import CasePackage.MediaSection;
import CasePackage.TextSection;

public class Section
{
    private TextSection text;
    private MediaSection media;


    public Section()
    {
    }

    public TextSection getText()
    {
        return text;
    }

    public void setText(TextSection text)
    {
        this.text = text;
    }

    public MediaSection getMedia()
    {
        return media;
    }

    public void setMedia(MediaSection media)
    {
        this.media = media;
    }
}
