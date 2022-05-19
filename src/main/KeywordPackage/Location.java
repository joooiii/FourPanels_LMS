package KeywordPackage;

public enum Location
{
    AUSTRIA("austria"),
    GERMANY("germany"),
    UNITED_KINGDOM("united kingdom"),
    SCOTLAND("scotland"),
    DENMARK("denmark"),
    FINLAND("finland"),
    NORWAY("Norway"),
    SWEDEN("sweden"),
    SWITZERLAND("switzerland"),
    FRANCE("france"),
    ITALY("italy"),
    METHERLANDS("netherlands"),
    MEXICO("mexico"),
    RUSSIA("russia"),
    SPAIN("spain"),
    GREECE("greece")
    ;


    private final String displayLan;

    Location(String displayLan)
    {
        this.displayLan = displayLan;
    }

    public String getDisplayLan()
    {
        return displayLan;
    }
}
