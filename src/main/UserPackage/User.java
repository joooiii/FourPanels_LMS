package UserPackage;


import CasePackage.Case;
import KeywordPackage.Keyword;
import validation.Ensurer;

import java.security.Key;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

import static UserPackage.Relationship.relationshipType.*;
// User classe
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
    private List<Keyword.Profession> professionKeywords;
    private List<Keyword.Language> languageKeywords;

    public User(String eMail, String password, Instant createdAt, Instant updatedAt, Personal personal)
    {
        this.userID = count.incrementAndGet();
        this.eMail = Ensurer.ensureEmailValid(eMail);
        this.password = Ensurer.ensurePasswordValid(password);
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.professionKeywords = new ArrayList<Keyword.Profession>();
        this.languageKeywords = new ArrayList<Keyword.Language>();
        this.personal = personal;
        this.social = new Social(new HashMap<>());
        this.score = new Score();
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
        Objects.requireNonNull(other);
        if (!social.getContacts().containsKey(other)) {
            this.social.getContacts().put(other, (outgoing));
            other.social.getContacts().put(this, (incoming));
        } else
            System.out.println("Fehler: User ist bereits befreundet");
    }

    public void acceptRequest(User other)
    {
        Objects.requireNonNull(other);
        if (social.getContacts().containsKey(other)) {
            this.social.getContacts().replace(other, (friended));
            other.social.getContacts().replace(this, (friended));
        } else
            System.out.println("Fehler: Es existiert kein Request");
    }

    public void declineRequest(User other)
    {
        Objects.requireNonNull(other);
        if (social.getContacts().containsKey(other)) {
            this.social.getContacts().remove(other);
            other.social.getContacts().remove(this);
        } else
            System.out.println("Fehler: Es existiert kein Request");
    }

    public void removeFriend(User other)
    {
        Objects.requireNonNull(other);
        if (social.getContacts().containsKey(other)) {
            this.social.getContacts().remove(other);
            other.social.getContacts().remove(this);
        } else
            System.out.println("Fehler: User nicht befreundet");
    }

    public void createCase(String title)
    {
        new Case(this, title);
        this.score.addScore(new ScoreEvent(5, false, "Congratulations! You received 10 points for creating a case!", "Case created!"));
    }

    public void addKeywordProfession(Keyword.Profession keyword)
    {
        this.professionKeywords.add(keyword);
    }

    public void addKeywordLanguage(Keyword.Language keyword)
    {
        this.languageKeywords.add(keyword);
    }

    public String toString()
    {
        return "=======================================================" + "\n" +
                "User-ID: " + userID + "\n" +
                "E-Mail-Address: " + eMail + "\n" +
                "Password: " + "*".repeat(password.length()) + "\n" +
                "Member since: " + createdAt.toString() + "\n" +
                "Last profile update: " + updatedAt.toString() + "\n" +
                "-------------------------------------------------------" + "\n" +
                "Keywords: " + professionKeywords.toString() + languageKeywords.toString() + "\n" +
                "-------------------------------------------------------" + "\n" +
                "Personal Information: " + "\n" + personal.toString() + "\n" +
                "-------------------------------------------------------" + "\n" +
                "Social Information: " + "\n" + social.toString("Friends: ", friended) + "\n" +
                social.toString("Incoming Requests from: ", incoming) + "\n" +
                social.toString("Outgoing Requests to: ", outgoing) + "\n" +
                "-------------------------------------------------------" + "\n"
//                + "Scores: " + score.toString()
                ;
    }

    public String getFirstName(Integer userID)
    {
        return personal.getFirstName();
    }

    public String getLastName(Integer userID)
    {
        return personal.getLastName();
    }

    public void addScore()
    {
        this.score = new ScoreEvent(50, true, "congratulations, you are a genius", "right answer");
    }
}

