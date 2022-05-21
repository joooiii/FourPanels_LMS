package CasePackage;

import KeywordPackage.Keywords;
import UserPackage.User;

import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Case
{
    private Integer ID;
    private Instant createdAt;
    private Instant updatedAt;
    private User owner;
    private HashMap<String, User> members;
    private List<Keywords> keywords;
    private Voting voting;
    private Content content;
    private static final AtomicInteger count = new AtomicInteger(0);

//    public Case()
//    {
//
//    }

    public Integer getID()
    {
        return ID;
    }

    public void setID(Integer ID)
    {
        this.ID = count.incrementAndGet();
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

    public List<Keywords> getKeywords()
    {
        return keywords;
    }

    public void setKeywords(List<Keywords> keywords)
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
