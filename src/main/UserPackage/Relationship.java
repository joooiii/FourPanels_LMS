package UserPackage;

public class Relationship
{
    private relationshipType relationshipType;

    public enum relationshipType
    {
        incoming,
        outgoing,
        friended
    }
}
