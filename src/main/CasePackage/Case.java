package CasePackage;

import KeywordPackage.Keyword;
import UserPackage.User;

import java.time.Instant;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Case
{
    private Integer ID;
    private Instant createdAt;
    private Instant updatedAt;
    private User owner;
    private HashMap<Integer, User> members;
    private List<Keyword> keywords;
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

    public void setCreatedAt()
    {
        this.createdAt = Instant.now();
    }

    public Instant getUpdatedAt()

    {
        return updatedAt;
    }

    public void setUpdatedAt()
    {
        this.updatedAt = Instant.now(); 
    }

// owner is unser... but we will not to get all user data, but only name, and conutry?
//    maybe inheritange or asociation

// what are the members?
    public HashMap<Integer, User> getMembers()
    {
        return members;
    }

    public void setMembers(HashMap<Integer, User> members)
    {
        this.members = members;
    }

    public List<Keyword> getKeywords()
    {
        return keywords;
    }

    // wie zugreife icn im Keywords...?
    public void setKeywords(List<Keyword> keywords)
    {
        this.keywords=keywords;
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
