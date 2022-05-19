package KeywordPackage;

public enum Languag
{
    DANISH("danish"),
    CHINESE("chinese"),
    FINNISH("finnish"),
    CZECH("czech"),
    DUTCH("dutch"),
    NORWEGIAN("norwegian"),
    ENGLISH("english"),
    FRENCH("french"),
    GERMAN("german"),
    SWEDISH("swedish"),
    GREEK("greek"),
    HINDI("hindi"),
    ITALIAN("italian"),
    BULGARIAN("bulgarian"),
    JAPANESE("japanese"),
    KOREAN("korean"),
    POLISH("polish"),
    ROMANIAN("romanian"),
    PORTUGUESE("portuguese"),
    RUSSIAN("russian"),
    SPANISH("spanish")
    ;


    private final String displayLan;

    Languag(String displayLan)
    {
        this.displayLan = displayLan;
    }

    public String getDisplayLan()
    {
        return displayLan;
    }
}
