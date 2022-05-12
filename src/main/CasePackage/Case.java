package CasePackage;

import KeywordPackage.Keyword;
import UserPackage.User;

import java.time.Instant;
import java.util.HashMap;
import java.util.List;

public class Case
{
    private String ID;
    private Instant createdAt;
    private Instant updatedAt;
    private User owner;
    private HashMap<String, User> members;
    private List<Keyword> keywords;
    private Voting voting;
    private Content content;

    public Case()
    {

    }

    public String getID()
    {
        return ID;
    }

    public void setID(String ID)
    {
        this.ID = ID;
    }

    public Instant getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt)
    {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt()
    {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public User getOwner()
    {
        return owner;
    }

    public void setOwner(User owner)
    {
        this.owner = owner;
    }

    public HashMap<String, User> getMembers()
    {
        return members;
    }

    public void setMembers(HashMap<String, User> members)
    {
        this.members = members;
    }

    public List<Keyword> getKeywords()
    {
        return keywords;
    }

    public void setKeywords(List<Keyword> keywords)
    {
        this.keywords = keywords;
    }

    public Voting getVoting()
    {
        return voting;
    }

    public void setVoting(Voting voting)
    {
        this.voting = voting;
    }

    public Content getContent()
    {
        return content;
    }

    public void setContent(Content content)
    {
        this.content = content;
    }
}
