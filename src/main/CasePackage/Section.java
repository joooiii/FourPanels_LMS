package CasePackage;

public class Section
{
    private TextSection text;
    private MediaSection media;


    public Section()
    {

    }

    public void addTextAndMedia(String media)
    {
        text.addText();
        this.media.addNewFile(media);
    }

    public void addTextSection()
    {
        text.addText();
    }

    public void addMediaSection(String media)
    {
        this.media.addNewFile(media);
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
