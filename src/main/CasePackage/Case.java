package CasePackage;

import KeywordPackage.Keyword;
import UserPackage.User;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Case
{
    private Integer ID;
    private Instant createdAt;
    private Instant updatedAt;
    private User owner;
    private HashMap<Integer, User> members;
    private List<Keyword.Symptom> symptoms;
    private List<Keyword.Procedure> procedures;
    private List<Keyword.Profession> professions;
    private Voting voting;
    private Content content;
    private static final AtomicInteger count = new AtomicInteger(0);

    public Case(User owner, String title)
    {
        this.owner = owner;
        this.content= new Content(title);
        this.ID= count.incrementAndGet();
        this.createdAt= Instant.now();
        this.members = new HashMap<>();
        this.symptoms = new ArrayList<Keyword.Symptom>();
        this.procedures=new ArrayList<Keyword.Procedure>();
        this.professions=new ArrayList<Keyword.Profession>();

    }

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

    //TODO put members
    public void addMember(Integer i, User user)
    {
        members.put(i,user);
    }

// what are the members?
    public HashMap<Integer, User> getMembers()
    {
        return members;
    }

    // list from Users...
    public void setMembers(User user)
    {
        members.put(user.getUserID(), user);
    }

    public List<Keyword.Symptom> getKeywordsSymptoms()
    {
        return symptoms;
    }

    public List<Keyword.Procedure> getKeywordsProcedure()
    {
        return procedures;
    }


    public List<Keyword.Profession> getKeywordsProfession()
    {
        return professions;
    }
    // wie zugreife icn im Keywords...?
    public void setKeywordsProcedure(Keyword.Procedure keyword)
    {
        procedures.add(keyword);
    }

    public void setKeywordsSymptoms(Keyword.Symptom keyword)
    {
        symptoms.add(keyword);
    }
    public void setKeywordProfesions(Keyword.Profession keyword)
    {
        professions.add(keyword);
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


    public String toString()
    {
        return "Title: " + content.getTitle() +"\n"
               + "-".repeat(20) + "\n" +
                getKeywordsProcedure() + "\n"+
                getKeywordsSymptoms() + "\n"+
                getKeywordsProfession() +"\n" +
                 "-".repeat(20);



    }
}
