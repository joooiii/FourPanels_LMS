package CasePackage;

public class Section
{
    private TextSection text;
    private MediaSection media;


    public Section()
    {
        this.text = text;
        this.media = media;
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
