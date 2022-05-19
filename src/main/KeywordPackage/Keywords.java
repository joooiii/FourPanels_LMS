package KeywordPackage;

public enum Keywords
{
    ALLGEMEIN_MEDIZIN("allgemeine medizin"),
    INNER_MEDIZIN("inner medizin"),
    CHIRUGIE("chirugie"),
    ANAESTHESIOLOGIE("anaesthesiologie"),
    KINDERMEDIZIN("kindermedizin"),
    RADIOLOGIE("radiologie"),
    AUGENHEILKUNDE("augenheilkunde"),
    NEUROLOGIE("neurologie"),
    H_N_O("hals nasen ohrenheilkunde"),
    UROLOGIE("urologie"),
    HAUTKRANKHEITEN("hautkrankheite"),
    GESCHLECHTSKRANKHEITEN("geschlechtskrankheiten")
    ;


    private final String displayLan;

    Keywords(String displayLan)
    {
        this.displayLan = displayLan;
    }

    public String getDisplayLan()
    {
        return displayLan;
    }
}
