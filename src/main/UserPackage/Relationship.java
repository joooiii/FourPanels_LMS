package UserPackage;

public class Relationship
{
    private relationshipType relationshipType;

    public Relationship(Relationship.relationshipType outgoing)
    {
    }

    public enum relationshipType
    {
        incoming,
        outgoing,
        friended
    }
}
