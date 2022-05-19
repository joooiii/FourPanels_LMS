package UserPackage;

import KeywordPackage.Keyword;

import java.time.Instant;
import java.util.HashSet;

public class User
{
    private Integer userID;
    private String eMail;
    private String password;
    private Instant createdAt;
    private Instant updatedAt;
    private Personal personal;
    private Social social;
    private Score score;
    private HashSet<Keyword> keywords;

    public User(Integer userID, String eMail, String password, Instant createdAt, Instant updatedAt, Personal personal, Social social, Score score)
    {
        this.userID = userID;
        this.eMail = eMail;
        this.password = password;
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
        if (eMail.matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"))
            this.eMail = eMail;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
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

    //TODO add, remove, accept, decline
}

