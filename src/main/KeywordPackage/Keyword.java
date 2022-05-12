package KeywordPackage;

public class Keyword
{
    private String text;
    private KeywordType type;


    public enum KeywordType
    {

    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }
}
