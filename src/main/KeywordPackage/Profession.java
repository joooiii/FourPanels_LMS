package KeywordPackage;

public enum Profession
{
            ALLERGOLOGIE("Allergologie"),
            ALLGEMEINMEDIZIN("Allgemeinmedizin")

    ;


    private final String displayLan;

    Profession(String displayLan)
    {
        this.displayLan = displayLan;
    }

    public String getDisplayLan()
    {
        return displayLan;
    }
}
