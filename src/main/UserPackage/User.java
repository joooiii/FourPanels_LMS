package UserPackage;


import KeywordPackage.Keyword;
import validation.Ensurer;

import java.time.Instant;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

import static UserPackage.Relationship.relationshipType.*;

public class User
{
    private static final AtomicInteger count = new AtomicInteger(0);
    private Integer userID;
    private String eMail;
    private String password;
    private Instant createdAt;
    private Instant updatedAt;
    private Personal personal;
    private Social social;
    private Score score;
    private HashSet<Keyword> keywords;

    public User(String eMail, String password, Instant createdAt, Instant updatedAt, Personal personal, Social social, Score score)
    {
        this.userID = count.incrementAndGet();
        this.eMail = Ensurer.ensureEmailValid(eMail);
        this.password = Ensurer.ensurePasswordValid(password);
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.personal = personal;
        this.social = social;
        this.score = score;
    }

    public Integer getUserID()
    {
        return userID;
    }

    public void setUserID(Integer userID)
    {
        this.userID = userID;
    }

    public String geteMail()
    {
        return eMail;
    }

    public void seteMail(String eMail)
    {
        this.eMail = Ensurer.ensureEmailValid(eMail);
        this.updatedAt = Instant.now();
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = Ensurer.ensurePasswordValid(password);
        this.updatedAt = Instant.now();
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

    public Personal getPersonal()
    {
        return personal;
    }

    public void setPersonal(Personal personal)
    {
        this.personal = personal;
    }

    public Social getSocial()
    {
        return social;
    }

    public void setSocial(Social social)
    {
        this.social = social;
    }

    public Score getScore()
    {
        return score;
    }

    public void setScore(Score score)
    {
        this.score = score;
    }

    // wird gehandelt durch sendRequest/acceptRequest
//    public void addFriend(User other)
//    {
//        if (!social.getContacts().containsKey(other.getUserID())) {
//            this.social.getContacts().put(other.getUserID(), new Relationship(friended));
//            other.social.getContacts().put(this.getUserID(), new Relationship(friended));
//        } else
//            System.out.println("User bereits befreundet");
//
//    }

    public void sendRequest(User other)
    {
        if (!social.getContacts().containsKey(other.getUserID())) {
            this.social.getContacts().put(other.getUserID(), new Relationship(outgoing));
            other.social.getContacts().put(this.getUserID(), new Relationship(incoming));
        } else
            System.out.println("User ist bereits befreundet");
    }

    public void acceptRequest(User other)
    {
        if (social.getContacts().containsKey(other.getUserID())) {
            this.social.getContacts().replace(other.getUserID(), new Relationship(friended));
            other.social.getContacts().replace(this.getUserID(), new Relationship(friended));
        } else
            System.out.println("Es existiert kein Request");
    }

    public void declineRequest(User other)
    {
        if (social.getContacts().containsKey(other.getUserID())) {
            this.social.getContacts().remove(other.getUserID());
            other.social.getContacts().remove(this.getUserID());
        } else
            System.out.println("Es existiert kein Request");

    }

    public void removeFriend(User other)
    {
        if (social.getContacts().containsKey(other.getUserID())) {
            this.social.getContacts().remove(other.getUserID());
            other.social.getContacts().remove(this.getUserID());
        } else
            System.out.println("User nicht befreundet");

    }
}

